package ru.startandroid.androidinjector.third.fragments.bottom.dagger;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.androidinjector.common.Constants;
import ru.startandroid.androidinjector.third.fragments.bottom.BottomFragment;
import ru.startandroid.androidinjector.third.fragments.bottom.BottomFragmentPresenter;

@Module
public class BottomFragmentModule {

    @Provides
    BottomFragmentPresenter provideBottomFragmentPresenter(BottomFragment bottomFragment) {
        String data = bottomFragment.getArguments().getString(Constants.EXTRA_DATA);
        return new BottomFragmentPresenter(data);
    }
}
