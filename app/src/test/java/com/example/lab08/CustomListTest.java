package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't
//        exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CityList list = mockCityList();
        City city = new City("Lahore", "Punjab");
        list.add(city);
        assertTrue(list.hasCity(city));
        list.delete(city);
        assertFalse(list.hasCity(city));
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(city);
        });
    }

    // @Test
    // public void testCountCities() {
    //     CityList list = mockCityList();
    //     list.add(new City("Lahore", "Punjab"));
    //     list.add(new City("Karachi", "Sindh"));
    //     assertEquals(2, list.countCities());
    // }
}