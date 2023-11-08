package com.neosoft.training.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListeDeTache {

    public List<Tache> listeDeTache = new ArrayList<>();
    public Tache createTache() {
        try ( Scanner scanner = new Scanner( System.in ) ) {
            System.out.print("Veuillez saisir un Nom : ");
            String Nom = scanner.nextLine();

            System.out.print("Veuillez saisir une importance : ");
            String importance = scanner.nextLine();

            System.out.print("Veuillez saisir Date de debut : ");
            String dateString = scanner.next();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date debut = formatter.parse(dateString);

            System.out.print("Veuillez saisir une durée en jour : ");
            int jour = scanner.nextInt();

            return new Tache(Nom,importance,jour,debut);

        }catch(Exception e) {
            System.out.println("Marche pas");
        }
        return null;
    }

    public void addTache(Tache Tache) {
        this.listeDeTache.add(Tache);
    }
}
