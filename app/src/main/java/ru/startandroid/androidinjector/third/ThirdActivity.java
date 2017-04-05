package ru.startandroid.androidinjector.third;

import android.app.Fragment;
import android.os.Bundle;

import dagger.android.DaggerActivity;
import ru.startandroid.androidinjector.R;
import ru.startandroid.androidinjector.common.Constants;
import ru.startandroid.androidinjector.third.fragments.bottom.BottomFragment;
import ru.startandroid.androidinjector.third.fragments.top.TopFragment;

public class ThirdActivity extends DaggerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        if (savedInstanceState == null) {

            Bundle args = new Bundle();
            args.putString(Constants.EXTRA_DATA, "some fragment data");

            Fragment bottomFragment = new BottomFragment();
            bottomFragment.setArguments(args);

            Fragment topFragment = new TopFragment();
            topFragment.setArguments(args);

            getFragmentManager().beginTransaction()
                    .add(R.id.containerTop, topFragment)
                    .add(R.id.containerBottom, bottomFragment)
                    .commit();
        }
    }

}
