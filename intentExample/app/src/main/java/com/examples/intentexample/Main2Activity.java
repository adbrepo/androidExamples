package com.examples.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    public TextView txtInvitado;
    public String textoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtInvitado = findViewById(R.id.txt_invitado);

        textoRecibido = getIntent().getStringExtra("TEXTOINGRESADO");
        txtInvitado.setText(textoRecibido);


    }
}
