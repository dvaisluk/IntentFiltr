package com.example.if3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ColorAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }
    public void onClick(View v) {
        Intent intent = new Intent();
        String attr = "color";

        switch(v.getId()) {
            case R.id.redButton:
                intent.putExtra(attr, Color.RED);
                break;
            case R.id.greenButton:
                intent.putExtra(attr, Color.GREEN);
                break;
            case R.id.blueButton:
                intent.putExtra(attr, Color.BLUE);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}

