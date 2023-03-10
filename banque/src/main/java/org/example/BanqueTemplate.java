package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BanqueTemplate {
    Object empty = new Object();
    ArrayList<Object> empties = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static int choice() {
        System.out.print("Votre choix: ");
        int choice = scanner.nextInt();
        System.out.println();
        return choice;
    }


    public static String selector() {
        System.out.print("Votre select : ");
        String select = scanner.next();
        System.out.println();
        return select;
    }

//template for Créer une agence
      public static void agenceMaker(int id,int code_agence,String nom,String adresse){

        Agence agence = new Agence(id,code_agence,nom,adresse);
          serialisation(agence);
      }

    public static Object agenceReader(){

            return deserialisation(empty);
        
    }
//template for Créer un client
      private void clientMaker(Agence agence){

      }

//template for Créer un compte bancaire

      private void compteMaker(Agence agence){

      }

      public static void serialisation(Object empty){
          String filename ="";
        if (empty instanceof Agence){
            filename="agence";
        } else if (empty instanceof Compte) {
            filename="compte";
        } else if (empty instanceof Client) {
            filename="client";
        }
          try {
              // donner le fichier dans lequel j'enreigstre
              FileOutputStream io = new FileOutputStream("/var/www/21.afpa_banque_poo/banque/db/"+filename+".txt");
              // pour ecrire dans le fichier j'utilise un objet de type
              ObjectOutputStream o = new ObjectOutputStream(io);
              o.writeObject(empty);
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
      public static Object deserialisation(Object empty){
          String filename ="";
          if (empty instanceof Agence){
              filename="agence";
          } else if (empty instanceof Compte) {
              filename="compte";
          } else if (empty instanceof Client) {
              filename="client";
          }
          try {
              // donner le fichier contenant les clients
              FileInputStream io = new FileInputStream("/var/www/21.afpa_banque_poo/banque/db/"+filename+".txt");
              // pour lire les objets du fichier  j'utilise un objet de type ObjectInputStream
              ObjectInputStream o = new ObjectInputStream(io);
              empty = (ArrayList<Object>) o.readObject();

          } catch (IOException | ClassNotFoundException e) {
              e.printStackTrace();
          }

          return empty;
      }
/*
Foctionnalité à ajouter dans le projet banque :
[08:43]
Les données de l'application (les clients de la banque avec leur compte) doivent être sauvegarder dans un fichier (sérialisation) (modifié)
[08:46]
 try {
            // donner le fichier dans lequel j'enreigstre
            FileOutputStream io = new FileOutputStream("C:\\Users\\PC2\\eclipse-workspace\\testProjet\\client.txt");
            // pour ecrire dans le fichier j'utilise un objet de type
            ObjectOutputStream o = new ObjectOutputStream(io);
            o.writeObject(clients);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
[08:46]
avec clients est une liste qui contient tous les clients de la banque
[08:47]
----------------------------
[08:47]
pour récupérer le contenu du fichier (désérialisation) (modifié)
[08:50]

        ArrayList<Client> clients = new ArrayList<Client>();

        try {
            // donner le fichier contenant les clients
            FileInputStream io = new FileInputStream("C:\\Users\\PC2\\eclipse-workspace\\testProjet\\client.txt");
            // pour lire les objets du fichier  j'utilise un objet de type ObjectInputStream
            ObjectInputStream o = new ObjectInputStream(io);
            clients = (ArrayList<Client>) o.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

Envoyer un message dans #cours

 */
}
