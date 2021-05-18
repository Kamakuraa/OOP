package fasttrackIt.curs12.curs12Reluare.restaurant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService(List.of(
                new Rearaurant("Dock", "Oradea", RestaurantType.FUSION, 4),
                new Rearaurant("Rivo", "Oradea", RestaurantType.GREEK, 3),
                new Rearaurant("Pizza Hut", "Bucuresti", RestaurantType.GREEK, 2),
                new Rearaurant("Indigo", "Cluj", RestaurantType.FUSION, 3),
                new Rearaurant("Bricks", "Cluj", RestaurantType.ROMANIAN, 4),
                new Rearaurant("Flavours", "Oradea", RestaurantType.ROMANIAN, 5),
                new Rearaurant("Spoon", "Oradea", RestaurantType.ROMANIAN, 4),
                new Rearaurant("Traditional", "Bucuresti", RestaurantType.ROMANIAN, 3)
        ));
        System.out.println(restaurantService.getRearaurants());

        System.out.println(restaurantService.mapResToType());
        System.out.println(restaurantService.mapRestToCity());
    }
}
