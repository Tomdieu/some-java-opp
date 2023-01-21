package com.solide;

public class Job {
    private String description;
    private boolean isGoodSalary;

    public Job() {
    }
    public Job(String description, boolean isGoodSalary) {
        this.description = description;
        this.isGoodSalary = isGoodSalary;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isGoodSalary() {
        return isGoodSalary;
    }
    public void setGoodSalary(boolean isGoodSalary) {
        this.isGoodSalary = isGoodSalary;
    }

   
    
}
