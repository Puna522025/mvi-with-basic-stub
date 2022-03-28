package com.androidmvi.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent;", "", "()V", "FilterData", "GetRockets", "GetRocketsById", "Loading", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$GetRockets;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$GetRocketsById;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$FilterData;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$Loading;", "android-sample-mvi-ui_debug"})
public abstract class MainStateEvent {
    
    private MainStateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$GetRockets;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent;", "()V", "android-sample-mvi-ui_debug"})
    public static final class GetRockets extends com.androidmvi.spacex.ui.viewmodel.MainStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.androidmvi.spacex.ui.viewmodel.MainStateEvent.GetRockets INSTANCE = null;
        
        private GetRockets() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$GetRocketsById;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "android-sample-mvi-ui_debug"})
    public static final class GetRocketsById extends com.androidmvi.spacex.ui.viewmodel.MainStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public GetRocketsById(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$FilterData;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "android-sample-mvi-ui_debug"})
    public static final class FilterData extends com.androidmvi.spacex.ui.viewmodel.MainStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String status = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStatus() {
            return null;
        }
        
        public FilterData(@org.jetbrains.annotations.NotNull()
        java.lang.String status) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent$Loading;", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent;", "()V", "android-sample-mvi-ui_debug"})
    public static final class Loading extends com.androidmvi.spacex.ui.viewmodel.MainStateEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.androidmvi.spacex.ui.viewmodel.MainStateEvent.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}