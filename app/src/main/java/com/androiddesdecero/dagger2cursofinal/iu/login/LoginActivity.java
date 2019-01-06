package com.androiddesdecero.dagger2cursofinal.iu.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.androiddesdecero.dagger2cursofinal.R;
import com.androiddesdecero.dagger2cursofinal.di.BaseApp;
import com.androiddesdecero.dagger2cursofinal.iu.profile.ProfileActivity;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements Login.View {

    private EditText etUser;
    private EditText etPassword;
    private Button btLogin;

    @Inject
    Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((BaseApp)getApplication()).getAppComponent().inject(this);
        setUpView();
    }

    private void setUpView(){
        presenter.setView(this);
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.validadUser(etUser.getText().toString(), etPassword.getText().toString());
            }
        });
    }

    @Override
    public void usuarioValido() {
        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
    }

    @Override
    public void error() {
        Toast.makeText(this, "Usuario no es Valido", Toast.LENGTH_SHORT).show();
    }
}
