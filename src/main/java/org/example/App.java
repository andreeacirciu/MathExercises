package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number:");
        String secondNumber = scanner.nextLine();

        double a =Double.parseDouble(firstNumber);
        double b = Double.parseDouble(secondNumber);

        System.out.println( "The sum of the numbers is:" );
        Sum sum =new Sum();
        sum.sum(a, b);

        System.out.println("The subtraction of the numbers is:");
        Subtraction subtraction = new Subtraction();
        subtraction.subtraction(a, b);

        System.out.println("The multiplication of the numbers is:");
        Multiplication multiplication= new Multiplication();
        multiplication.multiplication(a, b);

        System.out.println("The division of the numbers is:");
        Division division = new Division();
        division.division(a, b);
    }
}
