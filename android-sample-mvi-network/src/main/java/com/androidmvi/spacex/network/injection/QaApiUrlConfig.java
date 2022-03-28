package com.androidmvi.spacex.network.injection;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class QaApiUrlConfig {

    private String mName = "Stub name";
    private String mAuthBaseUrl = "https://stub-auth";

    @Inject
    public QaApiUrlConfig(@NonNull final Server server) {
        mName = server.getName();
        mAuthBaseUrl = server.getAuthUrl();
    }

    public String getName() {
        return mName;
    }

    public String getAuthBaseUrl() {
        return mAuthBaseUrl;
    }
}
