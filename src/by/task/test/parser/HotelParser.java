package by.task.test.parser;

import by.task.test.entity.Hotel;
import by.task.test.entity.HotelTagName;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HotelParser {

    public static List<Hotel> parse (XMLStreamReader reader) throws XMLStreamException {
        List<Hotel> hotelList = new ArrayList<Hotel>();
        Hotel hotel = null;
        HotelTagName elementName = null;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    elementName = HotelTagName.getElementTagName(reader.getLocalName());
                    switch (elementName) {
                        case HOTEL:
                            hotel = new Hotel();
                            hotel.setPricePerNight(reader.getAttributeValue(null,"Price"));
                            break;
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    String text = reader.getText().trim();
                    if (text.isEmpty()) {
                        break;
                    }
                    switch (elementName) {
                        case NAME:
                            hotel.setName(text);
                            break;
                        case ADDRESS:
                            break;
                        case ADDRESSLINE:
                            hotel.setAddressLine(text);
                            break;
                        case CITY:
                            hotel.setCity(text);
                            break;
                        case COUNTRY:
                            hotel.setCountry(text);
                            break;
                        case STATE:
                            hotel.setState(text);
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    elementName = HotelTagName.getElementTagName(reader
                            .getLocalName());
                    switch (elementName) {
                        case HOTEL:
                            hotelList.add(hotel);
                    }

            }

        }
        return hotelList;
    }
}
