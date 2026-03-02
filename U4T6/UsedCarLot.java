import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot () {
        inventory = new ArrayList<>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int car1, int car2) {
        if (car1 > inventory.size() - 1 || car2 > inventory.size() - 1) {
            return false;
        } else {
            Car temp = inventory.set(car1, inventory.get(car2));
            inventory.set(car2, temp);
            return true;
        }
    }
}
