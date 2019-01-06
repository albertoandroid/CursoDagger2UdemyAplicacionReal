package com.androiddesdecero.dagger2cursofinal.iu.WebService;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androiddesdecero.dagger2cursofinal.R;
import com.androiddesdecero.dagger2cursofinal.di.BaseApp;
import com.androiddesdecero.dagger2cursofinal.iu.profile.ProfileActivity;
import com.androiddesdecero.dagger2cursofinal.model.User;

import org.w3c.dom.Text;

import javax.inject.Inject;

public class WebServiceActivity extends AppCompatActivity implements WebService.View {

    private Button btVolverAProfile;
    private Button btHacerPeticionWeb;
    private TextView tvUserName;
    private TextView tvEdad;

    @Inject
    WebService.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_service);
        ((BaseApp)getApplication()).getAppComponent().inject(this);
        setUpView();
        presenter.setView(this);
    }

    private void setUpView(){
        tvUserName = findViewById(R.id.tvUserName);
        tvEdad = findViewById(R.id.tvEdad);

        btVolverAProfile = findViewById(R.id.btVolverAProfile);
        btVolverAProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });

        btHacerPeticionWeb = findViewById(R.id.btHacerPeticionWeb);
        btHacerPeticionWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.solitudWebService();
            }
        });
    }

    @Override
    public void showUser(User user) {
        tvUserName.setText(user.getEdad());
        tvEdad.setText(user.getEdad());
    }
}
