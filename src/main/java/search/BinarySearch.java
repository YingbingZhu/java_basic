package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103};
        System.out.println(binarySearch(arr, 79));
    }

    public static int binarySearch(int[] arr, int number){
        int l = 0, r = arr.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid] > number){
                r = mid - 1;
            }else if(arr[mid] < number){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
