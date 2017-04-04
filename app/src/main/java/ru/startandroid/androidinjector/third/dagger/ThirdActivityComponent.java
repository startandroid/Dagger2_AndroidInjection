package ru.startandroid.androidinjector.third.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ru.startandroid.androidinjector.third.ThirdActivity;

@Subcomponent(modules = ThirdActivitySubcomponentBuildersModule.class)
public interface ThirdActivityComponent extends AndroidInjector<ThirdActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ThirdActivity> {

    }

}
