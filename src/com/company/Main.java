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
        } else if (action.equals("6")) {
            res = cos();
            if (action.equals("quit")) {
                return false;
            }
        } else if (action.equals("7")) {
            res = sin();
            if (action.equals("quit")) {
                return false;
            }
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
        double n1 = Double.parseDouble(number);
        System.out.println("Enter the power");
        String power = enterTheSecondNumber();
        if (power.equals("quit")) {
            return false;
        }
        double n2 = Double.parseDouble(power);
        double res = n1;
        for (double i = 1; i < n2; i++) {
            res = res * n1;
        }
        System.out.print("Answer:" + "\t");
        System.out.println(res);
        return computing();
    }

    public static boolean cos() {
        System.out.println("Enter an angle");
        String angle = enterTheFirstNumber();
        if (angle.equals("quit")) {
            return false;
        }
//            cos angle = x1 - x2 + x3 - x4 + ... ;
//        wher x1 = 1 - first member of  series(the angle in radians);
//             x2 = angle^2/2! - second member of series;
//             x3 = angle^4/4! - third member of series;
//             x4 = angle^6/6! - fourth member of series;
//             etc.
//        Depending on what accuracy we need, we selecting how much members will have the series.
//        In our case three members will be enough
//        So our function will have the form:
//        cos angle = x1 - x2 + x3;
        double an = Double.parseDouble(angle);
        double Pi = 3.1415926535897;
        double ran = an * Pi / 180;//Transformation degrees in radians
        System.out.println(ran);
        double a = powForSinCos(ran, 2);
        System.out.println("a" + "\t" + a);
        double b = powForSinCos(ran, 4);
        double c = factorial(2);
        double d = factorial(4);
        double e = powForSinCos(ran, 6);
        double f = factorial(6);
        double x1 = 1;
        double x2 = a / c;
        double x3 = b / d;
        double x4 = e / f;
        double cos = x1 - x2 + x3 - x4;
        cos = ((double) Math.round(cos * 10000L)) / 10000L;
        System.out.println("Value of cos" + "\t" + cos);
        return computing();
    }

    public static boolean sin() {
        System.out.println("Enter an angle");
        String angle = enterTheFirstNumber();
        if (angle.equals("quit")) {
            return false;
        }
//        sin angle = x1 - x2 + x3 - x4 + x5 + ... ;
//        wher x1 = angle - first member of  series(the angle in radians);
//             x2 = angle^3/3! - second member of series;
//             x3 = angle^5/5! - third member of series;
//             x4 = angle^7/7! - fourth member of series;
//             etc.
//        Depending on what accuracy we need, we selecting how much members will have the series.
//        In our case three members will be enough
//        So our function will have the form:
//        sin angle = x1 - x2 + x3;
        double an = Double.parseDouble(angle);
        double Pi = 3.1415926535897;
        double ran = an * Pi / 180;//Transformation degrees in radians
        double a = powForSinCos(ran, 3);
        double b = powForSinCos(ran, 5);
        double c = factorial(3);
        double d = factorial(5);
        double sin = ran - a / c + b / d;
        sin = ((double) Math.round(sin * 10000L)) / 10000L;
        System.out.println("Value of sin" + "\t" + sin);
        return computing();
    }

    public static double powForSinCos(double base, double power) {
        double res = base;
        for (double i = 1; i < power; i++) {
            res = res * base;
        }
        return res;
    }

    public static double factorial(double number) {
        double res = 1;
        for (int i = 2; i <= number; i++) {
            res = res * i;
        }
        return res;
    }
}
