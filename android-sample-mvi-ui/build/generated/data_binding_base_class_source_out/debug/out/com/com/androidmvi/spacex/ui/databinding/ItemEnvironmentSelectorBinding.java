// Generated by view binder compiler. Do not edit!
package com.com.androidmvi.spacex.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.com.androidmvi.spacex.ui.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemEnvironmentSelectorBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView environmeFntSelectorName;

  private ItemEnvironmentSelectorBinding(@NonNull TextView rootView,
      @NonNull TextView environmeFntSelectorName) {
    this.rootView = rootView;
    this.environmeFntSelectorName = environmeFntSelectorName;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEnvironmentSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEnvironmentSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_environment_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEnvironmentSelectorBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView environmeFntSelectorName = (TextView) rootView;

    return new ItemEnvironmentSelectorBinding((TextView) rootView, environmeFntSelectorName);
  }
}
