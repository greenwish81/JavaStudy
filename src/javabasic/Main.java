import javabasic.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person s = new Person("happy", 29);

        String favoriteFood = s.eat("한식");

        System.out.println(favoriteFood);


//        System.out.printf("%s%n", "Hello Java");
//        System.out.printf("%s%n", "Kim" + "Coding");
//        System.out.printf("%d%n", 3+6);
//        System.out.printf("지금은 %s 입니다%n", 2022 + "year");
//        System.out.printf("나는 %c%s 입니다", '최', "소망");
//
//
//        Scanner scanner = new Scanner(System.in);
//        String inputValue = scanner.nextLine();
//
//        System.out.println(inputValue);
//
//        String name1 = "Kim Coding";
//        String name2 = "Kim Coding";
//
//        String name3 = new String("Kim Coding");
//        String name4 = new String("Kim Coding");
//
//        boolean comparison1 = name1 == "Kim Coding";
//        boolean comparison2 = name1 == name2;
//        boolean comparison3 = name1 == name3;
//        boolean comparison4 = name3 == name4;
//        boolean comparison5 = name1.equals("Kim Coding");
//        boolean comparison6 = name1.equals(name3);
//        boolean comparison7 = name3.equals(name4);
//
//        System.out.println(comparison1);
//        System.out.println(comparison2);
//        System.out.println(comparison3);
//        System.out.println(comparison4);
//        System.out.println(comparison5);
//        System.out.println(comparison6);
//        System.out.println(comparison7);
    }
}

