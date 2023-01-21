package com.Exo2;

public class DataImporter {
    public void Import(String file){
        System.out.println("importing "+file+" ...");
        CsvFileLoader csv = new CsvFileLoader();
        csv.loadFile(file);
        DataGateWay dgw = new DataGateWay();
        dgw.storeIntoDatabase();
    }
}
