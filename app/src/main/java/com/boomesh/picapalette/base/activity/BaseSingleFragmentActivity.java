package com.boomesh.picapalette.base.activity;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.boomesh.picapalette.R;
import com.boomesh.picapalette.base.fragment.BaseFragment;

public abstract class BaseSingleFragmentActivity extends BaseActivity {

    @CallSuper
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        BaseFragment fragment = getSingleFragmentInstance();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_layout, fragment, fragment.getFragmentTag())
                .commit();
    }

    /**
     * Subclass methods must return a non-null instance of the single fragment.
     * Can be a new instance.
     *
     * @return a non-null {@link BaseFragment}
     */
    @NonNull
    protected abstract BaseFragment getSingleFragmentInstance();

    //region BaseActivity methods
    @Override
    protected int getContentLayout() {
        return R.layout.activity_base_single_fragment;
    }
    //endregion
}
