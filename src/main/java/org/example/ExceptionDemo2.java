package org.example;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(1, 0));
        }catch (ArithmeticException e ){
            System.out.println(e.getMessage());
        }
    }
    private static int divide(int dividend, int dividsor){
        if(dividsor == 0) throw new ArithmeticException(("Cannot divide by zero"));
        return dividend / dividsor;
    }
}
