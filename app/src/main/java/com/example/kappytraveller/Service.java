package com.example.kappytraveller;
import android.content.Context;
import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;




public class Service {

    final String url = "http://localhost:3000/";

    public interface VolleyResponseListener {
        void onError(String message);

        void onResponse(String response);

        void onResponse(ArrayList<String> arrayList);
    }

    public void serviceDataGetString(Context context, String search, String key,
                                     VolleyResponseListener volleyResponseListener) {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                url + search, null, response -> {
           volleyResponseListener.onResponse(returnStringFromJSONObject(response, search, key));

        }, error ->
                volleyResponseListener.onError("Error found!!!")
        );

        Singleton.getSingleton(context).addToRequestQueue(jsonArrayRequest);
    }

    public void serviceDataGetArrayString(Context context, String search, String key,
                                          VolleyResponseListener volleyResponseListener) {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                url + search, null, response -> {
            volleyResponseListener.onResponse(returnStringArrayFromJsonArray(response, search, key));
        }, error -> {
            volleyResponseListener.onError("Error found!!!");
        });
    }

    static ArrayList<String> returnStringArrayFromJsonArray(JSONArray jsonArray, String search, String key) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if (jsonObject.getString("name").equals(search)) {
                    list.add(jsonObject.getString(key));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    static String returnStringFromJSONObject(JSONArray jsonArray, String search, String key){
        String result = "";
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if(jsonObject.getString("name").equals(search)) {
                    result = jsonObject.getString(key);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
