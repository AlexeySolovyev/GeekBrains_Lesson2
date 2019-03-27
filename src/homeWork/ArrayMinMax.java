// 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)

package homeWork;

public class ArrayMinMax {
    public static void main(String[] args) {

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 12) - 6);

            System.out.print(arr[i] + " ");
        }
    }
    public static void getMax() {

    }

    public static void getMin() {

    }
}
