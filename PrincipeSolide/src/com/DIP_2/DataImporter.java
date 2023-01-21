package com.DIP_2;

public class DataImporter {
    private FileLoader loader;
    private GateWay gateWay;

    public DataImporter(FileLoader loader, GateWay gateWay) {
        this.loader = loader;
        this.gateWay = gateWay;
    }
    public FileLoader getLoader() {
        return loader;
    }
    public void setLoader(FileLoader loader) {
        this.loader = loader;
    }
    public GateWay getGateWay() {
        return gateWay;
    }
    public void setGateWay(GateWay gateWay) {
        this.gateWay = gateWay;
    }

    
}
