package org.example;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how

        try{
            try {
                System.out.println("going to divide");
                int num = 12 / 0;
            }catch (ArithmeticException e ){
                System.out.println(e);
            }finally {
                System.out.println("ok");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static void validate(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Not real age");
        }
        System.out.println(age); // no need to catch
    }
}