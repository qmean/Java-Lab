package org.example;

public class ExceptionMethod {
    public static void main(String[] args) {
        int num = 100;
        int result;
        // 예외 발생시키고 catch 하기
        for (int i = 0; i < 10; i++) {
            try {
                result = num / (int) (Math.random() * 10);
                System.out.println("result = " + result);
            } catch (Exception e) {
                /**
                 *  예외 인스턴스에는 예외에 대한 정보가 담겨있음
                 *  예외의 stacktrace를 출력
                 *  예외의 message를 가져옴
                  */
                e.printStackTrace();
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }
}
