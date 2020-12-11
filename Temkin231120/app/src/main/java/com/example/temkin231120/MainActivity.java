package com.example.temkin231120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText login, pass;
    TextView lp;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.editTextLogin);
        pass = findViewById(R.id.editTextPass);
        lp = findViewById(R.id.textViewLP);

        if (savedInstanceState != null) {
            s = savedInstanceState.getString("str");
            lp.setText(s);
        }
    }

    public void onButtonClick(View v) {
        s = login.getText().toString() + " " + pass.getText().toString();
        lp.setText(s);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("str", s);
        super.onSaveInstanceState(bundle);
    }
}