package entity;

import java.util.Scanner;

public class Driver extends Person {
    private int id;
    private static int driverID = 10000;
    private Dgree dgree;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getDriverID() {
        return driverID;
    }

    public static void setDriverID(int driverID) {
        Driver.driverID = driverID;
    }

    public Dgree getDgree() {
        return dgree;
    }

    public void setDgree(Dgree dgree) {
        this.dgree = dgree;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", dgree=" + dgree +
                '}';
    }
    @Override
    public void inputInfo() {
        super.inputInfo();
        this.id = driverID;
        driverID++;
        int temp;
        do {
            temp = new Scanner(System.in).nextInt();
            if (temp >= 1 && temp <= 6 ){
                break;
            }
            System.out.print("Lựa chọn không hợp lệ vui lòng chọn lại ");
        }while (true);
        switch (temp) {
            case 1: this.dgree = Dgree.BANGA;
                break;
            case 2: this.dgree = Dgree.BANGB;
                break;
            case 3: this.dgree = Dgree.BANGC;
                break;
            case 4: this.dgree = Dgree.BANGD;
                break;
            case 5: this.dgree = Dgree.BANGE;
                break;
            case 6: this.dgree = Dgree.BANGF;
                break;
        }
    }
}

