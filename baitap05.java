public class baitap05 {
    public static void main(String[] args) {
        String chuoi = ("Hello");
        int loop = 1000000;
        long start = System.currentTimeMillis();
        String s = chuoi;
        for (int i = 0; i < loop; i++) {
            s += "word";
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với String: " + (end - start) + "ms");


        start = System.currentTimeMillis();
        StringBuilder bd = new StringBuilder(chuoi);
        for (int i = 0; i < loop; i++) {
            bd.append("word");
        }
        end = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuilder: " + (end - start) + "ms");


        start = System.currentTimeMillis();
        StringBuffer bfb = new StringBuffer(chuoi);
        for (int i = 0; i < loop; i++) {
            bfb.append("word");
        }
        end = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (end - start) + "ms");
        
        System.out.println("Nhận xét");
        System.out.println("Cực kì chậm khi lặp nhiều");
        System.out.println("Thực hiện nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng");
        System.out.println("Tương tự như StringBuider nhưng chậm hơn");
    }

}
