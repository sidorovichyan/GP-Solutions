package by.task.test.print;

import by.task.test.entity.Hotel;

import java.util.List;

public class PrintListHotel {

    public static void printListHotel(List<Hotel> hotelList)
    {
        System.out.println("<Lists>");
        System.out.println("\t<Names>");
        for (Hotel hotel:hotelList)
        {
            System.out.println("\t\t<Name>"+hotel.getName()+"</Name>");
        }
        System.out.println("\t</Names>");
        System.out.println("\t<Prices>");
        for (Hotel hotel:hotelList)
        {
            System.out.println("\t\t<Price>"+hotel.getPricePerNight()+"</Price>");
        }
        System.out.println("\t</Prices>");
        System.out.println("\t<Addresses>");
        for (Hotel hotel:hotelList)
        {
            System.out.println("\t\t<Address>"+hotel.getAddressLine()+"</Adress>");
        }
        System.out.println("\t</Addresses>");
        System.out.println("</Lists>");
    }
}
