// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

package homeWork;

public class EmptyArray {
    public static void main(String[] args) {

        int[] arr= new int[8];
        for (int i = 0; i < arr.length; i++) {
            int b = i * 3;
            arr[i] = b;
        }
        for ( int o : arr ) {
            System.out.print(o + " ");
        }

    }
}
