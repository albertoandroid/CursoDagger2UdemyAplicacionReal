package com.androiddesdecero.dagger2cursofinal.api;

import com.androiddesdecero.dagger2cursofinal.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public interface ApiClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> getReposForUser(@Path("user")String user);
}
