package BaiTap1;

public class Student {
    // Biến toàn cục
    String Name = "Trương Thị Nhàn";

    // Biến có chứa static
    static int Age = 12;

    // Biến cục bộ
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Student student = new Student();
        System.out.println(student.Name);
        System.out.println(Age);


        System.out.println(ThongTin.NAME);
        System.out.println(ThongTin.AGE);
    }


}
