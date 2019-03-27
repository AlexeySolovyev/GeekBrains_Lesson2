// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по нему циклом, и числа, меньшие 6, умножить на 2;

package homeWork;

public class MultiplicationArray {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int o : arr) {
            if (o < 6) {
                int c = o * 2;
                System.out.print(c + " ");
            }
        }

    }
}
