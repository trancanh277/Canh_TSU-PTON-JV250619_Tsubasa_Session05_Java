public class baitap02 {
    public static void main(String[] args) {
        StringBuilder  chuoi=new StringBuilder("Hello, Java world!");
        System.out.println("Chuỗi ban đầu: " + chuoi);
        chuoi.delete(5, 10);
        System.out.println("Chuỗi sau xóa: " + chuoi);
        int thayThe = chuoi.indexOf("world");
        if (thayThe != -1) {
            chuoi.replace(thayThe,thayThe +5, "Universe");
        }
        System.out.println("Chuỗi sau thay thế: " + chuoi);
    }
}
