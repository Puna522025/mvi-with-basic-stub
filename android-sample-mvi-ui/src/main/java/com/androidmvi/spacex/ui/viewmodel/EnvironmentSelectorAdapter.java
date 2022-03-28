package com.androidmvi.spacex.ui.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.androidmvi.spacex.network.injection.Server;
import com.com.androidmvi.spacex.ui.R;

import java.util.ArrayList;
import java.util.List;

import pl.openrnd.multilevellistview.ItemInfo;
import pl.openrnd.multilevellistview.MultiLevelListAdapter;

/**
 * Environment Selector List's Adapter
 */
public class EnvironmentSelectorAdapter extends MultiLevelListAdapter {

    private final Context mContext;

    public EnvironmentSelectorAdapter(@NonNull final Context context) {
        mContext = context;
    }

    @Override
    protected boolean isExpandable(Object o) {
        return !(o instanceof Server);
    }

    @Override
    protected List<?> getSubObjects(Object o) {
        if (o instanceof EnvironmentGroup) {
            return ((EnvironmentGroup) o).getEnvironments();
        } else if (o instanceof Environment) {
            return ((Environment) o).getServers();
        }

        return new ArrayList<>();
    }

    @Override
    protected View getViewForObject(Object o, View view, ItemInfo itemInfo) {
        TextView textView = (TextView) LayoutInflater.from(mContext)
                .inflate(R.layout.item_environment_selector, null);
        setContent(o, textView);
        return textView;
    }

    /**
     * Set list item content.
     *
     * @param o    Object
     * @param view TextView
     */
    private void setContent(@NonNull final Object o, @NonNull final TextView view) {
        if (o instanceof EnvironmentGroup) {
            view.setText(((EnvironmentGroup) o).getName());
            view.setBackgroundColor(ContextCompat.getColor(mContext, android.R.color.black));
            view.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
        } else if (o instanceof Environment) {
            view.setText(((Environment) o).getName());
            view.setBackgroundColor(ContextCompat.getColor(mContext, R.color.grey
            ));
            view.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
        } else if (o instanceof Server) {
            view.setText(((Server) o).getName());
            view.setBackgroundColor(ContextCompat.getColor(mContext, android.R.color.white));
            view.setTextColor(ContextCompat.getColor(mContext, android.R.color.holo_red_light));
        }
    }
}
