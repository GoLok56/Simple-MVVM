package io.golok56.github;

import java.util.Observable;

public class ResponseObservable extends Observable {
    private String response;

    public void setResponse(String response) {
        this.response = response;
        setChanged();
        notifyObservers(response);
    }
}
