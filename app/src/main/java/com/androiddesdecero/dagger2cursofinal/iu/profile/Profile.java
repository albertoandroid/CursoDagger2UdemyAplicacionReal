package com.androiddesdecero.dagger2cursofinal.iu.profile;

import com.androiddesdecero.dagger2cursofinal.model.User;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public interface Profile {

    interface View{
        void showUser(User user);
    }

    interface Presenter{
        void setView(Profile.View view);
        void updateUser(User updateUser);
    }
}
