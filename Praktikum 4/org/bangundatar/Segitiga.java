package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
  private double alas, tinggi;

  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public double hitungLuas() {
    return alas * tinggi * 1/2;
  }

  public void printInfo() {
    System.out.println("Segitiga dengan alas " + this.alas + " dan tinggi " + this.tinggi);
  } 


}
