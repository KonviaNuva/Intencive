package org.example;

public abstract class Cleaning implements Discountable
{
    int id;
    String address;
    User user;
    double basePrice;

    public abstract double GetDiscount();

    public abstract String GetOrderTypeName();

    Cleaning(int id, String address, User user, double basePrice)
    {
        this.id = id;
        this.address = address;
        this.user = user;
        this.basePrice = basePrice;
    }

    int GetId()
    {
        return this.id;
    }

    String GetAddress()
    {
        return this.address;
    }

    double GetBasePrice()
    {
        return this.basePrice;
    }

    public User GetUser()
    {
        return this.user;
    }

    void SetId(int id)
    {
        this.id = id;
    }

    void SetBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }

    void SetAddress(String address)
    {
        this.address = address;
    }

    void SetUser(User user)
    {
        this.user = user;
    }

    @Override
    public String toString() {
        return this.GetUser().toString()
                .concat(", ")
                .concat(this.GetOrderTypeName())
                .concat(" cleaning order on ")
                .concat(this.GetAddress())
                .concat(", final price ")
                .concat(String.valueOf(this.GetDiscount()));
    }
}
