package com.androiddesdecero.dagger2cursofinal.iu.login;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public interface Login {

    interface View{
        void usuarioValido();
        void error();
    }

    interface Presenter{
        void setView(Login.View view);
        void validadUser(String user, String pass);
    }
}
