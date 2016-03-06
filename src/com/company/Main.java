package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        hello();
        boolean result = computing();
        quit(result);
    }

    public static void hello() {
        System.out.println("Hello! Let`s start");
        System.out.println();
    }

    public static void listOfOparetion() {
        System.out.println("You can use these operations:");
        System.out.print("Sum enter 1" + "\t" + "\t");
        System.out.print("Subtraction enter 2" + "\t" + "\t");
        System.out.print("Multiplication enter 3" + "\t" + "\t");
        System.out.println("division enter 4" + "\t" + "\t");
        System.out.print("power enter 5" + "\t" + "\t");
        System.out.print("cos enter 6" + "\t" + "\t");
        System.out.print("sin enter 7" + "\t" + "\t");
        System.out.println("If You want to quit write <<quit>>");
        System.out.println();
    }

    public static String enterTheFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String selectAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation");
        return scanner.next();
    }

    public static String enterTheSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void quit(boolean m) {
        if (m == false) {
            System.out.println("Good by!");
        }
    }

    public static boolean computing() {
        listOfOparetion();
        String action = selectAction();
        if (action.equals("quit")) {
            return false;
        }

        boolean res;
        if (action.equals("1")) {
            res = sum();
            if (action.equals("quit")) {
                return false;
            }
        } else if (action.equals("2")) {
            res = subtraction();
            if (action.equals("quit")) {
                return false;
            }
        } else if (action.equals("3")) {
            res = multiplication();
            if (action.equals("quit")) {
                return false;
            }
        } else if (action.equals("4")) {
            res = division();
            if (action.equals("quit")) {
                return false;
            }
        } else if (action.equals("5")) {
            res = pow();
            if (action.equals("quit")) {
                return false;
            }
            //        } else if (action.equals(6)) {
//            cos();
//        } else if (action.equals(7)) {
//            sin();
        } else {
            System.out.println("You entered unknown operation");
            return computing();
        }
        return res;
    }


    public static boolean sum() {
        System.out.println("Enter the first summand");
        String summand1 = enterTheFirstNumber();
        if (summand1.equals("quit")) {
            return false;
        }
        double n1 = Double.parseDouble(summand1);
        System.out.println("Enter the second summand");
        String summand2 = enterTheSecondNumber();
        if (summand2.equals("quit")) {
            return false;
        }
        double n2 = Double.parseDouble(summand2);
        double sum = n1 + n2;
        System.out.print("Sum:" + "\t");
        System.out.println(sum);
        return computing();
    }


    public static boolean subtraction() {
        System.out.println("Enter the minuend");
        String minuend = enterTheFirstNumber();
        if (minuend.equals("quit")) {
            return false;
        }
        double n1 = Double.parseDouble(minuend);
        System.out.println("Enter the subtrahend");
        String subtrahend = enterTheSecondNumber();
        if (subtrahend.equals("quit")) {
            return false;
        }
        double n2 = Double.parseDouble(subtrahend);
        double sub = n1 - n2;
        System.out.print("subtraction:" + "\t");
        System.out.println(sub);
        return computing();
    }

    public static boolean multiplication() {
        System.out.println("Enter the multiplicand");
        String multiplicand = enterTheFirstNumber();
        if (multiplicand.equals("quit")) {
            return false;
        }
        double n1 = Double.parseDouble(multiplicand);
        System.out.println("Enter the multiplier");
        String multiplier = enterTheSecondNumber();
        if (multiplier.equals("quit")) {
            return false;
        }
        double n2 = Double.parseDouble(multiplier);
        double multi = n1 * n2;
        System.out.print("multiplication:" + "\t");
        System.out.println(multi);
        return computing();
    }

    public static boolean division() {
        System.out.println("Enter the dividend");
        String divident = enterTheFirstNumber();
        if (divident.equals("quit")) {
            return false;
        }
        double n1 = Double.parseDouble(divident);
        System.out.println("Enter the divider");
        String divider = enterTheSecondNumber();
        if (divider.equals("quit")) {
            return false;
        }
        double n2 = Double.parseDouble(divider);
        double div = n1 / n2;
        System.out.print("division:" + "\t");
        System.out.println(div);
        return computing();
    }

    public static boolean pow() {
        System.out.println("Enter a number, wich erected in power");
        String number = enterTheFirstNumber();
        if (number.equals("quit")) {
            return false;
        }
        int n1 = Integer.parseInt(number);
        System.out.println("Enter the power");
        String power = enterTheSecondNumber();
        if (power.equals("quit")) {
            return false;
        }
        int n2 = Integer.parseInt(power);
        int res = 1;
        int[] mas = new int[n2];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = n1;
        }
        for (int i = 0; i < mas.length; i++) {
            res = res * mas[i];
        }
        System.out.print("Answer:" + "\t");
        System.out.println(res);
        return computing();
    }

//    public static boolean cos(){
//
//    }
//
//    public static boolean sin(){
//
//    }

}
