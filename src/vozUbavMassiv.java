public class vozUbavMassiv {

    public static void main(String[] args) {
        /*Массивке маани беруу*/
        int[] arr ={5,1,2,5,7,9};
        /*return'ду башка бир озгормого байлап алылуу*/
        int[] a =  trueFalse(arr,true);
        /*Массивди консольго чыгаруу for i, колдонуп*/
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    static int[] trueFalse (int[]arr, boolean d) {
        /*Эгерде true болсо осуу турундо чыгаруу*/
        if (d == true) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int min = arr[i];
                        arr[i] = arr[j];
                        arr[j] = min;
                    }
                }
            }
            /*Эгерде false болсо кемитуу турундо чыгаруу*/
        } else if (d == false) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int max = arr[i];
                        arr[i] = arr[j];
                        arr[j] = max;
                    }
                }
            }
        }
        /*возврашение массива*/
        return arr;
    }
}
