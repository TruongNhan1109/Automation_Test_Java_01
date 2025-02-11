package Nhap;

public class Bien {
    String Name = "Vũ Thu Thoa";
    static String Age = "14";

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a + b);
        System.out.println(c);

        Bien bien = new Bien();
        System.out.println(bien.Name);
        System.out.println(Age);
    }
}
