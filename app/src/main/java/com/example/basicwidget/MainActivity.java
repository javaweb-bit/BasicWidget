package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //  btnVisible, btnGone, btnInvisible
        findViewById(R.id.btnVisible).setOnClickListener(this);
        findViewById(R.id.btnGone).setOnClickListener(this);
        findViewById(R.id.btnInvisible).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int buttonId = v.getId();

        if (buttonId == R.id.btnVisible) {
            textView.setVisibility(View.VISIBLE);
        } else if (buttonId == R.id.btnGone) {
            textView.setVisibility(View.GONE);
        } else if (buttonId == R.id.btnInvisible) {
            textView.setVisibility(View.INVISIBLE);
        }
    }
}