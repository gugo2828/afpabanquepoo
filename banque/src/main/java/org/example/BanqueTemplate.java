package org.example;

import java.util.Scanner;

public class BanqueTemplate {

    private static Scanner scanner = new Scanner(System.in);

    public static int choice() {
        System.out.print("Votre choix: ");
        int choice = scanner.nextInt();
        System.out.println();
        return choice;
    }


//template for Créer une agence
      private void agenceMaker(Agence agence){

      }
//template for Créer un client
      private void clientMaker(Agence agence){

      }

//template for Créer un compte bancaire

      private void compteMaker(Agence agence){

      }
}
