package com.example.login;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SimpleListActivity extends AppCompatActivity {


    ListView simpleListView;
    ArrayList arr_mahasiswa;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_simple_list);

        simpleListView = findViewById(R.id.simpleListView);

        arr_mahasiswa = new ArrayList();
        arr_mahasiswa.add("Rayhan");
        arr_mahasiswa.add("Danil");
        arr_mahasiswa.add("Marsenda");
        arr_mahasiswa.add("Reza");
        arr_mahasiswa.add("Yuni");
        arr_mahasiswa.add("Syafiq");
        arr_mahasiswa.add("Heri");
        arr_mahasiswa.add("Dayat");
        arr_mahasiswa.add("Ikram");
        arr_mahasiswa.add("Rally");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr_mahasiswa);
        simpleListView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}