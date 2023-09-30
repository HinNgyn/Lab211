package Model;

import View.Validation;

public class Manager {
    //allow user calculate Superlative Equation

    public void superlativeEquation() {
        Validation vd = new Validation();
        System.out.print("Enter A: ");
        double a = vd.checkInputDouble();
        System.out.print("Enter B: ");
        double b = vd.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        displayOddEvenSquareInSuperLativeEquation(a, b, x);

    }

    public void displayOddEvenSquareInSuperLativeEquation(double a, double b, double x) {
        Validation vd = new Validation();
        System.out.print("Number is odd: ");
        if (vd.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (vd.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (vd.checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (vd.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (vd.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (vd.checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (vd.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (vd.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (vd.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //allow user calculate Quadratic Equation
    public void quadraticEquation() {
        Validation vd = new Validation();
        System.out.print("Enter A: ");
        double a = vd.checkInputDouble();
        System.out.print("Enter B: ");
        double b = vd.checkInputDouble();
        System.out.print("Enter C: ");
        double c = vd.checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        displayOddEvenSquareInQuadraticEquation(a, b, c, x1, x2);
    }

    public void displayOddEvenSquareInQuadraticEquation(double a, double b, double c, double x1, double x2) {
                Validation vd = new Validation();
        System.out.print("Number is odd: ");
        if (vd.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (vd.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (vd.checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (vd.checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (vd.checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (vd.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (vd.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (vd.checkEven(c)) {
            System.out.print(b + " ");
        }
        if (vd.checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (vd.checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (vd.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (vd.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (vd.checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (vd.checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (vd.checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();

    }
}
