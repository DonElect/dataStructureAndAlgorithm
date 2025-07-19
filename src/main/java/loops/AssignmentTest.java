package loops;

import java.util.Arrays;

public class AssignmentTest {
    public static void main(String[] args) {
        //Big O Notation: 1. Time complexity 2. Space complexity
        // O(1), O(N), O(N^2),O(logN), O(NlogN)
//        chiweikeCode();
//        ikeCode();
        chiweikeCodeV2();
    }

    public static void chiweikeCodeV2() { // O(N)
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] newArr = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0 ; i--) { //N
                newArr[index++] = numbers[i];
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void chiweikeCode() { // O(N^2)
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < numbers.length - 1; i++) { //N
            for (int j = 0; j < numbers.length - i - 1; j++) { //N
                if (numbers[j] > numbers[j + 1]) {
                    int cup = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = cup;

                }
            }
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void ikeCode() {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Arrays.sort(numbers); // O(NlogN) -> O(N^2)
        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
    }
}
