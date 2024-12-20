package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int price;
    private int year;

    public Car(String model, int price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;

        Car car = (Car) obj;

        return Objects.equals(car.model, car)
                && Objects.equals(car.price, price)
                && Objects.equals(car.year, year);
    }
}
