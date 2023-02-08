package javabasic;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //함수 Eat -> public, string 반환, 매개변수 string "음식"

    public String eat(String food) {
        String result = "";
        result = food + "먹습니다";
        return result;
    };
}
