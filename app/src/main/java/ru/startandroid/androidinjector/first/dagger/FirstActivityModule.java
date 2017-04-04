package ru.startandroid.androidinjector.first.dagger;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.androidinjector.first.FirstActivityPresenter;

@Module
public class FirstActivityModule {

    @Provides
    FirstActivityPresenter provideFirstActivityPresenter() {
        return new FirstActivityPresenter();
    }
}
