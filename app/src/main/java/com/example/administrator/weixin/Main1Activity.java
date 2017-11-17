package com.example.administrator.weixin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/11/10.
 */

public class Main1Activity extends AppCompatActivity{

     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
               Intent intent=new Intent(Main1Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
         Button button2=(Button) findViewById(R.id.button2);
         button.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View V){
                 Intent intent=new Intent(Main1Activity.this,LoginActivity.class);
                 startActivity(intent);
             }
         });
    }
}
