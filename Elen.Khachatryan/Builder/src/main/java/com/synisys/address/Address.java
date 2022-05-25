package com.synisys.address;

public class Address {
    private double longitude;
    private double latitude;
    private String country;
    private String city;
    private String address;

    public static Address getAddressByCoordinates(double longitude, double latitude) {
        return new Address(longitude, latitude);
    }

    public static Address getAddress(String country, String city, String address) {
        return new Address(country, city, address);
    }

    private Address(double longitude, double latitude) {
        this.setLongitude(longitude);
        this.setLatitude(latitude);
    }

    private Address(String country, String city, String address) {
        this.setCountry(country);
        this.setCity(city);
        this.setAddress(address);
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        if (Double.isFinite(longitude) && Math.abs(longitude) <= 180) {
            this.longitude = longitude;
            return;
        }
        throw new IllegalArgumentException("Longitude must be in  range [-180, 180].");
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        if (Double.isFinite(latitude) && Math.abs(latitude) <= 90) {
            this.latitude = latitude;
            return;
        }
        throw new IllegalArgumentException("Latitude must be in  range [-90, 90].");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
