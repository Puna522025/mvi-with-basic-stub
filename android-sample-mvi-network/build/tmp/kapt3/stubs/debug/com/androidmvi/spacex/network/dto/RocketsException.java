package com.androidmvi.spacex.network.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/androidmvi/spacex/network/dto/RocketsException;", "", "error", "Lcom/androidmvi/spacex/network/dto/ErrorResponse;", "(Lcom/androidmvi/spacex/network/dto/ErrorResponse;)V", "getError", "()Lcom/androidmvi/spacex/network/dto/ErrorResponse;", "Companion", "android-sample-mvi-network_debug"})
public final class RocketsException {
    @org.jetbrains.annotations.NotNull()
    private final com.androidmvi.spacex.network.dto.ErrorResponse error = null;
    private static final com.androidmvi.spacex.network.dto.ErrorResponse UNKNOWN_ERROR = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.androidmvi.spacex.network.dto.RocketsException.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.network.dto.ErrorResponse getError() {
        return null;
    }
    
    public RocketsException(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.dto.ErrorResponse error) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/androidmvi/spacex/network/dto/RocketsException$Companion;", "", "()V", "UNKNOWN_ERROR", "Lcom/androidmvi/spacex/network/dto/ErrorResponse;", "fromThrowable", "Lcom/androidmvi/spacex/network/dto/RocketsException;", "throwable", "", "swErrorFromHttpException", "exception", "Lretrofit2/HttpException;", "android-sample-mvi-network_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.androidmvi.spacex.network.dto.RocketsException fromThrowable(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            return null;
        }
        
        private final com.androidmvi.spacex.network.dto.ErrorResponse swErrorFromHttpException(retrofit2.HttpException exception) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}