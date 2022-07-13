package com.luvris2.multiactivitydatatestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView txtResult = findViewById(R.id.textResult);

        String resultData = getIntent().getStringExtra("dataKey");

        txtResult.setText(resultData);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SubActivity.this, MainActivity.class);
        intent.putExtra("returnData", "This is ReturnData");
        setResult(0, intent);
        super.onBackPressed();
    }
}