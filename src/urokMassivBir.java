import java.util.Random;

public class urokMassivBir
{
    public static void main(String[] args) {

        /*---рандом
        Random rd = new Random();
        int[] array =new int[20];
        double arif50kich = 0;
        double arif50chon = 0;
        /*---фор чикл
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt(100);
             //   System.out.print(array[i]+",");
                if (array[i] < 50) {
                    arif50kich += array[i];
                }
                else if (array[i] > 50) {
                    arif50chon += array[i];
                }
            }
        System.out.println();
        System.out.println(arif50kich/array.length);
        System.out.println(arif50chon/array.length);*/

        Random rd = new Random();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
      //  double koshSan = 0;
        for (int i = 0; i < array.length; i++) {
           // array[i] = rd.nextInt(1,10);
            if (array[i] % 2 == 0){
                System.out.print(","+array[i]);
            }
//            else {
//                System.out.println(","+array[i]);
//            }
        }

    }
}
