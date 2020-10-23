package com.company;
import java.util.Scanner;


public class HighScore {
    public static void main(String[] args) {
//initialisations des variables
        int newscore =10;    //score du joueur
        String nomjoueur;    // nom du joueur
        Scanner saisie = new Scanner(System.in);
        String [][] tabscore = new String[5][2];    //initialisation du tableau des scores
        for (int k=0; k<5;k++) {
            tabscore[k][0]="Personne";
            tabscore[k][1]="0";
        }
        System.out.println("Tableau des Scores initial :\n");    //affichage du tableau des scores de base
        for (int k=0; k<5;k++) {
            System.out.println(tabscore[k][0]+" "+tabscore[k][1]);
        }

//Utilisation active

        System.out.println("Fin du jeu veuillez saisir votre nom :\n");
        nomjoueur = saisie.next();    //saisie du nom du joueur
        for (int i = 0; i < 5 ; i++) {
            int element = Integer.parseInt(tabscore[i][1]);
            if( newscore > element){    //detection du classement du score
                for (int j = 4; j >i; j--){
                    tabscore[j][1] = tabscore[j-1][1];
                    tabscore[j][0] = tabscore[j-1][0];    //triage du tableau
                }

                tabscore[i][1]=String.valueOf(newscore);
                tabscore[i][0]=nomjoueur;    //saisie du nom et du score du joueur
                break;
            }
        }
        System.out.println("Tableau des Scores\n");    //affichage du nouveau tableau des scores
        for (int k=0; k<5;k++) {
            System.out.println(tabscore[k][0]+" "+tabscore[k][1]);
        }
    }


}
