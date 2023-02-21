package entity;

public class Driver extends Person {

    private static int driverID = 10000;
    private String dgree;

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getDgree() {
        return dgree;
    }

    public void setDgree(String dgree) {
        this.dgree = dgree;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID=" + driverID +
                ", dgree='" + dgree + '\'' +
                '}';
    }

}
