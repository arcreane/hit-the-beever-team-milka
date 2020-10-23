package com.projet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TableauScore {

    public static void tableauResultat() { //Tableau à 2 dimensions avec recuperation de nom et score total

        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Saisir votre nom");
        Scanner lectureClavier = new Scanner(System.in);
        String nom = lectureClavier.nextLine();

        System.out.println("Votre score est: " + //score);

        int value;
        int i;
        private static String[][] m_ScoresArray = new String[5][2]; //{{ scores } { scores }} ==> 5 lignes et 2 colonnes


        for ( ) { // score superieur à celui d'avant

            System.out.println(m_ScoresArray[0][0]); // afficher le nom
            System.out.println(m_ScoresArray[0][1]); //affichera le score

            value = Integer.parseInt(m_ScoresArray);// integer car lecture de string en int pour récuperer le score
                      //recuperation du nom si score élevé

        }



    }
}