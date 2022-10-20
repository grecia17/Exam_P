package com.example.exam_p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1,edt2;
    private Button btin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt_correo);
        edt2 = findViewById(R.id.edt_pass);
        btin = findViewById(R.id.bt_ingresar);
        btin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = edt1.getText().toString();
                String password = edt2.getText().toString();
                Intent intent = new Intent(getApplication(),pest2.class);
                startActivity(intent);
            }
        });
    }
}