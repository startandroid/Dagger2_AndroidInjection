package ru.startandroid.androidinjector.app;

import dagger.Component;

@Component(modules = {AppModule.class, AppSubcomponentBuildersModule.class})
public interface AppComponent {
    void injectApp(App app);
}
