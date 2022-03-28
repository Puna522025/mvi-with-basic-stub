package com.androidmvi.spacex.network.injection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import javax.inject.Inject;

/**
 * This class will have information on various URL for server.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Server {
    @Inject
    public Server(){}

    @JsonProperty("name")
    private String mName;

    @JsonProperty("authUrl")
    private String mAuthUrl;

    @JsonProperty("clientId")
    private String mClientId;

    @JsonProperty("section")
    private String mSection;

    @JsonProperty("code")
    private Integer mCode;

    @JsonProperty("endPointPath")
    private String mEndPointPath;

    public String getName() {
        return mName;
    }

    @NonNull
    public String getAuthUrl() {
        return mAuthUrl;
    }

    @NonNull
    public String getEndPointPath() {
        return mEndPointPath;
    }

    @NonNull
    public String getSection() {
        return mSection;
    }

    @NonNull
    public Integer getCode() {
        return mCode;
    }
}
