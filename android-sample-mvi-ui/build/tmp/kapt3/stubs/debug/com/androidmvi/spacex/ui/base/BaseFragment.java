package com.androidmvi.spacex.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\b\u0010\u001a\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/androidmvi/spacex/ui/base/BaseFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Landroidx/viewbinding/ViewBinding;", "navigationHandler", "Lcom/androidmvi/spacex/ui/base/NavigationHandler;", "getNavigationHandler", "()Lcom/androidmvi/spacex/ui/base/NavigationHandler;", "setNavigationHandler", "(Lcom/androidmvi/spacex/ui/base/NavigationHandler;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateViewBinding", "onDestroy", "android-sample-mvi-ui_debug"})
public abstract class BaseFragment<T extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    public T binding;
    @org.jetbrains.annotations.Nullable()
    private com.androidmvi.spacex.ui.base.NavigationHandler navigationHandler;
    
    @org.jetbrains.annotations.Nullable()
    public final com.androidmvi.spacex.ui.base.NavigationHandler getNavigationHandler() {
        return null;
    }
    
    public final void setNavigationHandler(@org.jetbrains.annotations.Nullable()
    com.androidmvi.spacex.ui.base.NavigationHandler p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public abstract void onCreateViewBinding(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public BaseFragment() {
        super();
    }
}