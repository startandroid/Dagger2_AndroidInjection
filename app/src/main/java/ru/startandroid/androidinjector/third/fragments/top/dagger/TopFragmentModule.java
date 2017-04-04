package ru.startandroid.androidinjector.third.fragments.top.dagger;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.androidinjector.third.fragments.top.TopFragmentPresenter;

@Module
public class TopFragmentModule {

    @Provides
    TopFragmentPresenter provideTopFragmentPresenter() {
        return new TopFragmentPresenter();
    }
}
