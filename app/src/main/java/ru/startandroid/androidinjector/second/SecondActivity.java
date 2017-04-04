package ru.startandroid.androidinjector.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import ru.startandroid.androidinjector.R;
import ru.startandroid.androidinjector.common.Constants;
import ru.startandroid.androidinjector.third.ThirdActivity;

public class SecondActivity extends AppCompatActivity {

    @Inject
    SecondActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
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
