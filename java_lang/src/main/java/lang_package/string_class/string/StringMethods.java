package lang_package.string_class.string;

public class StringMethods {
    public static void main(String[] args) {
        String s1;
        String s2;

        s1 = "Hello1";
        s2 = "Hello2";
        // 특정 인덱스의 문자를 리턴 없다면 IndexOutOfBoundsException 발생
        System.out.println("s1.charAt(0) = " + s1.charAt(0));
        // 두 문자열을 비교하여 같으면 0, 다르면 0이 아닌 값을 리턴
        System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
        // 두 문자열을 합쳐 새로운 문자열을 리턴
        System.out.println("s1.concat(s2) = " + s1.concat(s2));
        // 인자로 들어온 문자열이 포함되어 있으면 true, 아니면 false
        System.out.println("s1.contains(\"Hello\") = " + s1.contains("Hello"));
        // 문자열의 길이를 리턴
        System.out.println("s1.length() = " + s1.length());
        // 문자열을 교체 후 리턴
        System.out.println("s1.replace(\"Hello\", \"Hi\") = "
                + s1.replace("Hello", "Hi"));
        // 지정된 분리자로 나누어 문자열 배열로 리턴
        String[] split = s1.split("l");
        for (String s : split) {
            System.out.println("s = " + s);
        }
        // 주어진 시작위치부터 끝위치 범위의 문자열을 리턴
        System.out.println("s1.substring(0, 3) = " + s1.substring(0, 3));
    }
}
