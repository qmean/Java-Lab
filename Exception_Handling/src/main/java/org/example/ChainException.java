package org.example;

public class ChainException {
    public static void main(String[] args) {
        try {
            chainException();
        } catch (Exception1 e1) {
            System.out.println("e1.getCause().getMessage() = " + e1.getCause().getMessage());
            System.out.println("e1.getMessage() = " + e1.getMessage());
        }
    }

    static void chainException() throws Exception1 {
        try {
            throwException2();
        } catch (Exception2 e) {
            Exception1 ex1 = new Exception1("Exception1 thrown", e);
            throw ex1;
        }
    }

    static void throwException2() throws Exception2 {
        throw new Exception2("Exception2 thrown");
    }
}

class Exception1 extends Exception {
    public Exception1(String message) {
        super(message);
    }

    public Exception1(String message, Throwable cause) {
        super(message, cause);
    }
}

class Exception2 extends Exception {
    public Exception2(String message) {
        super(message);
    }

    public Exception2(String message, Throwable cause) {
        super(message, cause);
    }
}
