import java.util.Random;

public class urokMassiv {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = random.nextInt(100);
            }
            double average = 0;
            if (intArray.length > 0) {
                double sum = 0;
            for (int i = 0; i < intArray.length; i++) {
                sum+=intArray[i];
            }
                average = sum / intArray.length;
        }
        System.out.println(average);
    }
}
