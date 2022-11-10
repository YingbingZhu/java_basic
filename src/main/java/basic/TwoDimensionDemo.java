package basic;

public class TwoDimensionDemo {
    public static void main(String[] args) {
        // static initialize
        int[][] arr1 = new int[][]{{1, 2, 3}, {1, 2, 3, 4, 5}};
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j] + " ");
            }
        }

        // non-static
        int[][] arr3 = new int[2][3];
        arr3[0][0] = 10;
        
    }
}
