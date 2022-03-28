// Generated by view binder compiler. Do not edit!
package com.com.androidmvi.spacex.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.com.androidmvi.spacex.ui.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pl.openrnd.multilevellistview.MultiLevelListView;

public final class FragmentEnvironmentSelectorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout environmentSelectionContainer;

  @NonNull
  public final MultiLevelListView environmentSelectorList;

  private FragmentEnvironmentSelectorBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout environmentSelectionContainer,
      @NonNull MultiLevelListView environmentSelectorList) {
    this.rootView = rootView;
    this.environmentSelectionContainer = environmentSelectionContainer;
    this.environmentSelectorList = environmentSelectorList;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEnvironmentSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEnvironmentSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_environment_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEnvironmentSelectorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout environmentSelectionContainer = (RelativeLayout) rootView;

      id = R.id.environmentSelectorList;
      MultiLevelListView environmentSelectorList = rootView.findViewById(id);
      if (environmentSelectorList == null) {
        break missingId;
      }

      return new FragmentEnvironmentSelectorBinding((RelativeLayout) rootView,
          environmentSelectionContainer, environmentSelectorList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}