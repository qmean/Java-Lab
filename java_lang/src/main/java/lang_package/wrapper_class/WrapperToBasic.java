package lang_package.wrapper_class;

public class WrapperToBasic {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        int i2 = i.intValue();
        int i3 = i; // Auto Unboxing
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
