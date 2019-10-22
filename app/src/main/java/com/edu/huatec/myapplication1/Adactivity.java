package com.edu.huatec.myapplication1;

import android.app.AppComponentFactory;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Adactivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adactivity_main);


        textView=findViewById(R.id.tv3);

        SharedPreferences sp=getSharedPreferences("huoqu",MODE_PRIVATE);

        String string =sp.getString("mima","");
        String string2 =sp.getString("zhanghao","");


        textView.setText("你的密码是："+string+"     你的账号是："+string2);





    }
}
