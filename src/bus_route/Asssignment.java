package bus_route;

import entity.Driver;

import java.util.Arrays;

public class Asssignment {
    private Driver driver;
    private BusRouteDetail[] busRouteDetailtes;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public BusRouteDetail[] getBusRouteDetailtes() {
        return busRouteDetailtes;
    }

    public void setBusRouteDetailtes(BusRouteDetail[] busRouteDetailtes) {
        this.busRouteDetailtes = busRouteDetailtes;
    }

    @Override
    public String toString() {
        return "Asssignment{" +
                "driver=" + driver +
                ", busRouteDetailtes=" + Arrays.toString(busRouteDetailtes) +
                '}';
    }
}
