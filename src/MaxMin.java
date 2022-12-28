import java.util.Random;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
/******************Даейте с консоля******************************/
//            System.out.print("Дайте значение массиву: ");
//            arr[i] = sc.nextInt();
/******************Даейте с консоля конец******************************/
             arr[i] = rd.nextInt(100);
        }
        arrayOne(arr);
        arrayTwo(arr);
    }

    static void arrayOne(int [] arr){

        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("\nМаксимальное циcло массива: "+max);
        System.out.println("Индекс максимального числа: " + (index));

    }
    static void arrayTwo(int [] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        System.out.println("\nМаксимальное циcло массива: "+min);
        System.out.println("Индекс максимального числа: " + (index));

    }
}
