import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi văn bản: ");
        String text = sc.nextLine().trim();
        System.out.println("Nhập từ cần tìm: ");
        String timkiem = sc.nextLine().trim();
        int index = text.indexOf(timkiem);
        if (index != -1) {
            System.out.printf("Từ \"%s\" xuất hiện tại vị trí %d ", timkiem, index );
        }
        else {
            System.out.printf("Từ \"%s\" không xuất hiện trong chuõi", timkiem );
        }
        sc.close();
    }
}
