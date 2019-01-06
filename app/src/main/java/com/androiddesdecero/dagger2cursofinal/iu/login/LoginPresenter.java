package com.androiddesdecero.dagger2cursofinal.iu.login;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public class LoginPresenter implements Login.Presenter {

    private Login.View view;

    public LoginPresenter(){

    }

    @Override
    public void setView(Login.View view) {
        this.view = view;
    }

    @Override
    public void validadUser(String userName, String pass) {
        if(view != null){
            if(userName.equals("alberto")&&pass.equals("1234")){
                view.usuarioValido();
            }else{
                view.error();
            }
        }
    }

}
