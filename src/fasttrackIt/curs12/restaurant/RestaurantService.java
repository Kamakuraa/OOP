package fasttrackIt.curs12.restaurant;

import java.util.*;

public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantService(Collection<Restaurant> restaurants) {
        this.restaurants.addAll(restaurants);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public Map<String, String> mapRestToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> maprestToType() {
        Map<String, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }

    public Map<RestaurantType, List<Restaurant>> groupByType() {
        Map<RestaurantType, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants){
            List<Restaurant> exList = result.get(restaurant.getType());
            if (exList == null) {
                exList = new ArrayList<>();

            }
            exList.add(restaurant);
            result.put(restaurant.getType(), exList);
        }
            return result;

    }
}
