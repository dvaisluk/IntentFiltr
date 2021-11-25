package com.example.if3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void onClick(View v) {
        Intent intent;

        switch(v.getId()) {
            case R.id.colorButton:
                intent = new Intent("com.example.intent.action.color");
                startActivityForResult(intent, 1);
                break;
            case R.id.alignmentButton:
                intent = new Intent("com.example.intent.action.alignment");
                startActivityForResult(intent, 1);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (intent == null) {
            return;
        }
        int color = intent.getIntExtra("color", 0);
        int alignment = intent.getIntExtra("alignment", 0);
        if (color != 0) {
            textView.setTextColor(color);
        }
        if (alignment != 0) {
            textView.setGravity(alignment);
        }
    }

}
