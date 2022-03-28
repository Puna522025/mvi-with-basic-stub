// Generated by view binder compiler. Do not edit!
package com.com.androidmvi.spacex.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.com.androidmvi.spacex.ui.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RocketLaunchDetailsItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout itemView;

  @NonNull
  public final TextView launchDate;

  @NonNull
  public final TextView missionName;

  @NonNull
  public final TextView missionSuccessOrFailed;

  @NonNull
  public final ImageView patchImage;

  private RocketLaunchDetailsItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout itemView, @NonNull TextView launchDate,
      @NonNull TextView missionName, @NonNull TextView missionSuccessOrFailed,
      @NonNull ImageView patchImage) {
    this.rootView = rootView;
    this.itemView = itemView;
    this.launchDate = launchDate;
    this.missionName = missionName;
    this.missionSuccessOrFailed = missionSuccessOrFailed;
    this.patchImage = patchImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RocketLaunchDetailsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RocketLaunchDetailsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rocket_launch_details_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RocketLaunchDetailsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout itemView = (ConstraintLayout) rootView;

      id = R.id.launchDate;
      TextView launchDate = rootView.findViewById(id);
      if (launchDate == null) {
        break missingId;
      }

      id = R.id.missionName;
      TextView missionName = rootView.findViewById(id);
      if (missionName == null) {
        break missingId;
      }

      id = R.id.missionSuccessOrFailed;
      TextView missionSuccessOrFailed = rootView.findViewById(id);
      if (missionSuccessOrFailed == null) {
        break missingId;
      }

      id = R.id.patchImage;
      ImageView patchImage = rootView.findViewById(id);
      if (patchImage == null) {
        break missingId;
      }

      return new RocketLaunchDetailsItemBinding((ConstraintLayout) rootView, itemView, launchDate,
          missionName, missionSuccessOrFailed, patchImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
