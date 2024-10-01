package lang_package.wrapper_class;

public class WrapperAuto {
    public static void main(String[] args) {
        Integer i = 100; // Auto Boxing
        int i2 = i; // Auto Unboxing
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        i++; // Auto Unboxing -> Auto Boxing
        // 위의 코드는 아래와 같다
        // i = new Integer(i.intValue() + 1);
        System.out.println("i = " + i);
        i = i + i2; // Auto Unboxing -> Auto Boxing
        // 위의 코드는 아래와 같다
        // i = new Integer(i.intValue() + i2);
        System.out.println("i = " + i);
    }
}
