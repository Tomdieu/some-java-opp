package com.LSP_1.Refractorer;

public class EquipementMoteur {
    private int puissanceMoteur;

    

    public EquipementMoteur(int puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public void setPuissanceMoteur(int puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public void demarer(){
        
    }

    public void demare(){
        
    }

    @Override
    public String toString() {
        return "EquipementMoteur [puissanceMoteur=" + puissanceMoteur + "]";
    }

    
}
