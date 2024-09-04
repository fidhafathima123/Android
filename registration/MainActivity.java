package com.example.registration_page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText lname,fname,password,email,phone,gender,dob;

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
        lname=(EditText)findViewById(R.id.lname);
        password=(EditText) findViewById(R.id.password);
    }

    public void register(View view) {


        String name=lname.getText().toString();
        String pass=password.getText().toString();
        if (name.isEmpty())
            lname.setError("Username empty");
        else if (pass.isEmpty())
            password.setError("Password empty");
        else if (name.equals("Fidha") && pass.equals("123")) {
            Toast.makeText(this,"Register Sucessful", Toast.LENGTH_SHORT).show();
            Intent home = new Intent(MainActivity.this, res.class);
//            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")));
            startActivity(home);
        }
        else
            Toast.makeText(this,"Registration un-sucessful",Toast.LENGTH_LONG).show();
    }

    }
