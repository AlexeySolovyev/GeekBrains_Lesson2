// 6. Написать метод, в который передается непустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
// checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят

package homeWork;

public class CheckBalanceArray {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 2, 1};
        int[] b = {2, 1, 1, 2, 1};
        int[] c = {10, 10};

        System.out.println(checkBalance(a));
        System.out.println(checkBalance(b));
        System.out.println(checkBalance(c));
    }

    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}