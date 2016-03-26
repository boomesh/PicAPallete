package com.boomesh.picapalette.camera;

import android.support.annotation.NonNull;

import com.boomesh.picapalette.base.activity.BaseSingleFragmentActivity;
import com.boomesh.picapalette.base.fragment.BaseFragment;

public class CameraActivity extends BaseSingleFragmentActivity {

    //region BaseSingleFragmentActivity methods
    @NonNull
    @Override
    protected BaseFragment getSingleFragmentInstance() {
        return CameraFragment.newInstance();
    }
    //endregion
}
