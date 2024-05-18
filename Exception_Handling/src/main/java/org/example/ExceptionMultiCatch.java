package org.example;

import org.example.sampleException.TestRuntimeException;

public class ExceptionMultiCatch {
    public static void main(String[] args) {
        int num = 100;
        int result;
        // 예외 발생시키고 catch 하기
        for (int i = 0; i < 10; i++) {
            try {
                result = num / (int) (Math.random() * 10);
                System.out.println("result = " + result);
            } catch (TestRuntimeException | ArithmeticException e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
