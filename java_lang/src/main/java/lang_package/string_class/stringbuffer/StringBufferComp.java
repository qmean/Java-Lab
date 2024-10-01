package lang_package.string_class.stringbuffer;

public class StringBufferComp {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        // 두 객체의 주소값이 다르므로 false
        System.out.println("sb1 == sb2 : " + (sb1 == sb2));
        // 두 객체의 문자열이 같으므로 true
        System.out.println("sb1.equals(sb2) = " + sb1.equals(sb2));
        // StringBuilder 의 비교법
        System.out.println("sb1 = sb2 : " + sb2.toString().equals(sb1.toString ()));
    }
}
