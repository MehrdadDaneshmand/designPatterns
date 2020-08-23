package com.company.observerDesignPattern;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
