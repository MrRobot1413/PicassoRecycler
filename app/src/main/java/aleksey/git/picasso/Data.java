package aleksey.git.picasso;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<Cat> cats = new ArrayList<>();

    static List<Cat> getCats(){
        Cat cat = new Cat("Барсик", "не лысый кот", "https://images.indianexpress.com/2019/04/cat_1200getty.jpg");

        for(int i = 0; i < 10; i++){
            cats.add(cat);
        }

        return cats;
    }
}
