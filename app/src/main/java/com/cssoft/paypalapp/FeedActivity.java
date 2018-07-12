package com.cssoft.paypalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.cssoft.paypalapp.model.Feed;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.gson.Gson;

import java.util.Arrays;

public class FeedActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);



        new GraphRequest(
                AccessToken.getCurrentAccessToken(),
                "me?fields=email,posts{caption,message,full_picture}",
                null,
                HttpMethod.GET,
                new GraphRequest.Callback() {
                    public void onCompleted(GraphResponse response) {

                        Gson gson = new Gson();
                        Feed feed=gson.fromJson(response.getRawResponse(),Feed.class);

                        ListView listView=findViewById(R.id.listView);
                        MyBaseAdapter adapter=new MyBaseAdapter(FeedActivity.this,feed);
                        listView.setAdapter(adapter);


                    }
                }
        ).executeAsync();


    }


}
