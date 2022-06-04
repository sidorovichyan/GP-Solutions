package by.task.test.entity;

public enum HotelTagName {
    HOTEL,NAME,ADDRESS,ADDRESSLINE,CITY,COUNTRY,STATE,HOTELS;

    public static HotelTagName getElementTagName(String element) {
        switch (element) {
            case "Hotels":
                return HOTELS;
            case "Hotel":
                return HOTEL;
            case "Name":
                return NAME;
            case "Address":
                return ADDRESS;
            case "AddressLine":
                return ADDRESSLINE;
            case "City":
                return CITY;
            case "Country":
                return COUNTRY;
            case "State":
                return STATE;
            default:
                throw new EnumConstantNotPresentException(HotelTagName.class,
                        element);
        }
    }
}
