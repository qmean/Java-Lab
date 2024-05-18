package org.example;

public class ObjectClassTest {
    public static void main(String[] args) {
        TestClass tc = new TestClass(1);
        TestClass tc2 = new TestClass(1);
        TestClass tc3 = tc;
        
        /**
         *  equals : 항상 참조값으로 비교하기 때문에 주소가 다르면 false 반환
         */
        System.out.println(tc.equals(tc2));
        System.out.println("(tc==tc2) : " + (tc==tc2));
        System.out.println("(tc==tc3) = " + (tc==tc3));

        /**
         * hashcode : 객체의 주소값을 가진
         */

    }
}

class TestClass {
    private int data;
    public TestClass() {
    }

    public TestClass(int data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
