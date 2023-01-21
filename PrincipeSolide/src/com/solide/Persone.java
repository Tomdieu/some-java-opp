package com.solide;

import java.util.Date;


public class Persone{
    private String name;
    private String firstName;
    private Date birthDate;

    private Job job;

    

    public Persone() {
    }

    public Persone(String name, String firstName, Date birthDate, Job job) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    

    
}