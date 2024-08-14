package com.rakshanaa;
class Employee {
 private String name;
 private String jobTitle;
 private double salary;

 public Employee(String name, String jobTitle, double salary) {
     this.name = name;
     this.jobTitle = jobTitle;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getJobTitle() {
     return jobTitle;
 }

 public void setJobTitle(String jobTitle) {
     this.jobTitle = jobTitle;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 public void applyRaise(double percentage) {
     if (percentage > 0) {
         salary += salary * (percentage / 100);
     }
 }

 public void printDetails() {
     System.out.println("Name: " + name);
     System.out.println("Job Title: " + jobTitle);
     System.out.println("Salary: $" + salary);
 }

 public static void main(String[] args) {
     Employee employee = new Employee("Rakshanaa", "Software Engineer", 85000);
     System.out.println("Initial Employee Details:");
     employee.printDetails();
     System.out.println(); 
     employee.applyRaise(10);
     System.out.println("Updated Employee Details:");
     employee.printDetails();
 }
}

