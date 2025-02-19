package org.example;

public class ClothCleaning extends Cleaning
{
    static final int LARGE_WEIGHT = 15;

    int weight;

    public double GetDiscount()
    {
        if (this.weight >= LARGE_WEIGHT)
        {
            return (this.basePrice * 0.8);
        }
        return this.basePrice;
    }

    @Override
    public String GetOrderTypeName() {
        return "cloth";
    }

    ClothCleaning(int id, String address, User user, int weight, double basePrice)
    {
        super(id, address, user, basePrice);
        this.weight = weight;
    }
}
