package javabasic;

public class compareToExample {
    public static void main(String[] args) {

        String str = new String("abcd");
        System.out.println("문자열 : " + str);
        System.out.println(str.compareTo("bcef"));
        System.out.println(str.compareTo("abcd" + "\n"));
        System.out.println(str.compareTo("Abcd"));
        System.out.println(str.compareToIgnoreCase("Abcd"));
        System.out.println("compareTo() 메서드 호출 후 문자열 :" + str);
    }
}
