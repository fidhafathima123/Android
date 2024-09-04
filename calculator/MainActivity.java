package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        t1 = (TextView) findViewById(R.id.t1);
    }

    public void add(View view) {
        Double et1=Double.parseDouble(e1.getText().toString());
        Double et2=Double.parseDouble(e2.getText().toString());
        Double add = et1+et2;
        t1.setText(Double.toString(add));
    }

    public void sub(View view) {
        Double et1=Double.parseDouble(e1.getText().toString());
        Double et2=Double.parseDouble(e2.getText().toString());
        Double sub= et1-et2;
        t1.setText(Double.toString(sub));
    }

    public void Mul(View view) {
        Double et1=Double.parseDouble(e1.getText().toString());
        Double et2=Double.parseDouble(e2.getText().toString());
        Double Mul= et1*et2;
        t1.setText(Double.toString(Mul));

    }

    public void Div(View view) {
        Double et1=Double.parseDouble(e1.getText().toString());
        Double et2=Double.parseDouble(e2.getText().toString());
        Double Div= et1/et2;
        t1.setText(Double.toString(Div));

    }
}