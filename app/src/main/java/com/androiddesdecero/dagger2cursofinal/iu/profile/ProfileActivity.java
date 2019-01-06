package com.androiddesdecero.dagger2cursofinal.iu.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androiddesdecero.dagger2cursofinal.R;
import com.androiddesdecero.dagger2cursofinal.di.BaseApp;
import com.androiddesdecero.dagger2cursofinal.iu.WebService.WebServiceActivity;
import com.androiddesdecero.dagger2cursofinal.model.User;

import javax.inject.Inject;

public class ProfileActivity extends AppCompatActivity implements Profile.View {

    private EditText etName;
    private EditText etEdad;
    private TextView tvLogout;
    private Button btNextActivity;
    private Button btUpdate;

    @Inject
    Profile.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ((BaseApp)getApplication()).getAppComponent().inject(this);
        setUpView();
        presenter.setView(this);
    }

    private void setUpView(){
        etName = findViewById(R.id.etName);
        etEdad = findViewById(R.id.etEdad);
        tvLogout = findViewById(R.id.tvLogout);
        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btNextActivity = findViewById(R.id.btNextActivity);
        btNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WebServiceActivity.class));
            }
        });

        btUpdate = findViewById(R.id.btUpdate);
        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setEdad(etEdad.getText().toString());
                user.setUsername(etName.getText().toString());
                presenter.updateUser(user);
            }
        });
    }

    @Override
    public void showUser(User user) {
        etEdad.setText(user.getEdad());
        etName.setText(user.getUsername());
    }
}
