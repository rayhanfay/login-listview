package com.example.login;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list);

        listView = findViewById(R.id.customListView);
        ArrayList<ModelMahasiswa> listMahasiswa = new ArrayList<>();

        listMahasiswa.add(new ModelMahasiswa(R.drawable.hasfii, "Hasfi", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.heri, "Heri", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.ikram, "Ikram", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.irmayuni, "Irmayuni", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.izza, "Izza", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.marsenda, "Marsenda", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.rally, "Rally", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.rezasajidin, "Reza", "1234"));
        listMahasiswa.add(new ModelMahasiswa(R.drawable.roza, "Roza", "1234"));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.singe_list, listMahasiswa);
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.customListView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
