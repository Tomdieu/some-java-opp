package com.LSP_1.Refractorer;

public class Vehicle{
    private String typeEnergy;
    private EquipementMoteur equipementMoteur;

    public Vehicle() {
    }
    public Vehicle(String typeEnergy, EquipementMoteur equipementMoteur) {
        this.typeEnergy = typeEnergy;
        this.equipementMoteur = equipementMoteur;
    }
    @Override
    public String toString() {
        return "Vehicle [typeEnergy=" + typeEnergy + ", equipementMoteur=" + equipementMoteur + "]";
    }
    public String getTypeEnergy() {
        return typeEnergy;
    }
    public void setTypeEnergy(String typeEnergy) {
        this.typeEnergy = typeEnergy;
    }
    public EquipementMoteur getEquipementMoteur() {
        return equipementMoteur;
    }
    public void setEquipementMoteur(EquipementMoteur equipementMoteur) {
        this.equipementMoteur = equipementMoteur;
    }

    public void calculerConso(){

    }

    
}