import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String chuoi = sc.nextLine();

        String thayThe = chuoi.replaceAll("[0-9]", "*");
        System.out.println("Chuỗi sau khi thay thế: " + thayThe);
    }
}
