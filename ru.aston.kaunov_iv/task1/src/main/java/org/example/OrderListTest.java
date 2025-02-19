package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OrderListTest {
    @Test
    public void ToString() {
        OrderList testOrderList = new OrderList(0, new ArrayList<>());
        testOrderList.orders.add(new CarCleaning(1, "Lenin Street", new User(30, "Ivan", "Ivanov"), true, 2000));
        testOrderList.orders.add(new ClothCleaning(2, "Revolution Square", new User(40, "Maria", "Petrova"), 20, 1000));
        testOrderList.orders.add(new CarCleaning(3, "Red Street", new User(30, "Alexandra", "Aistova"), false, 1500));
        testOrderList.orders.add(new ClothCleaning(4, "October Square", new User(40, "Boris", "Blinov"), 10, 600));
        assertEquals("Aistova Alexandra, car cleaning order on Red Street, final price 1500.0\n" +
                "Blinov Boris, cloth cleaning order on October Square, final price 600.0\n" +
                "Ivanov Ivan, car cleaning order on Lenin Street, final price 1600.0\n" +
                "Petrova Maria, cloth cleaning order on Revolution Square, final price 800.0", testOrderList.toString());
    }

    @Test
    public void CalcDailySum() {
        OrderList testOrderList = new OrderList(0, new ArrayList<>());
        testOrderList.orders.add(new CarCleaning(1, "Lenin Street", new User(30, "Ivan", "Ivanov"), true, 2000));
        testOrderList.orders.add(new ClothCleaning(2, "Revolution Square", new User(40, "Maria", "Petrova"), 20, 1000));
        testOrderList.orders.add(new CarCleaning(3, "Red Street", new User(30, "Alexandra", "Aistova"), false, 1500));
        testOrderList.orders.add(new ClothCleaning(4, "October Square", new User(40, "Boris", "Blinov"), 10, 600));
        assertEquals("4500.0", String.valueOf(testOrderList.CalcDailySum()));
    }
}
