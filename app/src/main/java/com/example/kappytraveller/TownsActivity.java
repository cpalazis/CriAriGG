package com.example.kappytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class TownsActivity extends AppCompatActivity {
    private ArrayList<ImageView> imageCityName = new ArrayList<>();
    private ArrayList<Button> buttonCityName = new ArrayList<>();

    public TownsActivity() {
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_towns);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageCityName.add(findViewById(R.id.imagePopular1));
        imageCityName.add(findViewById(R.id.imagePopular2));
        imageCityName.add(findViewById(R.id.imagePopular3));
        imageCityName.add(findViewById(R.id.imagePopular4));
        imageCityName.add(findViewById(R.id.imagePopular5));

        buttonCityName.add(findViewById(R.id.buttonPopular1));
        buttonCityName.add(findViewById(R.id.buttonPopular2));
        buttonCityName.add(findViewById(R.id.buttonPopular3));
        buttonCityName.add(findViewById(R.id.buttonPopular4));
        buttonCityName.add(findViewById(R.id.buttonPopular5));




    }
//    private void getAllSights(){
//        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
//        ObjectMapper mapper = new ObjectMapper();
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url("http://localhost:3000/sights")
//                .build(); // defaults to GET
//        Response response = null;
//        try {
//            response = client.newCall(request).execute();
//            JSONObject localResponse = ResponseToJSON(response.body().string());
//            serializeResponse(localResponse);
//        } catch (IOException | JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void serializeResponse(JSONObject allData) throws JSONException {
//        JSONObject cities = new JSONObject(allData.get("sights").toString());
//        JSONArray citiesArray = new JSONArray(cities.get("sights").toString());
//
//        for (int i = 0; i<6; i++){
//            JSONObject singleCity = new JSONObject(citiesArray.get(i).toString());
//
//            ArrayList<String> singleCityName = new ArrayList();
//            singleCityName.add(singleCity.getString("city"));
//        }
//    }
//
//    private JSONObject ResponseToJSON(String bodyData) throws JSONException {
//        JSONObject jsonObj = new JSONObject(bodyData.toString());
//        return jsonObj;
//    }
}