package com.androiddesdecero.dagger2cursofinal.iu.WebService;

import android.util.Log;

import com.androiddesdecero.dagger2cursofinal.api.ApiClient;
import com.androiddesdecero.dagger2cursofinal.model.GitHubRepo;
import com.androiddesdecero.dagger2cursofinal.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        view.showUser(user);
    }

    @Override
    public void solitudWebService() {
        Call<List<GitHubRepo>> call = api.getReposForUser("albertoandroid");
        call.enqueue(new Callback<List<GitHubRepo>>() {
            @Override
            public void onResponse(Call<List<GitHubRepo>> call, Response<List<GitHubRepo>> response) {
                for(int i=0; i<response.body().size(); i++){
                    GitHubRepo repo = response.body().get(i);
                    Log.d("TAG1", "Repositorio: " + i + " Nombre: " + repo.getName() +
                    " Avatar: " + repo.getOwner().getAvatarUrl() +
                    " Login: " + repo.getOwner().getLogin());
                }
            }

            @Override
            public void onFailure(Call<List<GitHubRepo>> call, Throwable t) {

            }
        });
     }
}
