package DI_DependencyInjection;

import java.util.ArrayList;

public class Bascket {
    // DI 미적용 코드
//    public Apple a;
//    public Mango b;
//    public Kiwi c;
//
//    public Bascket(Apple a, Mango b, Kiwi c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    public void printContains() {
//        a.whoamI();
//        b.whoamI();
//        c.whoamI();
//    }


    // DI 적용 코드
    ArrayList<Fruit> fruitArr = new ArrayList<>();

    public Bascket(ArrayList<Fruit> fruitArr) {
        this.fruitArr = fruitArr;
    }

    public void printContains() {
        for(Fruit fru : fruitArr) {
            fru.whoamI();
        }
    }
}
