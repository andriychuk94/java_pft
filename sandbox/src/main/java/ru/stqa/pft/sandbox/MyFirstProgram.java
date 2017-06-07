package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Boris");

    Square s = new Square(5); /*Щоб не писати double l = 5; ми в конструкторі пишемо параметри квадрата*/
    System.out.println("Площа квадрата зі стороною " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4,6);/*Щоб не писати double a = 4 a double b = 6; ми в конструкторі пишемо параметри квадрата*/
    System.out.println("Площа прямокутника зі сторонами " + r.a + " і " + r.b + " = " + area(r));
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r){
    return r.a * r.b;
  }
}
