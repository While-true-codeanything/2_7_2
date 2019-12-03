package com.example.password;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static private String login="basic";
    static private String password="aaa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView pass=findViewById(R.id.editText);
        final TextView log=findViewById(R.id.editText2);
        final TextView result=findViewById(R.id.textView4);
        Button but=findViewById(R.id.button);
        final Intent i = new Intent(MainActivity.this, Registation.class);
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(log.getText().toString());
                if((pass.getText().toString()==password)&&(log.getText().toString()==login)) result.setText("Вы вошли");
                    else startActivity(i);



            }
        };
        but.setOnClickListener(listener);
        password = getIntent().getStringExtra("pas");
        login = getIntent().getStringExtra("log");
        log.setText(getIntent().getStringExtra("log"));


    }
}
