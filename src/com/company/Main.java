package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choix = "";

        System.out.println("    ------ Menu principal -----  \n \t" +
                "| v : Afficher Scores     |\n" +
                        "\t|  q : Quitter            | \n" +
                        "\t|  n : Nouvelle Partie    | \n" +
                        "\t---------------------------");

        do {

            choix = scan.nextLine();

            switch (choix) {
                case "n":
                    System.out.println("     ----- NIVEAU -----  \n \t " +
                                    " f : facile \n" +
                                    "\t  m : moyen \n" +
                                    "\t  d : difficile \n" +
                                    "    -------------------");
                    Game gameFacile = new Game();

                    choix = scan.nextLine();


                    } if (choix.equals("m")) {
                        System.out.println("Niveau Moyen \n \n");
                        Game gameFacile = new Game();
                        gameFacile.initialisation();
                        gameFacile.affiche_jeu(gameFacile.initialisation());
                        System.out.println();


                    } else if (choix.equals("d")) {
                        System.out.println("Niveau Difficile \n \n");
                        Game gameDifficile = new Game();
                        gameDifficile.initialisation();
                        gameDifficile.affiche_jeu(gameDifficile.difficile);
                        System.out.println();

                    } else if (choix.equals("f")) {
                        System.out.println("Niveau Facile \n \n");
                        Game gameFacile = new Game();
                        gameFacile.initialisation();
                        gameFacile.affiche_jeu(gameFacile.facile);
                        System.out.println();
            }

            } while (choix == "q");
        }
    }

