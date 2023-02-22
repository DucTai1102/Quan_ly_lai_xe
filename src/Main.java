import bus_route.BusRoute;
import entity.Driver;

import java.util.Scanner;

public class Main {

    private static Driver[] drivers = new Driver[100];
    private static BusRoute[] busRoutes = new BusRoute[100];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true){
            printfMenu();
            int function = functionChoice();
            switch (function) {
                case 1: inputDriver();
                    break;
                case 2: showDriver();
                    break;
                case 3: inputBusRoute();
                    break;
                case 4: showBusRoute();
                    break;
                case 5: assignment();
                    break;
                case 6:
                    break;
                case 7:
                    return;
            }
        }
    }

    private static void assignment() {
        System.out.println("Muốn phân công cho bao nhiêu tài xế: ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            //xác minh tài xế
            System.out.println("Mã của tài xế là: ");
            int driverID = new Scanner(System.in).nextInt();
            do {
                Driver driver = null;
                for (int j = 0; j < drivers.length; j++) {
                    if(drivers[j] != null && drivers[j].getId() == driverID) {
                        driver = drivers[j];
                        break;
                    }
                }
                if(driver != null){
                    break;
                }
                System.out.printf("Tài xế không hợp lệ");
            }while (true);
            //Xác định số tuyến
                System.out.printf("Số tuyến muốn phân công: ");
                int temp;
                do {
                    temp = new Scanner(System.in).nextInt();
                    if (temp >= 1 && temp <= 15 ){
                        break;
                    }
                    System.out.printf("Lựa chọn không hợp lệ vui lòng chọn lại ");
                }while (true);
            // Xác định tuyến
                System.out.printf("Tuyến muốn phân công là: ");
        }

    }

    private static void showBusRoute() {
        for (int i = 0; i < busRoutes.length; i++) {
            if(busRoutes[i] != null) {
                System.out.println(busRoutes[i]);
            }
        }
    }

    private static void inputBusRoute() {
        System.out.printf("Nhập số lượng tuyến muốn thêm ");
        int busRouteNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < busRouteNum; i++) {
            BusRoute busRoute = new BusRoute();
            busRoute.inputInfo();
            saveBusRoute(busRoute);
        }
    }

    private static void saveBusRoute(BusRoute busRoute) {
        for (int i = 0; i < busRoutes.length; i++) {
            if (busRoutes[i] == null){
                busRoutes[i].inputInfo();
            }
        }
    }

    private static void showDriver() {
        for (int i = 0; i < drivers.length; i++) {
            if(drivers[i] != null) {
                System.out.println(drivers[i]);
            }
        }
    }

    private static void inputDriver() {
        System.out.printf("Nhập số lượng tài xế muốn thêm: ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            Driver driver = new Driver();
            driver.inputInfo();
            saveDriver(driver);
        }
    }
    private static void saveDriver(Driver driver) {
        for (int i = 0; i < drivers.length; i++)
            if (drivers[i] == null) {
                drivers[i].inputInfo();
            }
    }
    private static int functionChoice() {
        System.out.printf("Mời bạn chọn chức năng: ");
        int temp;
        do {
        temp = new Scanner(System.in).nextInt();
            if (temp >= 1 && temp <= 8 ){
            break;
        }
            System.out.printf("Lựa chọn không hợp lệ vui lòng chọn lại ");
        }while (true);
        return temp;
    }

    private static void printfMenu() {
        System.out.println("+-------------------------------- MENU -------------------------------+");
        System.out.println("|  1. Nhập vào tài xế mới                                             |");
        System.out.println("|  2. Tra cứu danh sách tài xế                                        |");
        System.out.println("|  3. Nhập vào tuyến đường mới                                        |");
        System.out.println("|  4. Tra cứu tuyến đường trong ngày                                  |");
        System.out.println("|  5. Phân công lái xe trong ngày                                     |");
        System.out.println("|  6. Sắp xếp phân công lái xe                                        |");
        System.out.println("|  7. Thoát chương trình                                              |");
        System.out.println("+---------------------------------------------------------------------+");
    }
}