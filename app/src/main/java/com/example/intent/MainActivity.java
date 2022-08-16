package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Object MainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, segundoActivity.class);
        startActivity(siguiente);
    }

    public void Anterior(View view) {
    }
}