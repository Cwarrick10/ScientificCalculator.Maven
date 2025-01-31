package com.zipcodewilmington.scientificcalculator;

// import com.sun.tools.javac.Main;
// import java.io.Console;

import java.lang.Math;

public class Calculator {

    public void Arithmetic() {
        double result;
        String ans;
        String choiceString = MainApplication.varSpace.userChoice;
        //String choiceString = "/";
        // MainApplication activeCalc = new MainApplication();

        // Input section
        double x = MainApplication.varSpace.num1;
        double y  = MainApplication.varSpace.num2;

        switch (choiceString) {
            // Case 1
            case "+" -> {
                // Print statement corresponding case
                //x = x;
                y = y;
                // break keyword terminates the
                result = add(x, y);
                System.out.printf("adding %.4f and %.4f gives %.4f\n",x,y, result);
            }
            // Case 2
            case "-" -> {
                // Print statement corresponding case
                result = subtract(x, y);
                System.out.printf("subtracting %.4f from %.4f gives %.4f\n",y,x,result);
            }

            // Case 3
            case "*" -> {
                // Print statement corresponding case
                result = multiply(x, y);
                System.out.printf("multiplying %.4f by %.4f gives %.4f\n",x,y,result);
            }
            // Case 4
            case "/" -> {
                // Print statement corresponding case
                result = divide(x,y);
                System.out.printf("dividing %.4f by %.4f gives %.4f \n",x,y,result);
            }
            case "square" -> {
                // Print statement corresponding case
                result = sqr(x);
                System.out.printf("the square of %.4f is %.4f \n",x,result);
            }
            case "sqrt" -> {
                // Print statement corresponding case
                if (x > 0) {
                    result = root(java.lang.Math.abs(x));
                    System.out.printf("the square root of %.4f is %.4f \n",x,result);
                } else {
                    System.out.printf("ERROR");
                }

            }
            case "1/x" -> {
                // Print statement corresponding case
                result = inverse(x);
                System.out.printf("the inverse of %.4f is %.4f ",x,result);
            }
            case "+/-" -> {
                // Print statement corresponding case
                result = invertSign(x);
                System.out.printf("reversed sign: %.4f ",result);
            }
            case "x^y" -> {
                // Print statement corresponding case
                result = sqrY(x, y);
                System.out.printf("%.4f to the power of %.4f is %.4f ",x,y,result);
            }
            default ->
                // Print statement corresponding case
                System.out.println("Err, no match");
        }
        // ans = String.format(String.valueOf(result));

    }


    // Operator Choice

	// System.out.println("Choose an operator from '+' '-' '*' '/' '^sq' '^exp' '^y' '^neg 'inv'");

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return (x / y);
    }

    public double sqr(double x) {
        return Math.pow(x, 2);  //
    }

    public double sqrY(double x, double y) {
        return Math.pow(x, y);
    }

    public double root(double x) {
        return Math.sqrt(x);
    }

    public double inverse(double x) {
        return Math.expm1(x);
    }

    public double invertSign(double x) {
        return x*-1;
    }


    ///////////////// refer to private functions here

}
