package com.rakshanaa;

class Book {
 private String title;
 private String author;
 private String isbn;

 public Book(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
 }

 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getAuthor() {
     return author;
 }
 public void setAuthor(String author) {
     this.author = author;
 }
 public String getIsbn() {
     return isbn;
 }
 public void setIsbn(String isbn) {
     this.isbn = isbn;
 }
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
 }

 public static void main(String[] args) {
     Book book = new Book("1984", "George Orwell", "978-0451524935");

     System.out.println("Initial Book Details:");
     book.displayDetails();
     System.out.println(); 
     book.setTitle("Animal Farm");
     book.setAuthor("George Orwell");
     book.setIsbn("978-0452284241");

     System.out.println("Updated Book Details:");
     book.displayDetails();
 }
}
