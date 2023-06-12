package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtvalleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artvalley);

        Button btn_artvalleyMap = (Button) findViewById(R.id.btn_artvalleyMap);

        btn_artvalleyMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArtvalleyActivity.this, ArtvalleyMap.class);
                startActivity(intent);
            }
        });
    }
}