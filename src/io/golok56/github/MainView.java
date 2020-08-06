package io.golok56.github;

import java.util.Observable;
import java.util.Observer;

public class MainView implements Observer {
    private MainViewModel viewModel = new MainViewModel();

    public MainView() {
        viewModel.getResponse().addObserver(this);
    }

    public void onMessageReceived(String message) {
        viewModel.classifyMessage(message);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof String)) throw new IllegalArgumentException("Argumen harus bertipe data String");
        String responseMessage = (String) arg;
        System.out.println(responseMessage);
    }
}
