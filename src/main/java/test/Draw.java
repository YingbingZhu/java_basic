package test;

import java.util.Random;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.println("==================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        int[] userInputArr = userInputNumber();
        
        int red = 0;
        int blue = 0;

        for (int i = 0; i < userInputArr.length; i++) {
            int redNumber = userInputArr[i];
            for (int j = arr.length - 1; j >= 0; j--) {
                if (redNumber == arr[j]) {
                    red++;
                    break;
                }
            }
        }

        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blue++;
        }
        if (red == 6 && blue == 1) {
            System.out.println("congrats");
        }
    }

    public static int[] userInputNumber() {
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("input of" + (i+1) + "red number");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                } else {
                    System.out.println("exists");
                }
            } else {
                System.out.println("out of range");
            }

        }
        return arr;
    }

    public static int[] createNumber() {
        //1. array to store numbers, 6 red 1 blue
        int[] arr = new int[7];

        //2. random number
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }

        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;

    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
