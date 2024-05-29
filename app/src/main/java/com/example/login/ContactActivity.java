package com.example.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView location, phone, email;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        location = findViewById(R.id.tv_location);
        phone = findViewById(R.id.tv_phone);
        email = findViewById(R.id.tv_email);

        location.setOnClickListener(this);
        phone.setOnClickListener(this);
        email.setOnClickListener(this);



        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_location) {
            Intent loc = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("google.navigation:q=" + location.getText().toString()));
            startActivity(loc);
        } else if (v.getId() == R.id.tv_email) {
            Intent mail = new Intent(Intent.ACTION_SENDTO,
                    Uri.fromParts("mailto", email.getText().toString(), null));
            mail.putExtra(Intent.EXTRA_SUBJECT,"Subjek");
            mail.putExtra(Intent.EXTRA_TEXT,"Isi Pesan");
            startActivity(mail);
        } else if (v.getId() == R.id.tv_phone) {
            Intent call = new Intent(Intent.ACTION_DIAL);
            call.setData(Uri.parse("tel:" + phone.getText().toString()));
            startActivity(call);
        }
    }
}