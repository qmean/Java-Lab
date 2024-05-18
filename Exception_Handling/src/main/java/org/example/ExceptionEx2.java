package org.example;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int num = 100;
        int retult;
        // 예외 발생시키기
        for (int i = 0; i < 10; i++) {
            retult = num / (int) (Math.random() * 10);
            System.out.println("retult = " + retult);
        }
    }
}
