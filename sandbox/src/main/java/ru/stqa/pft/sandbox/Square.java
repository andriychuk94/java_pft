package ru.stqa.pft.sandbox;

/**
 * Created by Boris on 07.06.2017.
 */
public class Square {

  public double l;

  public Square(double l/*передане значення*/) {
    /*для того щоб присвояте передана значення потрібно написати this.*/this.l = l; /*Щоб не писати double l = 5; ми записали функцію
    public Square(double len) {
    l = len;} - Це називається Конструктор*/
  }
}

