package org.example;

public class ExceptionReThrow {
    public static void main(String[] args) {
        try {
            throwException1();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    static void throwException1() throws Exception {
        try {
            throwException2();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            throw new Exception("Exception Thrown2");
        }
    }

    static void throwException2() throws Exception {
        throw new Exception("Exception Thrown1");
    }
}
