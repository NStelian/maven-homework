package ro.itschool.mvnbase.tema22;

import java.util.Objects;

public class Vacation {
    private final String location;
    private final int price;
    private final int duration;

    public Vacation(String location, int price, int duration) {
        this.location = location;
        this.price = price;
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacation vacation = (Vacation) o;
        return price == vacation.price &&
                duration == vacation.duration &&
                Objects.equals(location, vacation.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, price, duration);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "location='" + location + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
