package com.example.dptoredes.assd;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

import static android.R.attr.tag;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();




        /*final Button btn = (Button) findViewById(R.id.btnAcerca);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.d("Now Loading", "Segunda pantalla");
                //Intent acerca = new Intent(MainActivity.this, AcercaDe.class);
                //startActivity(acerca);
            }
        });*/

    }

    public void initLogin (View view){
        EditText usua = (EditText) findViewById(R.id.txtUsuario);
        EditText passw = (EditText) findViewById(R.id.txtPass);
        Intent intentLogin = new Intent(MainActivity.this, AcercaDe.class);

        intentLogin.putExtra( "usr", usua.getText()+" ");
        startActivity(intentLogin);
    }

    @Override protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d("Current Location", "Yer in... onStart");

    }

    @Override protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d("Current Location", "Yer in... onResume");
    }

    public void abrirAcerca(View view){
        Log.d("cero", "confirma que si llamo a funcion");
        Intent inte = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0999103524"));
        startActivity(inte);
    }

    @Override protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d("Current Location", "Yer in... onPause");
        super.onPause();
    }

    @Override protected void onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.d("Current Location", "Yer in... onStop");
        super.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.d("Current Location", "Yer in... onRestart");
    }

    @Override protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("Current Location", "Yer in... DESTROY-DESTROY-DESTROY!");
        super.onDestroy();
    }


}
