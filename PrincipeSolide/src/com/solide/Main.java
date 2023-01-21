package com.solide;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Persone p = new Persone("ivantom", "corp", new Date(), new Job("Software Developer", true));

        System.out.println("Description de l'objet personne : ");
        System.out.println("Nom : " + p.getName());
        System.out.println("Prenom : " + p.getFirstName());
        System.out.println("Date de naissance : " + p.getBirthDate());
        System.out.println("Job Description : " + p.getJob().getDescription());
        System.out.println("IsGodSalary : " + p.getJob().isGoodSalary());

    }
}
