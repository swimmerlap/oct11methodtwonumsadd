package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        promptUser();
    }

    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = keyboard.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = keyboard.nextInt();

        int sum = AddTwoNumbers(num1, num2);
        System.out.println(sum);
    }

    public static int AddTwoNumbers(int num1, int num2){ // method header
        // method body
        int sum = 0;
        sum = num1 + num2;

        return sum;
    }
}

