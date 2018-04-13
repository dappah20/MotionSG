package com.example.asus.motionsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etext1);
        pass = findViewById(R.id.etext2);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usnm = username.getText().toString(); //hasil getText itu edit table text jadi harus diubah ke string
                String pss = pass.getText().toString();

                if (usnm.equals("iamdaffaa") && pss.equals("yeaaay")){
                    Toast.makeText(MainActivity.this, "Nah gitu Bener!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Salah jancuk!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
