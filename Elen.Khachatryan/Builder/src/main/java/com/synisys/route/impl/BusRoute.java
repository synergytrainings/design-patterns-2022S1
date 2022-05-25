package com.synisys.route.impl;

import com.synisys.route.Route;

import java.util.Collections;
import java.util.Set;

public class BusRoute extends Route {
    private Set<Integer> availableBusNumbers;

    protected BusRoute(BusRouteBuilder builder) {
        super(builder);
        this.availableBusNumbers = builder.availableBusNumbers;
    }

    @Override
    public double minSpeed() {
        return 40;
    }

    public static class BusRouteBuilder extends RouteBuilder<BusRouteBuilder> {
        private Set<Integer> availableBusNumbers;

        public BusRouteBuilder(double longitude, double latitude) {
            super(longitude, latitude);
            this.availableBusNumbers = Collections.emptySet();
        }

        protected BusRouteBuilder(String country, String city, String initialAddress) {
            super(country, city, initialAddress);
            this.availableBusNumbers = Collections.emptySet();
        }

        public BusRouteBuilder addBusNumber(Integer number) {
            this.availableBusNumbers.add(number);
            return this.instance();
        }

        @Override
        protected BusRouteBuilder instance() {
            return this;
        }

        @Override
        public BusRoute build() {
            return new BusRoute(this);
        }
    }

    @Override
    public String toString() {
        return "BusRoute{" +
                super.toString() + '\n'+
                "availableBusNumbers=" + availableBusNumbers +
                '}';
    }
}
