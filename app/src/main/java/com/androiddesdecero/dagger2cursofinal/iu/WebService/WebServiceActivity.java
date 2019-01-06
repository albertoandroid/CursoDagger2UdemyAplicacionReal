package com.androiddesdecero.dagger2cursofinal.iu.WebService;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androiddesdecero.dagger2cursofinal.R;

import org.w3c.dom.Text;

public class WebServiceActivity extends AppCompatActivity {

    private Button btVolverAProfile;
    private Button btHacerPeticionWeb;
    private TextView tvUserName;
    private TextView tvEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_service);

        setUpView();
    }

    private void setUpView(){
        tvUserName = findViewById(R.id.tvUserName);
        tvEdad = findViewById(R.id.tvEdad);

        btVolverAProfile = findViewById(R.id.btVolverAProfile);
        btVolverAProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btHacerPeticionWeb = findViewById(R.id.btHacerPeticionWeb);
        btHacerPeticionWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
