package com.androiddesdecero.dagger2cursofinal.iu.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androiddesdecero.dagger2cursofinal.R;

public class ProfileActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etEdad;
    private TextView tvLogout;
    private Button btNextActivity;
    private Button btUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setUpView();
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

            }
        });

        btUpdate = findViewById(R.id.btUpdate);
        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
