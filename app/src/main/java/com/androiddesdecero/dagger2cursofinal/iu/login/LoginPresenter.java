package com.androiddesdecero.dagger2cursofinal.iu.login;

import com.androiddesdecero.dagger2cursofinal.model.User;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public class LoginPresenter implements Login.Presenter {

    private Login.View view;

    private User user;

    public LoginPresenter(User user){
        this.user = user;
    }

    @Override
    public void setView(Login.View view) {
        this.view = view;
    }

    @Override
    public void validadUser(String userName, String pass) {
        if(view != null){
            if(userName.equals("alberto")&&pass.equals("1234")){
                user.setUsername("Alberto Palomar");
                user.setEdad("30");
                view.usuarioValido();
            }else{
                view.error();
            }
        }
    }

}
