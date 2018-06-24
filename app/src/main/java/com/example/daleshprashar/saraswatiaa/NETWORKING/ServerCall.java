package com.example.daleshprashar.saraswatiaa.NETWORKING;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ServerCall extends AppCompatActivity {

    private static final String X_URL ="http://192.168.0.24:8080/login";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    private void jsonArrayCall()
    {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, X_URL, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("aaa", response.toString());


                        try {

                            for (int i = 0; i < response.length(); i++) {
                                JSONObject c = response.getJSONObject(0);
                                JSONObject d = response.getJSONObject(1);
                                JSONObject e = response.getJSONObject(2);

                                String nameX = c.getString("name");
                                String nameY = d.getString("name");
                                String nameZ = e.getString("name");


                              //  textView.setText(nameX);
                              //  textView2.setText(nameY);
                               // textView3.setText(nameZ);


                            }
                        } catch (JSONException e) {
                            e.printStackTrace();

                            Toast.makeText(getApplicationContext(),
                                    "Error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();

                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {


                        Toast.makeText(getApplicationContext(),
                                "Error: " + error.getMessage(),
                                Toast.LENGTH_LONG).show();


                    }
                }


        );
        VolleySingleton.getInstance(this).addToRequestQueue(jsonArrayRequest);


    }


    private void jsonObjectCall() {
        {
            JsonObjectRequest jsonObjReq = new JsonObjectRequest(
                    Request.Method.GET,
                    X_URL, null,
                    new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {


/*
whole response is gonna come in jsonarray

jsonArray jA = new JsonArray(response);
jsonobject jo =
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject c = contacts.getJSONObject(0);

                            String nameX = c.getString("name");


 */

                            Log.d("aaa", response.toString());

                            try {
                                // Parsing json object response
                                // response will be a json object
                                String name = response.getString("name");
                                String email = response.getString("email");
                                JSONObject phone = response.getJSONObject("phone");
                                String home = phone.getString("home");
                                String mobile = phone.getString("mobile");

                                // textView.setText(name);

                            } catch (JSONException e) {
                                e.printStackTrace();
                                Toast.makeText(getApplicationContext(),
                                        "Error: " + e.getMessage(),
                                        Toast.LENGTH_LONG).show();
                            }


                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    VolleyLog.d("aaa", "Error: " + error.getMessage());
                    Toast.makeText(getApplicationContext(),
                            error.getMessage(), Toast.LENGTH_SHORT).show();
                    // hide the progress dialog
                }
            });
        }

    }
}

