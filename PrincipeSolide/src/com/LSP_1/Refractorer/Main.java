package com.LSP_1.Refractorer;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Diesel", new EquipementMoteur(5));

        System.out.println(vehicle);
    }
}
