package com.androiddesdecero.dagger2cursofinal.iu.WebService;

import com.androiddesdecero.dagger2cursofinal.model.User;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public interface WebService {

    interface View{
        void showUser(User user);
    }

    interface Presenter{
        void setView(WebService.View view);
        void solitudWebService();
    }
}
