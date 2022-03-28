package com.androidmvi.spacex.ui.viewmodel;

import androidx.annotation.Nullable;

import com.androidmvi.spacex.network.injection.Server;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
/**
 * Environment entity.
 * This will have List of servers for the environments.
 */
public class Environment {

    @JsonProperty("name")
    private String mName;

    @JsonProperty("path")
    private String mPath;

    @JsonProperty("method")
    private String mMethod;

    @JsonProperty("servers")
    private List<Server> mServers;

    public List<Server> getServers() {
        return mServers;
    }

    public String getName() {
        return mName;
    }

    @Nullable
    public Server getNamedServer(String name) {
        for (Server server : mServers) {
            if (name.equalsIgnoreCase(server.getName())) {
                return server;
            }
        }
        return null;
    }
}
