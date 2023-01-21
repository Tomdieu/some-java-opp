package com.DIP_2;

public class Main {
    public static void main(String[] args) {
        DataImporter dataImporter = new DataImporter(new CsvFileLoader(), new DataGateWay());
    }
}
