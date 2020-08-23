package com.company.observerDesignPattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIDTracker = 0;
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIDTracker;
        System.out.println("New Observer : " + this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        
        this.printThePrice();

    }

    private void printThePrice() {
        System.out.println(observerId + " -- IBM :" + ibmPrice + " -- Apple : " + applePrice
            + " -- Google : " + googlePrice + "\n");
    }
}
