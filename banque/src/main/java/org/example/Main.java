package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

import static org.example.BanqueTemplate.choice;

public class Main {
    public static void main(String[] args) {

        int choice =0;

        while (choice < 9) {
            if (choice == 8 || choice < 0) {
                break;
            } else if (choice == 1) {
                while (choice > 0 && choice < 10) {

                    if (choice == 1) {
                        System.out.println("Dans A-1.Afficher l'etat de l'hotel");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        if (choice() == 1) {
                            System.out.println("****************** Les chambres *****************");
                            System.out.println();
                            System.out.println("****************** Les clients ******************");
                            System.out.println();
                            System.out.println("****************** Les reservations ******************");
                            System.out.println();
                        }
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();
                }
            } else if (choice == 2) {
                while (choice > 0 && choice < 10) {
                    if (choice == 2) {
                        System.out.println("Dans B-2.Afficher le nombre de chambres reservees");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        System.out.println(choice);
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();
                }
            } else if (choice == 3) {
                while (choice > 0 && choice() < 10) {
                    if (choice == 3) {
                        System.out.println("Dans C-3.Afficher le nombre de chambres libres");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        System.out.println(choice);
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();

                }
            } else if (choice == 4) {
                while (choice > 0 && choice < 10) {
                    if (choice() == 4) {
                        System.out.println("Dans D-4.Afficher le numero de la premiere chambre vide");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        System.out.println(choice);
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();

                }
            } else if (choice == 5) {
                while (choice > 0 && choice < 10) {
                    if (choice == 5) {
                        System.out.println("Dans E-5.Afficher le numero la derniere chambre vide");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        System.out.println(choice);
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();
                }
            } else if (choice == 6) {
                while (choice > 0 && choice() < 10) {
                    if (choice == 6) {
                        System.out.println("F-6.Reserver une chambre");
                        System.out.println("Taper 0 pour revenir au menu principal");
                        choice();
                        System.out.println(choice);
                    } else {
                        System.out.println("Verifier votre chiffre 6");
                    }
                    choice();
                }
            } else if (choice == 7) {
                while (choice > 0 && choice < 10) {
                    if (choice == 7) {
                        System.out.println("G-7.Afficher le nombre de chambres reservees");
                        System.out.println("Taper 0 pour revenir au menu principal");
                        choice();
                        System.out.println(choice);
                    } else {
                        System.out.println("Verifier votre chiffre 7");
                    }
                    choice();
                }
            } else if (choice == 0) {
                System.out.println("\n" +
                        "Menu :\n" +
                        "    1- Créer une agence\n" +
                        "    2- Créer un client\n" +
                        "    3- Créer un compte bancaire\n" +
                        "    4- Recherche de compte (numéro de compte)\n" +
                        "    5- Recherche de client (Nom, Numéro de compte, identifiant de client)\n" +
                        "    6- Afficher la liste des comptes d’un client (identifiant client)\n" +
                        "    7- Imprimer les infos client (identifiant client)\n" +
                        "    8- Quitter le programme ");
            }
            choice =choice();
        }
    }
}