package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SusungpondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_susungpond);

        Button btn_susungpondMap = (Button) findViewById(R.id.btn_susungpondMap);

        btn_susungpondMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SusungpondActivity.this, SusungpondMap.class);
                startActivity(intent);
            }
        });
    }
}