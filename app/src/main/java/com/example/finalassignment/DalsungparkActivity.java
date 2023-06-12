package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DalsungparkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalsungpark);

        Button btn_dalsungparkMap = (Button) findViewById(R.id.btn_dalsungparkMap);

        btn_dalsungparkMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DalsungparkActivity.this, DalsungparkMap.class);
                startActivity(intent);
            }
        });
    }
}