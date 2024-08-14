package com.rakshanaa;

class Circle {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }
 public double getRadius() {
     return radius;
 }
 public void setRadius(double radius) {
     this.radius = radius;
 }
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
 public double calculateCircumference() {
     return 2 * Math.PI * radius;
 }
 public void printDetails() {
     System.out.println("Radius: " + radius);
     System.out.println("Area: " + calculateArea());
     System.out.println("Circumference: " + calculateCircumference());
 }
 public static void main(String[] args) {
     Circle circle = new Circle(7.0);
     System.out.println("Initial details of the Circle:");
     circle.printDetails();
     System.out.println();
     circle.setRadius(10.0);
     System.out.println("Updated details of the Circle:");
     circle.printDetails();
 }
}
