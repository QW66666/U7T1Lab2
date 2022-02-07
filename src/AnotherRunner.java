import java.util.ArrayList;
import java.util.Arrays;
public class AnotherRunner {
    public static void main(String[] args) {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};
        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car[] carList = {new Car("Mercedes", 1000), new Car("BMW", 2000), new Car("Audi", 3000)};
        ArrayList<Car> carsList = new ArrayList<Car>(Arrays.asList(carList));
        System.out.println(carsList);


    }
}
