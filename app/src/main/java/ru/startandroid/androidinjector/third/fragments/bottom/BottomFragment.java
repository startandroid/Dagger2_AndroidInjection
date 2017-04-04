package ru.startandroid.androidinjector.third.fragments.bottom;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import ru.startandroid.androidinjector.R;

public class BottomFragment extends Fragment {

    @Inject
    BottomFragmentPresenter presenter;

    @Override
    public void onAttach(Activity activity) {
        AndroidInjection.inject(this);
        super.onAttach(activity);
        Log.d("dagger", "bottom presenter data " + presenter.getData());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_fragment, container, false);
    }
}
