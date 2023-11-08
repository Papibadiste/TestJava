package com.neosoft.training.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public void OpenMenu(){
        try ( Scanner scannerMenu = new Scanner( System.in ) ) {
            System.out.print("Create -> 1 Update -> 2 Delete -> 3: ");
            if (scannerMenu.nextInt() == 1){
                System.out.println("cc");
            }
        }catch(Exception e) {
            System.out.println("Marche pas 2");
        }
    }
}
