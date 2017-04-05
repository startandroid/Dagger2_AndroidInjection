package ru.startandroid.androidinjector.third.fragments.bottom;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.DaggerFragment;
import ru.startandroid.androidinjector.R;

public class BottomFragment extends DaggerFragment {

    @Inject
    BottomFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_fragment, container, false);
    }
}
