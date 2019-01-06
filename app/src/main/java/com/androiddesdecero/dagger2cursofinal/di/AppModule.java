package com.androiddesdecero.dagger2cursofinal.di;

import android.app.Application;
import android.content.Context;

import com.androiddesdecero.dagger2cursofinal.api.ApiClient;
import com.androiddesdecero.dagger2cursofinal.iu.login.Login;
import com.androiddesdecero.dagger2cursofinal.iu.login.LoginPresenter;
import com.androiddesdecero.dagger2cursofinal.iu.profile.Profile;
import com.androiddesdecero.dagger2cursofinal.iu.profile.ProfilePresenter;
import com.androiddesdecero.dagger2cursofinal.model.User;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContex(){
        return application;
    }

    /*
    User
     */

    @Provides
    @Singleton
    public User provideUser(){
        return new User();
    }

    /*
    Grafo de Retrofit
     */
    private static final String BASE_URL = "https://api.github.com";

    @Singleton
    @Provides
    GsonConverterFactory providesGsonConverterFactory(){
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        return gsonConverterFactory;
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converterFactory){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(converterFactory)
                .client(client)
                .build();
    }

    @Singleton
    @Provides
    ApiClient provideApiCliente(Retrofit retrofit){
        return retrofit.create(ApiClient.class);
    }

    /*
    Grafo de Activities
     */
    @Provides
    @Singleton
    Login.Presenter providePresenterLogin(User user){
        return new LoginPresenter(user);
    }

    @Provides
    @Singleton
    Profile.Presenter providesPresenterProfile(User user){
        return new ProfilePresenter(user);
    }

}
