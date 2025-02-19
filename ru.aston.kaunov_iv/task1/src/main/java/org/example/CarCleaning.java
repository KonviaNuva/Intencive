package org.example;

public class CarCleaning extends Cleaning
{
    boolean isPremiumModel;

    public double GetDiscount()
    {
        if (this.isPremiumModel)
        {
            return (this.basePrice * 0.8);
        }
        return this.basePrice;
    }

    @Override
    public String GetOrderTypeName() {
        return "car";
    }

    CarCleaning(int id, String address, User user, boolean isPremiumModel, double basePrice)
    {
        super(id, address, user, basePrice);
        this.isPremiumModel = isPremiumModel;
    }
}
