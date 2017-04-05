package ru.startandroid.androidinjector.second;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.DaggerActivity;
import ru.startandroid.androidinjector.R;
import ru.startandroid.androidinjector.third.ThirdActivity;

public class SecondActivity extends DaggerActivity {

    @Inject
    SecondActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        ButterKnife.bind(this);

        Log.d("dagger", "second presenter data " + presenter.getData());
    }

    @OnClick(R.id.go)
    void onGoClick() {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
