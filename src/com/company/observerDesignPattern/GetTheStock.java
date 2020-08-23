package com.company.observerDesignPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private StockGrabber stockGrabber;

    public GetTheStock(int startTime, String stock, double price, StockGrabber stockGrabber) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        for (int i = 1 ; i <= 20 ; i ++){
            try {
                Thread.sleep(startTime * 1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            double randNumber = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.parseDouble(df.format(price + randNumber));
            if (stock.equals("IBM")) stockGrabber.setIbmPrice(price);
            if (stock.equals("Apple")) stockGrabber.setApplePrice(price);
            if (stock.equals("Google")) stockGrabber.setGooglePrice(price);
            System.out.println(stock + " : " + df.format(price + randNumber) + " " + df.format(randNumber));
            System.out.println();
        }
    }
}
