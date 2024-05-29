package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button btnMahasiswaTIA, btnMahasiswaTIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnMahasiswaTIA = findViewById(R.id.btnMahasiswaTIA);
        btnMahasiswaTIB = findViewById(R.id.btnMahasiswaTIB);

        btnMahasiswaTIA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    Intent intent1 = new Intent(MainActivity.this, SimpleListActivity.class);
                    startActivity(intent1);
                    Toast.makeText(MainActivity.this, "Simple List Activity", Toast.LENGTH_SHORT).show();

            }
        });

        btnMahasiswaTIB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(MainActivity.this, CustomListActivity.class);
                startActivity(intent2);
                Toast.makeText(MainActivity.this,"Custom list Activity",Toast.LENGTH_SHORT).show();

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}