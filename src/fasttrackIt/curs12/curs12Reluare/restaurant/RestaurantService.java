package fasttrackIt.curs12.curs12Reluare.restaurant;


import fasttrackIt.curs12.restaurant.Restaurant;

import java.util.*;

public class RestaurantService {
    private final List<Rearaurant> rearaurants = new ArrayList<>();

    public RestaurantService(Collection<Rearaurant> rest) {
        this.rearaurants.addAll(rest);
    }

    public List<Rearaurant> getRearaurants() {
        return rearaurants;
    }

    public Map<String, String> mapRestToCity() {
        Map<String, String> result = new HashMap<>();
        for (Rearaurant restaurant : rearaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> mapResToType() {
        Map<String, RestaurantType> resukt = new HashMap<>();
        for (Rearaurant rearaurant : rearaurants) {
            resukt.put(rearaurant.getName(), rearaurant.getType());
        }
        return resukt;
    }

}
