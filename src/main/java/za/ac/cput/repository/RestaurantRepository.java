package za.ac.cput.repository;

import org.jetbrains.annotations.NotNull;
import za.ac.cput.entity.Employee;
import za.ac.cput.entity.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class RestaurantRepository implements IRestaurantRepository{
    private static RestaurantRepository repo = null;
    private Set<Restaurant> restaurantDataBase = null;

    private RestaurantRepository(){
        restaurantDataBase = new HashSet<Restaurant>();
    }

    public static RestaurantRepository getRepo(){
        if(repo == null){
            repo = new RestaurantRepository();
        }
        return repo;
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        boolean success = restaurantDataBase.add(restaurant);
        if (!success)
            return null;
        return restaurant;
    }

    @Override
    public Restaurant read(String restId) {
        Restaurant restaurant = restaurantDataBase.stream()
                .filter(re -> re.getRestRegNumber().equals(restId))
                .findAny()
                .orElse(null);
        return restaurant;
    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        Restaurant oldRestaurant = read(restaurant.getRestRegNumber());
        if (oldRestaurant != null){
            restaurantDataBase.remove(oldRestaurant);
            restaurantDataBase.add(restaurant);
            return restaurant;
        }
        return null;
    }

    @Override
    public boolean delete(String restId) {
        Restaurant restaurantToDelete = read(restId);
        if (restaurantToDelete == null)
            return false;
        restaurantDataBase.remove(restaurantToDelete);
        return true;
    }

    @Override
    public Set<Restaurant> getAll() {
        return restaurantDataBase;
    }
}
