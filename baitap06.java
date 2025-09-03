import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mật khẩu");
        String mk = sc.nextLine();
        if(isPassword(mk)){
            System.out.println(" Mật khẩu hợp lệ!");
        }
        else {
            System.out.println("Mật khẩu KHÔNG hợp lệ!");
        }
        sc.close();
    }
    public static boolean isPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean chuHoa = false;
        boolean chuThuong = false;
        boolean so = false;
        boolean kiTu = false;
for(char c : password.toCharArray()) {
    if(Character.isUpperCase(c)) {
        chuHoa = true;
    } else if(Character.isLowerCase(c)) {
        chuThuong = true;
    } else if(Character.isDigit(c)) {
        so = true;
    } else if("@#$!%".indexOf(c) != -1) {
        kiTu = true;
    }
}
return chuHoa && chuThuong && so && kiTu;

    }
}
