//Ilia Safarian//
package com.ilia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter an operator: ( + , - , * , / ) ");

        Scanner myOperator = new Scanner(System.in);
        char operator = myOperator.next().charAt(0);

        System.out.print("Please enter a number: ");
        double n1 = myOperator.nextDouble();

        System.out.print("Please enter another number: ");
        double n2 = myOperator.nextDouble();

        if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            throw new ArithmeticException("The operator you entered is invalid");
        }

        if (operator == '/' && n2 == 0.0) {
            throw new ArithmeticException("The Denominator Can not be zero!");
        }

        switch (operator) {
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case '/':
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default:
                System.out.println("The operator you entered is invalid.");
        }
    }
}
