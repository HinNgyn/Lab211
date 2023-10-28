
package dataAccess;

import common.Validation;
import java.text.NumberFormat;
import java.util.Locale;
import model.Truck;

public class HouseholdDao {

    private static HouseholdDao instance = null;
    private static Validation valid = new Validation();

    public static HouseholdDao Instance() {
        if (instance == null) {
            synchronized (HouseholdDao.class) {
                if (instance == null) {
                    instance = new HouseholdDao();
                }
            }
        }
        return instance;
    }

    public void calculateTime(Truck truck) {
        String s = valid.inputString("Enter the amount of garbage at each station");
        String[] garbages = s.split(" ");
        int total = 0;
        int time = 0;
        int number = 0; //number of truck
        for (String garbage : garbages) {
            try {
                if (total + Integer.parseInt(garbage) > 10000) {
                    garbage = remainingAmountOfTrash(total, garbage);
                    total = 0;
                    time = time + 8 + 30;
                    number++;
                }
                total = total + Integer.parseInt(garbage);
                time = time + 8;
            } catch (NumberFormatException e) {
                System.err.println(garbage + " is not a numeric");
            }
        }
        truck.setTime(time + 30);
        truck.setNumber(number + 1);
    }

    public String remainingAmountOfTrash(int total, String garbage) {
        int leftover_garbage = (total + Integer.parseInt(garbage) - 10000);
        return String.valueOf(leftover_garbage);
    }

    public void calculateCost(Truck truck) {
        double cost = ((truck.getTime()+ 30)  * 120000) / 60 + (truck.getNumber() * 57000);
        truck.setCost(cost);
    }

    public void printEstimateCost(Truck truck) {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vi = NumberFormat.getInstance(localeVN);
        System.out.println("The total cost is " + vi.format(truck.getCost()) + " VND");
    }
}