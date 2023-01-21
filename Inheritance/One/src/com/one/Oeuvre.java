package com.one;

public class Oeuvre {
    private String title,auteur;

    public Oeuvre(String title,String auteur){
        this.setAuteur(auteur);
        this.setTitle(title);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuteur(){
        return this.auteur;
    }


}
