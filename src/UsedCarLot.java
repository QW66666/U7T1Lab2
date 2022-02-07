import java.util.ArrayList;

/**
 * This class represents a UsedCarLot object
 *
 * @author Qihong Wu
 *
 */
public class UsedCarLot {
    /** The ArrayList of Car */
    private ArrayList<Car> inventory;

    /** Initiates a UsedCarLot Object */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Method to return the ArrayList of Car
     *
     * @return the inventory of Car
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Method to add a Car object to the ArrayList inventory
     *
     * @param car The Car object to add
     */
    public void addCar(Car car)
    {
        inventory.add(car);
    }

    /**
     * Method to add a Car object to the ArrayList inventory at specified index and increase inventory size by 1
     *
     * @param indexToAdd The index to add the Car object to
     * @param carToAdd The Car object to add to inventory
     *
     * <p>
     * PRECONDITION: indexToAdd => 0
     *               indexToAdd &lt; inventory.size()
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Method to "sell"/remove a Car from inventory and shifting every Car object to the left to fill the gap and reduce the inventory size by 1
     *
     * @param indexOfCarToSell The index of the Car to sell
     * @return The Car that was sold/removed from inventory
     *
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car removedCar = inventory.remove(indexOfCarToSell);
        return removedCar;
    }

    /**
     * Method to sell/remove a Car from inventory and replacing the object with null
     * <p>
     * Does NOT reduce the size of inventory
     *
     * @param indexOfCarToSell The index of the Car object to sell
     * @return The Car that was sold/removed from inventory
     *
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car carToSell = inventory.get(indexOfCarToSell);
        inventory.add(indexOfCarToSell, null);
        inventory.remove(indexOfCarToSell+1);
        return carToSell;
    }

    /**
     * Method to move a Car from indexOfCarToMove to destinationIndex
     * <p>
     * if destinationIndex > indexOfCarToMove, moves the Car to the right in inventory; if destinationIndex &lt; indexOfCarToMove, moves the Car to the left in the inventory. All other cars in the inventory
     * should shift accordingly
     * @param indexOfCarToMove The index of the Car to move
     * @param destinationIndex The destination index to move the Car object to
     *
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        if(indexOfCarToMove < inventory.size() && destinationIndex < inventory.size())
        {
            Car carToMove = inventory.get(indexOfCarToMove);
            inventory.remove(indexOfCarToMove);
            inventory.add(destinationIndex, carToMove);
        }
    }

    /**
     * Method to swap two Car objects at idx1 and idx2
     *
     * @param idx1 The first Car object
     * @param idx2 The second Car object
     * @return whether the swap was successful
     *
     * <p>
     * PRECONDITION: idx1 >= 0
     *               idx2 >= 0
     *               idx1 &lt; inventory.size()
     *               idx2 &lt; inventory.size()
     */
    public boolean swap(int idx1, int idx2)
    {
        if(idx1 >= 0 && idx2 >= 0 && idx1 < inventory.size() && idx2 < inventory.size()) {
            Car temp = inventory.set(idx1, inventory.get(idx2));
            inventory.set(idx2, temp);
            return true;
        }
        else
        {
            return false;
        }
    }

}
