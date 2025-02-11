package Baitap2;

public class Caculator {
    public int songuyen(int a, int b) {
        return (a + b);
    }

    public double sothuc(double c, double d) {
        return (c + d);
    }

    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        System.out.println(caculator.songuyen(20, 30));
        System.out.println(caculator.sothuc(7.5, 8.2));

    }

}
