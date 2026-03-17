package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CityList {
    // adding comment for lab
    private List<City> cities;

    public CityList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
    public boolean hasCity(City city) {
 return cities.contains(city);


}

public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list");
        }
        cities.remove(city);
    }
//     /**
//      * This returns the number of cities in the list
//      * returns The size of the city list
//      */
    public int countCities() {
        return cities.size();
    }
}
