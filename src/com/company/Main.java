package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        hello();
        String number1 = enterTheFirstNumber();
        validationOfEnter1(number1);
        String action = selectAction();
        validationOfEnter2(action);
        String number2 = enterTheSecondNumber();
        validationOfEnter3(number2);
        process(action, number1, number2);
    }

    public static void hello() {
        System.out.println("Hello! Let`s start");
    }

    public static String enterTheFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        return scanner.next();
    }

    public static String selectAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action");
        return scanner.next();
    }

    public static String enterTheSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the second number");
        return scanner.next();
    }

        public static void validationOfEnter1(String number1) {
        String q = "quit";
        if (number1.equals(q)) {
            quit();
        }
    }

    public static void validationOfEnter2(String action) {
        String q = "quit";
        String sum = "+";
        String sub = "-";
        String multi = "*";
        String div = "/";
        if (!action.equals(sum) && !action.equals(sub) && !action.equals(multi) && !action.equals(div)) {
            System.out.println("Incorrect enter");
            restart();
        }else if (action.equals(q)) {
            quit();
        }
    }

    public static void validationOfEnter3(String number2) {
        String q = "quit";
        if (number2.equals(q)) {
            quit();
        }
    }


    public static void process(String action, String nomber1, String nomber2) {
        double n1 = Double.parseDouble(nomber1);
        double n2 = Double.parseDouble(nomber2);
        String sum = "+";
        String sub = "-";
        String multi = "*";
        String div = "/";
        String q = "Quit";
        if (action.equals(sum)) {
            sum(n1, n2);
        } else if (action.equals(sub)) {
            subtraction(n1, n2);
        } else if (action.equals(multi)) {
            multiplication(n1, n2);
        } else if (action.equals(div)) {
            division(n1, n2);
        }
    }

    public static void sum(double n1, double n2) {
        double sum = n1 + n2;
        System.out.print("Sum:" + "\t");
        System.out.println(sum);
        restart();
    }

    public static void subtraction(double n1, double n2) {
        double sub = n1 - n2;
        System.out.print("subtraction:" + "\t");
        System.out.println(sub);
        restart();
    }

    public static void multiplication(double n1, double n2) {
        double multi = n1 * n2;
        System.out.print("multiplication:" + "\t");
        System.out.println(multi);
        restart();
    }

    public static void division(double n1, double n2) {
        double div = n1 / n2;
        System.out.print("division:" + "\t");
        System.out.println(div);
        restart();
    }

    public static void quit() {
        System.out.println("Good by!");
    }

    public static void restart() {
        String number1 = enterTheFirstNumber();
        validationOfEnter1(number1);
        String action = selectAction();
        validationOfEnter2(action);
        String number2 = enterTheSecondNumber();
        validationOfEnter3(number2);
        process(action, number1, number2);

    }
}
