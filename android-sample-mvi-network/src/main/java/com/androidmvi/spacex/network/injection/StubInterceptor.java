package com.androidmvi.spacex.network.injection;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.androidmvi.spacex.network.Constants;
import com.androidmvi.spacex.network.UtilitiesNetwork;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class StubInterceptor implements Interceptor {
    private static final String JSON = ".json";
    private static final String SUCCESS_JSON = "/200.json";
    private static final String DEFAULT_PATH = "default";
    private static final String SCENARIOS_PATH = "scenarios";
    private static final String MEDIA_TYPE = "application/json; charset=utf-8";
    private static final int SUCCESS_CODE = 200;
    private static final int STUB_DELAY = 2000;

    private SharedPreferences mPreference;
    private Context mContext;

    public StubInterceptor(SharedPreferences sharedPreferences,
                           Context context) {
        mPreference = sharedPreferences;
        mContext = context;
    }

    @Override
    public Response intercept(@NonNull Chain chain) {
        return sendRequest(chain.request());
    }

    private Response sendRequest(Request request) {
        final String selectedServer = mPreference.getString
                (Constants.SELECTED_ENVIRONMENT_SERVER, Constants.EMPTY);
        final Server server;
        try {
            server = new ObjectMapper().readValue(selectedServer, Server.class);
            final String apiPath = request.url().encodedPath();

            //Check if the selected request is the same as the stub selected.
            if (apiPath.equalsIgnoreCase(server.getEndPointPath())) {
                return getStubResponse(request, server);
            } else {
                return getDefaultResponse(request);
            }
        } catch (IOException e) {
            Log.e("",e.getLocalizedMessage());
        }
        return null;
    }

    private Response getDefaultResponse(Request request) {
        final String apiPath = request.url().encodedPath();
        final String path = apiPath.concat(SUCCESS_JSON);
        final String defaultPath = DEFAULT_PATH.concat(path);

        try {
            //Adding a delay for all the stubs requests
            Thread.sleep(STUB_DELAY);
            return new Response.Builder()
                    .request(request)
                    .protocol(Protocol.HTTP_1_1)
                    .code(SUCCESS_CODE)
                    .message("")
                    .body(ResponseBody.create(
                            MediaType.get(MEDIA_TYPE),
                            UtilitiesNetwork.Companion.readAssetAsString(defaultPath, mContext)
                    )).build();
        } catch (IOException | InterruptedException e) {
            Log.e("",e.getLocalizedMessage());
        }
        return null;
    }

    private Response getStubResponse(@NonNull final Request request,
                                     @NonNull final Server server) {
        final String apiPath = request.url().encodedPath();
        final String path = apiPath.concat(Constants.SLASH)
                .concat(server.getSection())
                .concat(Constants.SLASH)
                .concat(String.valueOf(server.getCode()))
                .concat(JSON);
        final String scenarioPath = SCENARIOS_PATH.concat(path);

        try {
            //Adding a delay for all the stubs requests
            Thread.sleep(STUB_DELAY);
            return new Response.Builder()
                    .request(request)
                    .protocol(Protocol.HTTP_1_1)
                    .code(server.getCode())
                    .message("")
                    .body(ResponseBody.create(
                            MediaType.get(MEDIA_TYPE),
                            UtilitiesNetwork.Companion.readAssetAsString(scenarioPath, mContext)
                    )).build();
        } catch (IOException | InterruptedException e) {
            Log.e("",e.getLocalizedMessage());
        }
        return null;
    }
}

