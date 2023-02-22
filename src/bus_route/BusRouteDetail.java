package bus_route;

public class BusRouteDetail {
    private BusRoute busRoute;
    private int drivingTurn;

    public BusRouteDetail(BusRoute busRoute, int drivingTurn) {
        this.busRoute = busRoute;
        this.drivingTurn = drivingTurn;
    }

    public BusRoute getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(BusRoute busRoute) {
        this.busRoute = busRoute;
    }

    public int getDrivingTurn() {
        return drivingTurn;
    }

    public void setDrivingTurn(int drivingTurn) {
        this.drivingTurn = drivingTurn;
    }

    @Override
    public String toString() {
        return "BusRouteDetail{" +
                "busRoute=" + busRoute +
                ", drivingTurn=" + drivingTurn +
                '}';
    }
}
