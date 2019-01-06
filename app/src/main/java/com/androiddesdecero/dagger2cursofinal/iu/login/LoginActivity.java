package com.androiddesdecero.dagger2cursofinal.iu.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.androiddesdecero.dagger2cursofinal.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etUser;
    private EditText etPassword;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setUpView();
    }

    private void setUpView(){
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
