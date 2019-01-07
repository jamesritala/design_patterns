package za.co.ritzsoft.funeasteregg;

import java.util.Random;
import java.util.Scanner;

/*
* This is probaly the most useless code in this project. But I stopped working on the project for a minute because
* my wife was bothering me and I wanted her to feel wat it was like to write code , so we agreed to do this simple program
* together.
* */
public class GuessingGame {

    public static void main(String args[]){

        System.out.println("I'm thinking of a number between 1 and 5. What number am I thinking of?\n");
        int guess=0;
        int computerGeneratedNumber= 0;
        Random rand= new Random();
        computerGeneratedNumber=rand.nextInt(5);
        //System.out.println("Random: "+computerGeneratedNumber);
        Scanner scan= new Scanner(System.in);
        do{
            guess= scan.nextInt();
            if(guess!=computerGeneratedNumber)
                System.out.println("Wrong! Try again. Enter another number below....\n");
        }while(guess!=computerGeneratedNumber);
        System.out.println("You got it. I was thinking of "+computerGeneratedNumber);
    }
}
