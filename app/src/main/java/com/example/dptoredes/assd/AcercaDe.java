package com.example.dptoredes.assd;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        TextView usuario = (TextView) findViewById(R.id.txtMessage);
        Intent iReciever = getIntent();

        Bundle bd = iReciever.getExtras();
        String nUser = (String) bd.get("usr");
        usuario.setText(nUser);
    }
}
