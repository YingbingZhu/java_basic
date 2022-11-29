package search;

import java.util.ArrayList;

public class BasicSearch {
    public static void main(String[] args) {

        int[] arr = {122, 81};
        int number = 81;
        boolean b = basicSearch(arr, number);
        System.out.println(b);

    }

    public static boolean basicSearch(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    /*
     find indexes
     */
    public static ArrayList<Integer> searchIndex(int[] arr, int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
