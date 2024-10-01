package lang_package.wrapper_class;

public class WrapperTest {
    public static class Data {
        Integer a = 1;
    }
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println("before test : " + data.a);
        test(data.a);
        System.out.println("after test : " + data.a);
    }
    static void test(Integer integer) {
        integer++;
        System.out.println("test : " + integer);
    }
}
