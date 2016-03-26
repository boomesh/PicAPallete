package com.boomesh.picapalette.base.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentLayout());
    }

    /**
     * Subclasses must return a non-zero layout res ID to describe the layout of the activity.
     * @return a non-zero, valid layout res id.
     */
    @LayoutRes
    protected abstract int getContentLayout();
}
