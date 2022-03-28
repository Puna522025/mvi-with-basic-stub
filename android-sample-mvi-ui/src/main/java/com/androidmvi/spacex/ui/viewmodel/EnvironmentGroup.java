package com.androidmvi.spacex.ui.viewmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * This module contains test of environments.
 */
public class EnvironmentGroup {

    @JsonProperty("name")
    private String mName;

    @JsonProperty("environments")
    private List<Environment> mEnvironments;

    public String getName() {
        return mName;
    }

    public List<Environment> getEnvironments() {
        return mEnvironments;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public void setEnvironments(List<Environment> mEnvironments) {
        this.mEnvironments = mEnvironments;
    }
}
