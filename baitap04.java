import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String chuoi = sc.nextLine().trim();
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$";
        if(chuoi.matches(emailRegex)) {
            System.out.println("Email hợp lệ");
        }

        else {
            System.out.println("Email không hợp lệ");
        }
        sc.close();
    }
}
