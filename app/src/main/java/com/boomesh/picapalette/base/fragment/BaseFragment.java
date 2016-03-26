package com.boomesh.picapalette.base.fragment;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getFragmentLayout(), container, false);
    }

    /**
     * Fragment layout ID subclasses define.
     *
     * @return a valid non-zero layout id.
     */
    @LayoutRes
    protected abstract int getFragmentLayout();

    /**
     * Subclasses must return a custom fragment tag.  Should be in the form of
     * {@code <<Class>>.class.getSimpleName()}
     *
     * @return a non-null tag
     */
    @NonNull
    public abstract String getFragmentTag();


}
