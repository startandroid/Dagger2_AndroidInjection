package ru.startandroid.androidinjector.third.fragments.top.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ru.startandroid.androidinjector.third.fragments.top.TopFragment;

@Subcomponent(modules = TopFragmentModule.class)
public interface TopFragmentComponent extends AndroidInjector<TopFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TopFragment> {

    }

}
