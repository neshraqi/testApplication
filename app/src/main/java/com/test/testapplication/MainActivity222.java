package com.test.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import hami.mainapp.MainActivity;
import hami.mainapp.Request;

//import hami.mainapp.MainActivity;

public class MainActivity222 extends AppCompatActivity {

    TextView tv_test;

    LinearLayout fragment,ll_flight ,ll_bus, ll_train, ll_hotel ,ll_tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layer5);

        ll_flight = (LinearLayout) findViewById(R.id.ll_flight);
        ll_bus = (LinearLayout) findViewById(R.id.ll_bus);
        ll_train = (LinearLayout) findViewById(R.id.ll_train);
        ll_hotel = (LinearLayout) findViewById(R.id.ll_hotel);
        ll_tour = (LinearLayout) findViewById(R.id.ll_tour);
        fragment = (LinearLayout) findViewById(R.id.fragment);
//        Request request = new Request("MHD","IKA","2018-09-03","2018-09-03");
//
//        Intent intent= new Intent(MainActivity222.this, MainActivity.class);
//        intent.putExtra(Request.class.getName(),request);
//        startActivity(intent);

//        tv_test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
                Intent a= new Intent(MainActivity222.this, MainActivity.class);
                startActivity(a);
//            }
//        });

       // com.github.neshraqi
      //  hami.mainapp.MainActivity.

    }


}
