package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

    public static void main(String[] args) {
        hello("Pidor");
        hello("Pidor");
        hello("Pidor");

        double len = 5;
        System.out.println("Площадь квадрата со сторой " + len + " = " + area(len) );

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

    }
    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + '!');


        double l = 8;
        double s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + " = " + (s * s));

    }
    public static double area(double l) {
        return l * l;

    }

    public static double area(double a, double b) {
        return a * b;
    }
}