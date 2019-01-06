package com.androiddesdecero.dagger2cursofinal.di;

import com.androiddesdecero.dagger2cursofinal.iu.login.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(LoginActivity loginActivity);
}
