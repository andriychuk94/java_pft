package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Boris");

    double l = 5;
    System.out.println("Площа квадрата зі стороною " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площа прямокутника зі сторонами " + a + " і " + b + " = " + area(a, b));
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
    /*Для повернення результату потрібно написати return тип повертання результату вказується перед назвою
     * функцію в нашому випадку  public static тип повернення результату  !!double!! тобто число (5.0...100.0)*/
  }

  public static double area(double a, double b) {
    return a*b;
  }
}
