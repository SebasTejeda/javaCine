package main.java.pe.edu.upc.entities;

public class Spectator {
    private String name;
    private int age;
    private double has_price;

    public Spectator(String name, int age, double has_price) {
        this.name = name;
        this.age = age;
        this.has_price = has_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHas_price() {
        return has_price;
    }

    public void setHas_price(double has_price) {
        this.has_price = has_price;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", has_price=" + has_price +
                '}';
    }
}
