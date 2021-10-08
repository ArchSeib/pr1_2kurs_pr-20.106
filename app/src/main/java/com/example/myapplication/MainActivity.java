package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button perehod = (Button) findViewById(R.id.perehod);
        View.OnClickListener Sob_Perehod = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent Sobitie = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(Sobitie);
            }
        };
        perehod.setOnClickListener(Sob_Perehod);
    }
}