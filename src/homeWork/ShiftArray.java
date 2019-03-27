// 7. *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами

package homeWork;

public class ShiftArray {
    public static void main(String[] args) {

        modifyArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, -1);
    }

    public static void modifyArray(int[] arr, int n) {
        System.out.print("Массив до смещения на n элементов: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int change = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = change;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int change = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = change;
            }
        }

        System.out.print("\nМассив после смещения на n элементов:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
