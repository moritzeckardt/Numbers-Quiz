package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables
        int answer = 0;
        int min = 1;
        int max = 1000;
        int number = 500;
        int attempt = 1;

        //Print menu
        System.out.println("----------- NUMBERS QUIZ -----------");
        System.out.println(" ● Think about a number between 1 and 1000");
        System.out.println(" ● The computer will know your number shortly");
        System.out.println();
        System.out.println("----------- LET'S GO -----------");

        //Quiz
        do {
            System.out.println("Is " + number + " your number?              => Please press 1");
            System.out.println("Is your number less than " + number + "?    => Please press 2");
            System.out.println("Is your number greater than " + number + "? => Please press 3");

            Scanner sc = new Scanner(System.in);
            System.out.print("==> Answer: ");
            answer = sc.nextInt();

            if(answer == 1) {
                System.out.println("--------------------------------");
                System.out.println("==> Your number is: " + number);
                System.out.println("==> Number of attempts: " + attempt);
            }
            else if(answer == 2) {
                System.out.println("--------------------------------");
                max = number;
                number = getNextNumber(max, min);
                attempt++;
            }
            else if(answer == 3) {
                System.out.println("--------------------------------");
                min = number;
                number = getNextNumber(max, min);
                attempt++;
            }
            else {
                System.out.println("--------------------------------");
                System.out.println("==> Wrong input. The program is terminated.");
            }
        }
        while (answer == 2 || answer == 3);
    }

    //Methods
    public static int getNextNumber(int max, int min) {
        return (max + min) / 2;
    }
}
