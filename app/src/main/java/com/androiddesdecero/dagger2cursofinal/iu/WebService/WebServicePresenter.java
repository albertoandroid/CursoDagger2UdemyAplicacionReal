package com.androiddesdecero.dagger2cursofinal.iu.WebService;

import com.androiddesdecero.dagger2cursofinal.api.ApiClient;
import com.androiddesdecero.dagger2cursofinal.model.User;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public class WebServicePresenter implements WebService.Presenter {

    private User user;
    private ApiClient api;
    private WebService.View view;

    public WebServicePresenter(User user, ApiClient apiClient){
        this.user = user;
        this.api = apiClient;
    }

    @Override
    public void setView(WebService.View view) {
        this.view = view;
    }

    @Override
    public void solitudWebService() {

    }
}
