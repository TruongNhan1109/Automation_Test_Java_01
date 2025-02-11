package Dieukien;

public class VD4 {
    public static void main(String[] args) {
        int number1[] = {1,5,10,15,20};
         number1[2] = 100;
         for (int i = 0; i < number1.length;i++){
             System.out.println(number1[i]);
         }
         String dataCust []= {"Nhi", "Như", "Hằng"};
        System.out.println(dataCust[0]);
        boolean check =true;
        for (int i =0; i < dataCust.length;i++){
          if (dataCust[i].equals("Như")){
             check = true ;
              break;
          }
          else {
              check =false;
            }
        }
        if (check ==true){
            System.out.println("Tìm thấy");
        }else {
            System.out.println("Ko tìm thấy");
        }
    }
}
