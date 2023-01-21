package com.activty;


public class Division{
    public static double Diviseur = 21;
    public static double Divident = 3;

    Division(double divident,double divisor){
        Diviseur = divident;
        Divident = divisor;
    }

    public double diviser(double divident,double diviseur){
        return divident / diviseur;
    }

    public static double diviser(){
        return Divident / Diviseur;
    }
}