package com.example.upt.recibirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();


        if (Intent.ACTION_SEND.equals(action) && type != null){
            if ("text/plain".equals(type)){
                /**
                 * manipulacion de la cadena enviada
                 */
                manipularTexto(intent);
            }
        }


    }

    public void manipularTexto(Intent intent){
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null){
            Toast.makeText(MainActivity.this,sharedText,Toast.LENGTH_SHORT).show();
        }
    }

}
