package com.sens921119.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Volley v;
        setContentView(R.layout.activity_main);

        Button btnOK = (Button)findViewById(R.id.btn_ok);
        //btnOK.setText("확인!!!");


    /*    View.OnClickListener listner = new View.OnClickListener(){

            public void onClick(View v){

            }
        };
        btnOK.setOnClickListener(listner);
        */

        btnOK.setOnClickListener(new View.OnClickListener() {//익명함수

            public void onClick(View v) {
                System.out.println("");
                Log.i("sens921119","하고싶은 말");//inform
                //Log.d("key","");//debug
                //Log.e("key","");//error
                //Log.v("key","");//심각한 정도에 따라서 나누는 등급(key:성격을나타냄)

                Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, joinActivity.class);
                startActivity(intent);


            }
        });
    }
}