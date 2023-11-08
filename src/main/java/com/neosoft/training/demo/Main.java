package com.neosoft.training.demo;

import com.neosoft.training.demo.ListeDeTache;
import com.neosoft.training.demo.Tache;

public class Main {
    public static void  main(String[] args) {
        //Menu menu = new Menu();
        //menu.OpenMenu();
        ListeDeTache listeDeTache = new ListeDeTache();
        Tache tache = listeDeTache.createTache();
        listeDeTache.addTache(tache);
        System.out.println(listeDeTache.listeDeTache);

    }




}