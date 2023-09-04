package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        //test Constructor
        Author author = new Author("Alex", "alex@gmail.com", 'm');
        //test toString
        System.out.println(author);
        //test getName
        System.out.println(author.getName());
        //test getEmail
        System.out.println(author.getEmail());
        //test getGender
        System.out.println(author.getGender());
        //test setEmail
        author.setEmail("alex2004@gmail.com");
        System.out.println(author);
    }
}
