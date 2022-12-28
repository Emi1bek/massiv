import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class massivPraktikaBir {
    public static void main(String[] args) {










       /* первый практический занятое
        Random rd = new Random();
        int[] array = new int[20];
        int sum180=0, sum190=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(170, 220);

            if(array[i]<180){
                sum180+=array[i];
                System.out.print(array[i]+", ");
                System.out.println();
            } else if (array[i]>190) {
                sum190+=array[i];
                System.out.print(array[i]+", ");
            }

        }
        System.out.println("sum180: "+sum180);
        System.out.println("sum190: "+sum190);
        конец первой решени*/
        /*
        Random rd = new Random();
        int[] array = new int[5];
        int[] array1 = new int[5];
        int sum1 = 0, sum2 = 0, counter = 0, counter1 = 0;
        double arif1 =0, arif2=0;
        for (int i = 0; i < 5; i++) {
            array[i] = rd.nextInt(0,5);
            System.out.print(array[i]+",\n");
            sum1 += array[i];
            counter++;
        }
        for (int j = 0; j < 5; j++) {
            array1[j] = rd.nextInt(0, 5);
            System.out.print(array1[j]+",\n");
            sum2 += array1[j];
            counter1++;
        }
        arif1 = sum1/counter;
        arif2 = sum2/counter1;
        System.out.println("первый массив арифметический: "+arif1);
        System.out.println("второй массив арифметический: "+arif2);
        if (arif1 < arif2) {
            System.out.println("Второй массив больше первого!");

        }
        else if (arif2 < arif1){
            System.out.println("Первый массив больше пвторого!");
        }
        else {
            System.out.println("Они ровны!");
        }
        */


//        for (int san =1; san<=10; san++){
//            System.out.print(san);
//            if(san == 10){
//                for (int san1 = 1; san1 <10 ; san1++) {
//                    System.out.println(san1);
//                }
//            }
//        }

//        int count = 0,count2=0;
//        for (int i = 0; i < 15; i++) {
//            if(i<=9){
//                count++;
//            }
//            else   {
//                count2++;
//            }
//
//        }
//        System.out.println(count);
//        System.out.println(count2);

//        int sum = 0, sum2 = 0;
//        for (int i = -100; i < 100 ; i++) {
//            if(i<=0){
//                sum+=i;
//            } else  {
//                sum2+=i;
//            }
//
//        }
//        System.out.println(sum);
//        System.out.println(sum2);

        /****пятимерное массив сумма начало****/
//        int[][] nums = new int[5][5];
//        int sum = 0;
//
//        Random random = new Random();
//        for (int i = 0; i < nums.length; i++){
//            for(int j=0; j < nums[i].length; j++){
//
//                nums[i][j] = random.nextInt(10);
//                sum+=nums[1][j];
//                System.out.printf("%d ", nums[i][j]);
//
//            }
//            System.out.println();
//        }
//        System.out.println(sum);
        /****Максимальное цисло массива конец****/

        /****Максимальное цисло массива начало****/

//        int[] arr = new int[20];
//
//        int max = arr[0];
//        int index = 0;
//        Random rd = new Random();
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = rd.nextInt(100);
//            System.out.print(arr[i]+", ");
//            if (arr[i] > max) {
//                max = arr[i];
//                index = i;
//            }
//        }
//
//        System.out.println("\nМаксимальное циcло массива: "+max);
//        System.out.println("Индекс максимального числа: " + (index-1));

        //System.out.println(List.of(arr).indexOf(max));
        /****Максимальное цисло массива начало****/
    }
}
