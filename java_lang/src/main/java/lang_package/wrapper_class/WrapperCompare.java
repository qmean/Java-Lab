package lang_package.wrapper_class;

public class WrapperCompare {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println("i == i2 : " + (i == i2));
        System.out.println("i.equals(i2) = " + i.equals(i2));
        Integer test1 = 100;
        Integer test2 = 100;
        System.out.println("test1 == test2 : " + (test1 == test2));
    }
}
