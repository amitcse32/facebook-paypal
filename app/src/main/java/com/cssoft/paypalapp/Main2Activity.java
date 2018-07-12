package com.cssoft.paypalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.quickblox.core.QBEntityCallback;
import com.quickblox.core.exception.QBResponseException;
import com.quickblox.customobjects.QBCustomObjects;
import com.quickblox.customobjects.model.QBCustomObject;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void saveData(View v)
    {
        QBCustomObject object=new QBCustomObject();
        object.putInteger("empid",1);
        object.putString("empname","Amit Sharma");
        object.putString("empadd","#234234");
        object.putInteger("empsal",1237);






    }
}
