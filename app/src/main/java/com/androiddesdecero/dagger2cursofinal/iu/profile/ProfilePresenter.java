package com.androiddesdecero.dagger2cursofinal.iu.profile;

import com.androiddesdecero.dagger2cursofinal.model.User;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public class ProfilePresenter implements Profile.Presenter {

    private User user;
    private Profile.View view;

    public ProfilePresenter(User user){
        this.user = user;
    }

    @Override
    public void setView(Profile.View view) {
        this.view = view;
        view.showUser(user);
    }

    @Override
    public void updateUser(User updateUser) {
        user.setUsername(updateUser.getUsername());
        user.setEdad(updateUser.getEdad());
    }
}
