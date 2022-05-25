package com.synisys.route.impl;

import com.synisys.route.Route;

public class WalkingRoute extends Route {

    protected WalkingRoute(RouteBuilder<WalkingRouteBuilder> builder) {
        super(builder);
    }

    @Override
    public double minSpeed() {
        return 5;
    }

    public static class WalkingRouteBuilder extends RouteBuilder<WalkingRouteBuilder> {

        public WalkingRouteBuilder(double longitude, double latitude) {
            super(longitude, latitude);
        }

        protected WalkingRouteBuilder(String country, String city, String initialAddress) {
            super(country, city, initialAddress);
        }

        @Override
        protected WalkingRouteBuilder instance() {
            return this;
        }

        @Override
        public WalkingRoute build() {
            return new WalkingRoute(this);
        }
    }

}
