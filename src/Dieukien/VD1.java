package Dieukien;

public class VD1 {

    int b = 18;
    String adress = "HCM";

    public static void main(String[] args) {
        int a = 20;
        int b = 18;
        String adress = "HCM";
        String Students = "Học sinh Khá";
        if (a > 10) {
            System.out.println("Lớn hơn 10 tuổi");
        }
        if (b >= 18 && adress.equals("HCM")) {
            System.out.println("Được đi nghĩa vụ quân sự");
        }
        if (Students.contains("Giỏi")) {
            System.out.println("Học ổn");
        } else {
            System.out.println("Học chưa tốt");
        }
    }

}
