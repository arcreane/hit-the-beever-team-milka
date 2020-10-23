package com.company;

import java.util.Scanner;
import java.io.Serializable;

public class GameOver implements Serializable {

    String score;
    String nameUser;
    Scanner EnterName = new Scanner(System.in);

    public String getScore() {
        return score;
    }

    public  String getName() {


        System.out.println("Enter your name: ");
        this.nameUser = this.EnterName.nextLine();

        System.out.println(this.nameUser);

        return this.nameUser;
    }
    public  String Score(int score) {
        this.score = String.valueOf(score);
        this.nameUser = this.EnterName.nextLine();

        //while(10 sec) {
        System.out.println(this.nameUser + " Vous avez " + this.score);
        //}
        //renvois sur le menu de relancement


        return (this.score + this.nameUser);
    }


}
