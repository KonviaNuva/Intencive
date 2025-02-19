package org.example;

import java.util.Objects;

public class User implements Comparable{
    private int age;
    private String name;
    private String surname;

    User(int age, String name, String surname)
    {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString()
    {
        return this.surname
                .concat(" ")
                .concat(this.name);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(age, name, surname);
    }

    int GetAge()
    {
        return this.age;
    }

    String GetName()
    {
        return this.name;
    }

    String GetSurname()
    {
        return this.surname;
    }

    void SetAge(int age)
    {
        this.age = age;
    }

    void SetName(String name)
    {
        this.name = name;
    }

    void SetSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) return 0;
        User user = (User) o;
        return this.toString().compareTo(user.toString());
    }
}