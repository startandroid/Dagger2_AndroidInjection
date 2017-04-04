package ru.startandroid.androidinjector.second.dagger;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.androidinjector.common.Constants;
import ru.startandroid.androidinjector.second.SecondActivity;
import ru.startandroid.androidinjector.second.SecondActivityPresenter;

@Module
public class SecondActivityModule {

    @Provides
    SecondActivityPresenter provideSecondActivityPresenter(SecondActivity secondActivity) {
        String data = secondActivity.getIntent().getStringExtra(Constants.EXTRA_DATA);
        return new SecondActivityPresenter(data);
    }
}
