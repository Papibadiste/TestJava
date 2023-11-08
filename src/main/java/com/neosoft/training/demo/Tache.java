package com.neosoft.training.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tache {
    public static String nom;
    public static String importance;

    public static Integer dureeEnJ;
    public static Date dateDebut;

    public enum importances {
        LOW,
        MEDIUM,
        HIGH
    }

    public String returnImportances(String importance) {

        try {
            switch (importances.valueOf(importance)) {
                case LOW:
                    return "low";
                case MEDIUM:
                    return "medium";
                case HIGH:
                    return "High";
            }
        } catch(Exception e) {
            return "FAUX";
        }
        return "FAUX";
    }

    public Tache(String nom, String importance, Integer dureeEnJ, Date dateDebut) {
        this.nom = nom;
        this.importance = this.returnImportances(importance);
        this.dureeEnJ = dureeEnJ;
        this.dateDebut = dateDebut;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "nom='" + nom + '\'' +
                ", importance='" + importance + '\'' +
                ", dureeEnJ='" + dureeEnJ + '\'' +
                ", dateDebut=" + dateDebut +
                '}';
    }
}
