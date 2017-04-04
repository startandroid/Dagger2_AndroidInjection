package ru.startandroid.androidinjector.second.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ru.startandroid.androidinjector.second.SecondActivity;

@Subcomponent(modules = SecondActivityModule.class)
public interface SecondActivityComponent extends AndroidInjector<SecondActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity> {

    }

}
