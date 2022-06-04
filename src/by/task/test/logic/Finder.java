package by.task.test.logic;

import by.task.test.entity.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Finder {

    private List<Hotel> newHotelList;

    public List<Hotel> findByName(List<Hotel> hotelList,String findName)
    {
        newHotelList = new ArrayList<Hotel>();
        String nameHotel = null;
        findName = findName.toLowerCase();
        for(Hotel hotel : hotelList)
        {
            nameHotel = hotel.getName().toLowerCase();
            if(nameHotel.contains(findName))
            {
                newHotelList.add(hotel);
            }
        }

        return newHotelList;
    }

    public List<Hotel> findByState(List<Hotel> hotelList, String findState)
    {
        newHotelList = new ArrayList<Hotel>();
        String stateHotel = null;
        findState = findState.toLowerCase();
        for(Hotel hotel:hotelList)
        {
            stateHotel = hotel.getState().toLowerCase();
            if(stateHotel.contains(findState))
            {
                newHotelList.add(hotel);
            }
        }

        return newHotelList;
    }
}
