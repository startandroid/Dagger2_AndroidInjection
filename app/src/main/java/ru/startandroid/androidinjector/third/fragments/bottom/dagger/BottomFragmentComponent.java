package ru.startandroid.androidinjector.third.fragments.bottom.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ru.startandroid.androidinjector.third.fragments.bottom.BottomFragment;

@Subcomponent(modules = BottomFragmentModule.class)
public interface BottomFragmentComponent extends AndroidInjector<BottomFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BottomFragment> {

    }
}
