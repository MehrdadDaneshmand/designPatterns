package com.company.observerDesignPattern;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        /*StockObserver observer = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(190);
        stockGrabber.setApplePrice(250);
        stockGrabber.setGooglePrice(95);*/

        Runnable getIbm = new GetTheStock( 2 , "IBM" , 197.00 , stockGrabber);
        Runnable getApple = new GetTheStock( 2 , "Apple" , 667.60 , stockGrabber);
        Runnable getGoogle = new GetTheStock( 2 , "Google" , 676.40 , stockGrabber);

        new Thread(getIbm).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();

    }
}
