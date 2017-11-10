package com.example.administrator.weixin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/11/10.
 */

public class Main1Activity extends AppCompatActivity{
    @Override
    Intent intent=null;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button button=(Button) findViewById(R.id.buttton);
        button.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View V){
                intent=new Intent(Main1Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
