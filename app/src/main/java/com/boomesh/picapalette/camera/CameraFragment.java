package com.boomesh.picapalette.camera;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.boomesh.picapalette.R;
import com.boomesh.picapalette.base.fragment.BaseFragment;

/**
 * User interacts with the camera here.
 * <p/>
 * Created by sumesh on 3/26/16.
 */
public class CameraFragment extends BaseFragment {
    private static final String TAG = CameraFragment.class.getSimpleName();

    public static CameraFragment newInstance() {
        Bundle args = new Bundle();

        CameraFragment fragment = new CameraFragment();
        fragment.setArguments(args);
        return fragment;
    }

    //region BaseFragment methods
    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_camera;
    }

    @NonNull
    @Override
    public String getFragmentTag() {
        return TAG;
    }
    //endregion
}
