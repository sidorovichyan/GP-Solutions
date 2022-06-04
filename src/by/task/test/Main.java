package by.task.test;

import by.task.test.entity.Hotel;
import by.task.test.logic.Finder;
import by.task.test.parser.HotelParser;
import by.task.test.print.PrintListHotel;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        Finder finder = new Finder();
        try {
            InputStream input = new FileInputStream("src/Hotels.xml");

            XMLStreamReader reader = inputFactory.createXMLStreamReader(input);
            List<Hotel> hotelList = HotelParser.parse(reader);

            hotelList = finder.findByName(hotelList,"Hilton");

            List<Hotel> hotelListNYfirst = finder.findByState(hotelList,"New York");

            List<Hotel> hotelListNYsecond = finder.findByState(hotelList,"NY");

            hotelListNYfirst.addAll(hotelListNYsecond);

            hotelList = hotelListNYfirst;

            PrintListHotel.printListHotel(hotelList);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
