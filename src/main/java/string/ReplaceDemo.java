package string;

public class ReplaceDemo {
    public static void main(String[] args) {
        String word = "abcccddd";

        String[] arr = {"a", "c"};

        for (int i = 0; i < arr.length; i++) {
            word = word.replace(arr[i], "*");
        }
        System.out.println(word);
    }
}
