package lang_package.string_class.stringbuffer;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        String s = " World!";
        // 문자열을 뒤에 추가 (append)
        sb1.append(s);
        System.out.println("=========== append ===========");
        System.out.println("sb1 = " + sb1);
        // 문자열을 삭제 (delete)
        sb1.delete(0, 5);
        System.out.println("=========== delete ===========");
        System.out.println("sb1 = " + sb1);
        // 문자열을 중간에 추가 (insert)
        sb1.insert(5, "My");
        System.out.println("=========== insert ===========");
        System.out.println("sb1 = " + sb1);
    }
}
