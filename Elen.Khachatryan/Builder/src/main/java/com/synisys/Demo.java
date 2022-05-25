package com.synisys;

import com.synisys.route.impl.BusRoute;

public class Demo {
    public static void main(String[] args) {
        BusRoute busRoute = new BusRoute.BusRouteBuilder(10, 15)
                .setFinalCoordinates(97, 19.2)
                .build();
        System.out.println(busRoute);
    }
}
