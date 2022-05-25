package com.synisys.route;

import com.synisys.address.Address;

public abstract class Route {
    private Address initialAddress;
    private Address finalAddress;
    private int duration; // in milliseconds
    private double distance;

    protected Route(RouteBuilder<?> builder) {
        this.initialAddress = builder.initialAddress;
        this.finalAddress = builder.finalAddress;
    }

    public abstract static class RouteBuilder<T extends RouteBuilder<T>> {
        private Address initialAddress;
        private Address finalAddress;

        protected RouteBuilder(double initialLongitude, double initialLatitude) {
            this.initialAddress = Address.getAddressByCoordinates(initialLongitude, initialLatitude);
        }

        protected RouteBuilder(String country, String city, String initialAddress) {
            this.initialAddress = Address.getAddress(country, city, initialAddress);
        }

        public RouteBuilder<T> setInitialCoordinates(double longitude, double latitude) {
            this.initialAddress = Address.getAddressByCoordinates(longitude, latitude);
            return this.instance();
        }

        public RouteBuilder<T> setInitialAddress(String country, String city, String address) {
            this.initialAddress = Address.getAddress(country, city, address);
            return this.instance();
        }

        public RouteBuilder<T> setFinalCoordinates(double longitude, double latitude) {
            this.finalAddress = Address.getAddressByCoordinates(longitude, latitude);
            return this.instance();
        }

        public RouteBuilder<T> setFinalAddress(String country, String city, String address) {
            this.finalAddress = Address.getAddress(country, city, address);
            return this.instance();
        }

        protected abstract RouteBuilder<T> instance();

        public abstract <K extends Route> K build();
    }

    public abstract double minSpeed();

    public Address getInitialAddress() {
        return initialAddress;
    }

    public Address getFinalAddress() {
        return finalAddress;
    }

    public int getDuration() {
        return duration; // calculate duration
    }

    public double getDistance() {
        return distance; // calculate distance
    }

    @Override
    public String toString() {
        return "Route{" +
                "initialAddress=" + initialAddress +
                ", finalAddress=" + finalAddress +
                ", duration=" + this.getDuration() +
                ", distance=" + this.getDistance() +
                '}';
    }
}
