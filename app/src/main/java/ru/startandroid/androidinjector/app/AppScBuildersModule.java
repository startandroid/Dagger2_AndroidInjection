package ru.startandroid.androidinjector.app;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ru.startandroid.androidinjector.first.FirstActivity;
import ru.startandroid.androidinjector.first.dagger.FirstActivityComponent;
import ru.startandroid.androidinjector.second.SecondActivity;
import ru.startandroid.androidinjector.second.dagger.SecondActivityComponent;
import ru.startandroid.androidinjector.third.ThirdActivity;
import ru.startandroid.androidinjector.third.dagger.ThirdActivityComponent;

@Module(subcomponents = {FirstActivityComponent.class, SecondActivityComponent.class, ThirdActivityComponent.class})
public abstract class AppScBuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(FirstActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindFirstActivityInjectorFactory(FirstActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindSecondActivityInjectorFactory(SecondActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(ThirdActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindThirdActivityInjectorFactory(ThirdActivityComponent.Builder builder);

}
