package DemoAuto;

public class PhuongThuc {

    public double sum;
    public double reseach;

    // Ham khong tra ve ket qua
    public void Ham() {
        int a = 5;
        int b = 10;
        int c = a + b;
        sum = c;
        System.out.println(sum);
    }
// Hàm có tham số
    public void NewCustomor(String number1, int number2){
        System.out.println(number1 +number2);

    }

    // Hàm có trả về kết quả
    public double Ham2() {
        int a = 2;
        int b = 5;
        reseach = a * b;
        return reseach;
    }

    public static void main(String[] args) {
        PhuongThuc phuongthuc = new PhuongThuc();
        phuongthuc.Ham();
        phuongthuc.Ham2();
        System.out.println(phuongthuc.Ham2() + 10);
        phuongthuc.NewCustomor("Nhi ",30);


    }
}
