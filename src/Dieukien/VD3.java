package Dieukien;

public class VD3 {
    public static void main(String[] args) {
        int a [] = new int[7];
        //Gán giá trị cho mảng
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        System.out.println("Độ dài mảng: " + a.length);
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("=============================");
        for (int n=2; n <=4; n++){
            System.out.println("Độ dài mảng 1: " + a[n]);
        }
        System.out.println("=============");

    }
}
