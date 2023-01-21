package com.LSP_1;

public class Vehicle {
    private float puissanceMoteur;

    

    public Vehicle(float puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public float getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public void setPuissanceMoteur(float puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public void demarer(){
        System.out.println("Je Demare");
    }

    public void freiner(){
        System.out.println("Je freine");
    }

    
}
