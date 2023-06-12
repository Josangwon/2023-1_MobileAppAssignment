package com.example.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_id = findViewById(R.id.tv_id);
        Button btn_skywalk = (Button) findViewById(R.id.btn_skywalk);
        Button btn_dalsungpark = (Button) findViewById(R.id.btn_dalsungpark);
        Button btn_susungpond = (Button) findViewById(R.id.btn_susungpond);
        Button btn_hwadamforest = (Button) findViewById(R.id.btn_hwadamforest);
        Button btn_birchforest = (Button) findViewById(R.id.btn_birchforest);
        Button btn_artvalley = (Button) findViewById(R.id.btn_artvalley);

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        tv_id.setText(id+"님 반갑습니다.");

        btn_skywalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SkywalkActivity.class);
                startActivity(intent);
            }
        });

        btn_dalsungpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DalsungparkActivity.class);
                startActivity(intent);
            }
        });

        btn_susungpond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SusungpondActivity.class);
                startActivity(intent);
            }
        });

        btn_hwadamforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HwadamforestActivity.class);
                startActivity(intent);
            }
        });

        btn_birchforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BirchforestActivity.class);
                startActivity(intent);
            }
        });

        btn_artvalley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArtvalleyActivity.class);
                startActivity(intent);
            }
        });
    }
}
