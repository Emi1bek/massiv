import java.util.Random;
import java.util.Scanner;

public class MethodBir {
    public static void main(String[] args) {
        /*Найти сумму чисел от1 до 300 среди которых без остатка можно разделить на числе  3. на  число 4 и на 5 . */
        Scanner sc = new Scanner(System.in);
        int[]  a = new int[300];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(1,300);
        }
        System.out.println("Сумма которые делятся на 3,4,5: "+ko(a)) ;
    }
    static int ko(int [] a){
        int sum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 ==0 & a[i] % 4 ==0 & a[i] % 5 ==0  ) {

                System.out.print(a[i]+", ");
                sum = sum + a[i];
            }
        }
        return sum;
    }

    static double arif(double a, double b){
        double sum = (a+b)/2;
        return sum;
    }


  static String takSan(int a){
        if (a % 2 == 0){
             return "buk jup san";
        } else if (a % 2 !=0) {
            return "bul tak san";
        }
      return null;
  }


    static void sanMez(int a, int b){
        if(a<b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print(i + " ");

            }
        }else if (b<a){
            for (int j = b + 1; j < a; j++) {
                System.out.print(j + " ");

            }
        } else if (a==b) {
            System.out.println("Обе равны друг другу");

        }
        else {
            System.out.println("Дайте нормальную число!");
        }
    }
    static void maxMin(int a, int b){
        if(a>b){
            System.out.println("a больше b!");
        }
        else{
            System.out.println("b больше a");
        }

    }

    static void age(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Когда вы родились? ");
        int  a, age;
        a = sc.nextInt();
        age = 2022-a;
        if (a <=2022) {
            System.out.println("Ваш возраст равно: " + age);
        }
        else {
            System.out.println("Год неверный!");
        }
    }
}
