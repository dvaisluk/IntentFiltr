package com.example.if3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class Change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

    }

    public void onClick(View v) {
        Intent intent = new Intent();
        String attr = "alignment";

        switch(v.getId()) {
            case R.id.leftButton:
                intent.putExtra(attr, Gravity.START);
                break;
            case R.id.rightButton:
                intent.putExtra(attr, Gravity.END);
                break;
            case R.id.centerButton:
                intent.putExtra(attr, Gravity.CENTER);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}


