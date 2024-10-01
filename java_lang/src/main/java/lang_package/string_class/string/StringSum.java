package lang_package.string_class.string;

public class StringSum {
    public static void main(String[] args) {
        String s1;
        String s2;
        s1 = "Hello";
        s2 = "Hello";
        System.out.println("s1.hashCode() = " + s1.hashCode());
        //String 은 덧셈 연산을 할 시에 새로운 String 객체를 생성한다.
        s1 = s1 + s2;
        System.out.println("s1 = " + s1);
        System.out.println("s1.hashCode() = " + s1.hashCode());
    }
}
