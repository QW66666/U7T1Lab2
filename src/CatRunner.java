import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat bobby = new Cat("Bobby");
        Cat doggy = new Cat("Doggy");
        Cat poppy = new Cat("Poppy");
        cats.add(bobby);
        cats.add(doggy);
        cats.add(poppy);
        System.out.println(cats);

        Cat cat4 = new Cat("Toby");
        Cat catReplaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(catReplaced);
        cats.get(1).setName(cats.get(1).getName() + " Meow");
        System.out.println(cats);
        System.out.println(cats.get(2).getName());

    }
}
