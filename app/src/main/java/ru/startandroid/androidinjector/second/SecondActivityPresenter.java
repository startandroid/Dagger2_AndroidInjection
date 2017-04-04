package ru.startandroid.androidinjector.second;

public class SecondActivityPresenter {

    private final String data;

    public SecondActivityPresenter(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
