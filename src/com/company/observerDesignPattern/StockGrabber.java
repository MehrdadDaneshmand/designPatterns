package com.company.observerDesignPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{


    private ArrayList<Observer> observers;


    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + (observerIndex+1) + " delete!");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(e -> e.update(ibmPrice, applePrice, googlePrice));
    }


    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        this.notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        this.notifyObserver();
    }
}
