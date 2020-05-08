package com.ort.objectexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ort.objectexample.models.User;

public class MainActivity extends AppCompatActivity {

    private User usuarioDePrueba;

    private TextView cartel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartel = findViewById(R.id.txt_cartel);

        usuarioDePrueba = new User("Mica","20000000");

        cartel.setText(usuarioDePrueba.getName() + " " + usuarioDePrueba.getDni());

        usuarioDePrueba.setDni("123456789");

        cartel.setText(usuarioDePrueba.getName() + " " + usuarioDePrueba.getDni());

    }
}
