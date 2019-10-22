package com.edu.huatec.myapplication1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






       Button button= findViewById(R.id.bt);
       editText1=findViewById(R.id.et1);
       editText2=findViewById(R.id.et2);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               SharedPreferences preferences=getSharedPreferences("huoqu",MODE_PRIVATE);
               SharedPreferences.Editor editor=preferences.edit();
               String in1=editText1.getText().toString();
               String in2=editText2.getText().toString();

              editor.putString("mima",in1);
              editor.putString("zhanghao",in2);
              editor.apply();


               Intent intent=new Intent(MainActivity.this,Adactivity.class);

               startActivity(intent);

           }

       });
    }
}
