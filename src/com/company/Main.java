package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Try to guess my number between 0 and 20");
        int x = 0;
        while (x<5){
            int Userinput = input.nextInt();
            int randomNumber=random.nextInt(20);
            if(Userinput==randomNumber) {
                System.out.println("You got it!");
            }
            else{
                System.out.println("Nope! Try again");
            }
        }



    }
}
