package com.example.publigithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button uno, dos;
    private ImageView imagenMicro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno=(Button) findViewById(R.id.boton1);
        dos=(Button) findViewById(R.id.boton2);

        imagenMicro=(ImageView)findViewById(R.id.imgmic);

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        imagenMicro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.boton1:
                Toast.makeText(getApplicationContext(),"boton 1",Toast.LENGTH_LONG).show();
                break;
            case R.id.boton2:
                Toast.makeText(getApplicationContext(),"boton 2",Toast.LENGTH_LONG).show();
                break;
            case R.id.imgmic:
                Toast.makeText(getApplicationContext(),"el imageview",Toast.LENGTH_LONG).show();break;

        }


    }
}