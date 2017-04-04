package ru.startandroid.androidinjector.first.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ru.startandroid.androidinjector.first.FirstActivity;

@Subcomponent(modules = FirstActivityModule.class)
public interface FirstActivityComponent extends AndroidInjector<FirstActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FirstActivity> {

    }

}
