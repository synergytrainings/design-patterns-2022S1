package com.synisys.route.impl;

import com.synisys.enums.TrafficLevel;
import com.synisys.route.Route;

public class CarRoute extends Route {
    private TrafficLevel traffic;

    private CarRoute(CarRouteBuilder builder) {
        super(builder);
        this.traffic = builder.traffic;
    }

    @Override
    public double minSpeed() {
        return 70;
    }

    public static class CarRouteBuilder extends Route.RouteBuilder<CarRouteBuilder> {
        private TrafficLevel traffic;

        public CarRouteBuilder(double longitude, double latitude) {
            super(longitude, latitude);
        }

        protected CarRouteBuilder(String country, String city, String initialAddress) {
            super(country, city, initialAddress);
        }

        public CarRouteBuilder setTraffic(TrafficLevel traffic) {
            this.traffic = traffic;
            return this.instance();
        }

        @Override
        protected CarRouteBuilder instance() {
            return this;
        }

        @Override
        public CarRoute build() {
            return new CarRoute(this);
        }
    }

    @Override
    public String toString() {
        return "CarRoute{" +
                super.toString() + '\n'+
                "traffic=" + traffic +
                '}';
    }
}
