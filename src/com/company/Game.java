
package com.company;


public class Game{

    int m = 8;
    int f = 6;   // "  "   facile
    int d = 11; // " "     difficile



    int[][] difficile = new int[d][d];
    int[][] facile = new int[f][f];
    int[][] moyen = new int[m][m];
    static boolean endGame;
    public int[][] initialisation() {
        int i;
        int j;
        int x;
        int y;
        for (i = 0; i < d; i = i + 1) {
            for (j = 0; j < d-1; j = j + 1) {
                difficile[i][j] = 0;
            }
        }

        // Création du point aléatoire (position xy)
        x = (int) (Math.random() * d-1);
        y = (int) (Math.random() * d-1);
        difficile[x][y] = 1 - difficile[x][y];
        endGame = false;
        return difficile;
    }
    // Grille de jeu en fonction du niveau (facile, moy, diff)
    public void affiche_jeu(int[][] situation) {
        int i;
        int j;

        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        for (i = 0; i < d-1; i += 1) {
            System.out.print(i + "  ");
            for (j = 1; j < d; j += 1) {
                if (situation[i][j] == 0) {
                    System.out.print("- ");

                }  // import de l'image du singe (postion Random xy)
                if (situation[i][j] == 1) {
                    System.out.print("\uD83D\uDC35 ");
                }
            }
            System.out.println();
        }
    }
    public void main(String[] args) {
        difficile = initialisation();
        affiche_jeu(difficile);

    }


}





