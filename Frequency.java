public class Frequency {
     public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++; // Increment count for each duplicate
                }
            }
            if (count == 0) { // Only print for unique elements
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + "-" + count);
            }
        }
    }
}
