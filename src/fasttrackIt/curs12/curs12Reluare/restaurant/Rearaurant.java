package fasttrackIt.curs12.curs12Reluare.restaurant;

import java.util.Objects;

public class Rearaurant {
    private final String name;
    private final String city;
    private final RestaurantType type;
    private final int rating;



    public Rearaurant(String name, String city, RestaurantType type, int rating) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getRating() {
        return rating;
    }
    public RestaurantType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rearaurant that = (Rearaurant) o;
        return rating == that.rating && Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, type, rating);
    }

    @Override
    public String toString() {
        return "Rearaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                '}';
    }

}
