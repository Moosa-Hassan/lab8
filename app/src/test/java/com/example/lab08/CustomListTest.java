package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList mockCityList() {
        CustomList cityList = new CustomList();
        cityList.addCity(mockCity());
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
        CustomList list = mockCityList();
        City city = new City("Lahore", "Punjab");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.delete(city);
        assertFalse(list.hasCity(city));
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(city);
        });
    }

     @Test
     public void testCountCities() {
         CustomList list = mockCityList();
         list.addCity(new City("Lahore", "Punjab"));
         list.addCity(new City("Karachi", "Sindh"));
         assertEquals(2, list.countCities());
     }
}