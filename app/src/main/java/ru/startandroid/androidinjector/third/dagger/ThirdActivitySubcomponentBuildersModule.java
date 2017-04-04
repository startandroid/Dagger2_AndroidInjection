package ru.startandroid.androidinjector.third.dagger;

import android.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;
import ru.startandroid.androidinjector.third.fragments.bottom.BottomFragment;
import ru.startandroid.androidinjector.third.fragments.bottom.dagger.BottomFragmentComponent;
import ru.startandroid.androidinjector.third.fragments.top.TopFragment;
import ru.startandroid.androidinjector.third.fragments.top.dagger.TopFragmentComponent;

@Module(subcomponents = {TopFragmentComponent.class, BottomFragmentComponent.class})
public abstract class ThirdActivitySubcomponentBuildersModule {

    @Binds
    @IntoMap
    @FragmentKey(TopFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindTopFragmentInjectorFactory(TopFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(BottomFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindBottomFragmentInjectorFactory(BottomFragmentComponent.Builder builder);

}
