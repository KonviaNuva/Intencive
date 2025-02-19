package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OrderList {
    long INIT_SUM;
    ArrayList<Cleaning> orders = new ArrayList<Cleaning>();

    OrderList(int INIT_SUM, ArrayList<Cleaning> orders)
    {
        this.INIT_SUM = INIT_SUM;
        this.orders = orders;
    }

    double CalcDailySum()
    {
        double counter = this.INIT_SUM;

        counter += this.orders.stream()
                .mapToDouble(Cleaning::GetDiscount)
                .sum();

        return counter;
    }

    @Override
    public String toString() {
        // Sort orders by User using Stream API
        String sortedOrders = orders.stream()
                .map(Cleaning::toString)
                .sorted()
                .collect(Collectors.joining("\n"));

        return sortedOrders;
    }
}
