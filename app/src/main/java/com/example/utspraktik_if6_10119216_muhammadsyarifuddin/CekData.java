package com.example.utspraktik_if6_10119216_muhammadsyarifuddin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CekData extends AppCompatActivity {
    Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_data);

        btn = findViewById(R.id.btn_ubah);
        btn2 = findViewById(R.id.btn_hasil);

        btn.setOnClickListener((v)->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        btn2.setOnClickListener((v)->{
            Intent intent = new Intent(this, CustomDialog.class);
            startActivity(intent);
        });
    }
}