package by.task.test.entity;

import java.util.Objects;

public class Hotel {

    private String pricePerNight;

    private String name;

    private String addressLine;

    private String city;

    private String country;

    private String state;

    public String getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(String pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "  \n Price per night='" + pricePerNight + '\'' +
                ", \n Name='" + name + '\'' +
                ", \n Address line='" + addressLine + '\'' +
                ", \n City='" + city + '\'' +
                ", \n Country='" + country + '\'' +
                ", \n State='" + state + '\'' +"\n"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(getPricePerNight(), hotel.getPricePerNight()) && Objects.equals(getName(), hotel.getName()) && Objects.equals(getAddressLine(), hotel.getAddressLine()) && Objects.equals(getCity(), hotel.getCity()) && Objects.equals(getCountry(), hotel.getCountry()) && Objects.equals(getState(), hotel.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPricePerNight(), getName(), getAddressLine(), getCity(), getCountry(), getState());
    }
}
