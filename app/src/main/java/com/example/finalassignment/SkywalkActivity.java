package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkywalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skywalk);

        Button btn_skywalkMap = (Button) findViewById(R.id.btn_skywalkMap);

        btn_skywalkMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkywalkActivity.this, SkywalkMap.class);
                startActivity(intent);
            }
        });
    }
}