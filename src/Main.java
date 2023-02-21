import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
        functionChoice();
    }

    private static void showMenu() {
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


    private static void functionChoice() {
        int choose = inputChoose();
        do {
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
            if (choose == 7) {
                System.out.println("Đã thoát chương trình");
                break;
            }
        } while (true);

        public static int inputChoose() {
            do {
                System.out.print("Nhập lựa chọn của bạn: ");
                int choose = new Scanner(System.in).nextInt();
                if (choose > 0 && choose <= 7) {
                    return;
                }
                System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
            } while (true);
        }
    }