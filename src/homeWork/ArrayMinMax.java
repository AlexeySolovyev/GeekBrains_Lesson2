// 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)

package homeWork;

public class ArrayMinMax {
    public static void main(String[] args) {

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10); // забил созданный одномерный массив рандомно сгенерированными элементами
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {  // задаем условие, если перебираемый элемент меньше первого элемента массива, это и есть элемент с мин. значением
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // задаем условие, если перебираемый элемент больше первого элемента массива, это и есть элемент с макс. значением
                max = arr[i];
            }
        }

        System.out.print("Минимальный элемент массива: " + min + "\n" + "Максимальный элемент массива: " + max);
    }
}