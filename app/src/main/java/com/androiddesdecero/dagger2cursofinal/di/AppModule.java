package com.androiddesdecero.dagger2cursofinal.di;

import android.app.Application;
import android.content.Context;

import com.androiddesdecero.dagger2cursofinal.iu.login.Login;
import com.androiddesdecero.dagger2cursofinal.iu.login.LoginPresenter;
import com.androiddesdecero.dagger2cursofinal.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

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
    Grafo de Activities
     */
    @Provides
    @Singleton
    Login.Presenter providePresenterLogin(User user){
        return new LoginPresenter(user);
    }

}
