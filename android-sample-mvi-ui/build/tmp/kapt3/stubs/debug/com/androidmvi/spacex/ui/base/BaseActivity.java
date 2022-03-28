package com.androidmvi.spacex.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/androidmvi/spacex/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/androidmvi/spacex/ui/base/NavigationHandler;", "()V", "mFragmentManager", "Landroidx/fragment/app/FragmentManager;", "loadFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "isAddToBackStack", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "setStatusBarColor", "color", "", "android-sample-mvi-ui_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.androidmvi.spacex.ui.base.NavigationHandler {
    private androidx.fragment.app.FragmentManager mFragmentManager;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    android.os.PersistableBundle persistentState) {
    }
    
    @java.lang.Override()
    public void loadFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, boolean isAddToBackStack) {
    }
    
    /**
     * Set Status Bar Color
     *
     * @param color color to be set
     */
    public void setStatusBarColor(int color) {
    }
    
    public BaseActivity() {
        super();
    }
}