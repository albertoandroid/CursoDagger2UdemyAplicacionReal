package com.androiddesdecero.dagger2cursofinal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public class Owner {

    private String login;

    @SerializedName("avatar_url")
    private String avatarUrl;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
