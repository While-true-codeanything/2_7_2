package com.example.password;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);
        final TextView pass=findViewById(R.id.Passw);
        final TextView log=findViewById(R.id.Login);
        Button but=findViewById(R.id.button);
        final Intent i = new Intent(Registation.this, MainActivity.class);
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("pas", pass.getText().toString());
                i.putExtra("log", log.getText().toString());
                startActivity(i);
            }
        };
        but.setOnClickListener(listener);
    }
}
