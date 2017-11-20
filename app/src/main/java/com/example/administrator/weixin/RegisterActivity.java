package com.example.administrator.weixin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/11/20.
 */

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button=(Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent=new Intent(RegisterActivity.this,RegistersuccessActivity.class);
                startActivity(intent);
            }
        });
    }
}
