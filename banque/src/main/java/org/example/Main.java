package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

import static org.example.BanqueTemplate.*;

public class Main {
    public static void main(String[] args) {

        int choice =0;

        while (choice < 9) {
            if (choice == 8 || choice < 0) {
                break;
            } else if (choice == 1) {
                while (choice > 0 && choice < 10) {

                    if (choice == 1) {
                        System.out.println("1.Créer une agence");
                        System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                        if (choice() == 1) {
                            System.out.println("****************** Les chambres *****************");
                            System.out.println();
                            System.out.println("****************** Les clients ******************");
                            System.out.println();
                            System.out.println("****************** Les reservations ******************");
                            System.out.println();
                            agenceMaker(choice,choice,selector(),selector());

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
                    System.out.println("2.Créer un client");
                    System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                    if (choice() == 1) {
                        System.out.println("****************** Les chambres *****************");
                        System.out.println();
                        System.out.println("****************** Les clients ******************");
                        System.out.println();
                        System.out.println("****************** Les reservations ******************");
                        System.out.println();

                    break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();
                }
            } else if (choice == 3) {
                while (choice > 0 && choice < 10) {
                    System.out.println("3.Créer un compte bancaire");
                    System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                    if (choice() == 1) {
                        System.out.println("****************** Les chambres *****************");
                        System.out.println();
                        System.out.println("****************** Les clients ******************");
                        System.out.println();
                        System.out.println("****************** Les reservations ******************");
                        System.out.println();

                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();

                }
            } else if (choice == 4) {
                while (choice > 0 && choice < 10) {
                    System.out.println("4.Recherche de compte (numéro de compte)");
                    System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                    if (choice() == 1) {
                        System.out.println("****************** Les chambres *****************");
                        System.out.println();
                        System.out.println("****************** Les clients ******************");
                        System.out.println();
                        System.out.println("****************** Les reservations ******************");
                        System.out.println();

                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();

                }
            } else if (choice == 5) {
                while (choice > 0 && choice < 10) {
                    System.out.println("5.Recherche de client (Nom, Numéro de compte, identifiant de client)");
                    System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                    if (choice() == 1) {
                        System.out.println("****************** Les chambres *****************");
                        System.out.println();
                        System.out.println("****************** Les clients ******************");
                        System.out.println();
                        System.out.println("****************** Les reservations ******************");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 1");
                    }
                    choice();
                }
            } else if (choice == 6) {
                while (choice > 0 && choice() < 10) {
                    System.out.println("6.Afficher la liste des comptes d’un client (identifiant client)");
                    System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                    if (choice() == 1) {
                        System.out.println("****************** Les chambres *****************");
                        System.out.println();
                        System.out.println("****************** Les clients ******************");
                        System.out.println();
                        System.out.println("****************** Les reservations ******************");
                        System.out.println();

                        break;
                    } else {
                        System.out.println("Verifier votre chiffre 6");
                    }
                    choice();
                }
            } else if (choice == 7) {
                while (choice > 0 && choice < 10) {
                    System.out.println("7.Imprimer les infos client (identifiant client)");
                    System.out.println("Taper 1 pour afficher ou 0 pour menu principale");
                    if (choice() == 1) {
                        System.out.println("****************** Les chambres *****************");
                        System.out.println();
                        System.out.println("****************** Les clients ******************");
                        System.out.println();
                        System.out.println("****************** Les reservations ******************");
                        System.out.println();

                        break;
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