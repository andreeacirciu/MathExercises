package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);

        //introduc doar int-uri dar nu stiu cum sa pot introduce orice ca sa isi aleaga singur metoda de care are nevoie, adica nu stiu daca e posibil :))
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("The sum of the numbers is:");
        Sum sum = new Sum();
        sum.sum(firstNumber, secondNumber);

        System.out.println("The subtraction of the numbers is:");
        Subtraction subtraction = new Subtraction();
        subtraction.subtraction(firstNumber, secondNumber);

        System.out.println("The multiplication of the numbers is:");
        Multiplication multiplication = new Multiplication();
        multiplication.multiplication(firstNumber, secondNumber);


        System.out.println("The division of the numbers is:");
        Division division = new Division();
        division.division(firstNumber, secondNumber);
    }
}


