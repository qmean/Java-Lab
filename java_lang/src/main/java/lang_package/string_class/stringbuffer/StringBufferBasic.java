package lang_package.string_class.stringbuffer;

public class StringBufferBasic {
    public static void main(String[] args) {
        // StringBuffer Constructor
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer(10);

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.hashCode() = " + sb1.hashCode());
        sb1.append(" World!");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.hashCode() = " + sb1.hashCode());
    }
}
