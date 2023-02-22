package bus_route;

import entity.Dgree;
import entity.Inputable;

import java.util.Scanner;

public class BusRoute implements Inputable {
    private static int busRouteID = 100;
    private int distance;
    private int stopPoint;
    private int id;


    public static int getBusRouteID() {
        return busRouteID;
    }

    public static void setBusRouteID(int busRouteID) {
        BusRoute.busRouteID = busRouteID;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(int stopPoint) {
        this.stopPoint = stopPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BusRoute{" +
                "distance=" + distance +
                ", stopPoint=" + stopPoint +
                ", id=" + id +
                '}';
    }
    @Override
    public void inputInfo() {
        this.id = busRouteID;
        System.out.printf("Mã tuyến xe là" + (busRouteID++));
        System.out.printf("Mời nhập khoảng cách ");
        this.distance = new Scanner(System.in).nextInt();
        System.out.printf("Nhập số điểm dừng ");
        this.distance = new Scanner(System.in).nextInt();
    }
}

