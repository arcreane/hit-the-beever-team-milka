package com.projet;

import java.util.Scanner;
import java.util.*;
import java.util.TimerTask;

public class startGame {

    public static void startingGame() {
        Scanner lectureClavier = new Scanner(System.in); // A changer et à rappeler si possible
        int accepter = 0;
        int refuser = 1;

        System.out.println("Commencer une partie?");
        System.out.println("Tapez 0 pour Jouer, 1 pour Sortir.");// OUI le jeu se lance, NON le jeu quitte

        int choice = lectureClavier.nextInt();

        if (choice != 0) { //Si la reponse est NON, sortir du jeu;
            System.out.println("Au revoir");

        } else {
            startGame.difficultyChoice();//SINON
        }
    }

    public static void difficultyChoice() {
        Scanner lectureClavier = new Scanner(System.in); //A changer et à rappekker si possible

        System.out.println("Choisissez voter niveau");// veuillez choisir votre niveau
        System.out.println(" 0: Facile  1: Moyen  2: Difficile ");

        int niveau;
        niveau = lectureClavier.nextInt();

        if (niveau == 0) {// niveau 1 = Facile
            // inserer ici la fonction de grille niveau facile

        } else if (niveau == 1) {  // niveau 2 = Moyen
            // inserer ici la fonction de grille niveau moyen

        } else if (niveau == 2) {   // niveau 3 = difficile
            // inserer ici la fonction de grille niveau difficile

        }
    }

// Timer gameTimer = new Timer(); // Timer de Marmotte: Elle doit rester x seconde en fonction du niveau
}












