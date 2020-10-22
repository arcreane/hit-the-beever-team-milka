package com.company;

import java.util.Random;

public class Main {


    static int d = 11;  // niveau difficile
    static int m = 8;   // "  "   moyen
    static int f = 6;   // "  "   facile

    // tableau de jeu
    static int[][] position = new int[d][d];
    static boolean endGame;
    public static int[][] initialisation() {
        int i;
        int j;
        int x;
        int y;
        for (i = 0; i < d; i = i + 1) {
            for (j = 0; j < d; j = j + 1) {
                position[i][j] = 0;
            }
        }
        x = (int) (Math.random() * d);
        y = (int) (Math.random() * d);
        position[x][y] = 1 - position[x][y];
        endGame = false;
        return position;
    }
    // Grille de jeu en fonction du niveau (facile, moy, diff)
    public static void affiche_jeu(int[][] situation) {
        int i;
        int j;

        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        for (i = 0; i < d; i += 1) {
            System.out.print(i + "  ");
            for (j = 1; j < d; j += 1) {
                if (situation[i][j] == 0) {
                    System.out.print("- ");

                }  // import de l'image du singe si
                if (situation[i][j] == 1) {
                    System.out.print("\uD83D\uDC35 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        position = initialisation();
        affiche_jeu(position);
    }
}

