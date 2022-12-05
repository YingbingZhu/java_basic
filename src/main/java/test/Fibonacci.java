package test;

public class Fibonacci {
    public static void main(String[] args) {
/*        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);*/
        System.out.println(getSum(12));
        System.out.println(getNumber(1));

    }

    public static int getSum(int month){
        if (month == 1 || month == 2){
            return 1;
        } else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }

    public static int getNumber(int day) {
        if (day <= 0 || day >= 11) {
            return -1;
        }

        // when day = 10, 1 left
        if (day == 10) {
            return 1;
        }

        // how many at day 1
        return (getNumber(day + 1) + 1) * 2;

    }

    // climb one stair or two stairs each time, how many kind
    public static int getCount(int stair) {
        if (stair == 1) {
            return 1;
        }
        if (stair == 2) {
            return 2;
        }
        return getCount(stair - 1) + getCount(stair - 2);
    }

    // climb 1/2/3 stairs each time
    public static int getCount2(int stair) {
        if (stair == 1) {
            return 1;
        }
        if (stair == 2) {
            return 2;
        }
        if (stair == 3) {
            return 4;
        }
        return getCount(stair - 1) + getCount(stair - 2) + getCount(stair-3);
    }
}
