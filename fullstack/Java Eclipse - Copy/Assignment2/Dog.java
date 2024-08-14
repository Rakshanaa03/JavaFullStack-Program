package com.rakshanaa;


class Dog {
 private String name;
 private String breed;

 public Dog(String name, String breed) {
     this.name = name;
     this.breed = breed;
 }
 public void setName(String name) {
     this.name = name;
 }

 public void setBreed(String breed) {
     this.breed = breed;
 }
 public void printDetails() {
     System.out.println("Name: " + name);
     System.out.println("Breed: " + breed);
 }


 public static void main(String[] args) {
     Dog dog1 = new Dog("Buddy", "Golden Retriever");
     Dog dog2 = new Dog("Max", "Bulldog");

     System.out.println("Initial details of Dog 1:");
     dog1.printDetails();
     System.out.println();

     System.out.println("Initial details of Dog 2:");
     dog2.printDetails();
     System.out.println(); 
     dog1.setName("Charlie");
     dog1.setBreed("Labrador");
     dog2.setName("Rocky");
     dog2.setBreed("Beagle");
     System.out.println("Updated details of Dog 1:");
     dog1.printDetails();
     System.out.println(); 
     System.out.println("Updated details of Dog 2:");
     dog2.printDetails();
 }
}
