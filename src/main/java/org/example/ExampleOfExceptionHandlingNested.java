package org.example;

import java.io.IOException;

public class ExampleOfExceptionHandlingNested {

    public ExampleOfExceptionHandlingNested(){

    }
    void m() throws IOException {
        throw new IOException("device error"); // checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        }catch (Exception e){
            System.out.println("eException handled");
        }
    }

    public static void main(String[] args) {
        ExampleOfExceptionHandlingNested example = new ExampleOfExceptionHandlingNested();

        example.p();
    }

}

