package ru.startandroid.androidinjector.app;

import dagger.Component;

@Component(modules = {AppModule.class, AppScBuildersModule.class})
public interface AppComponent {
    void injectApp(App app);
}
