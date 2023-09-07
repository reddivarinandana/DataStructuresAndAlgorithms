public class SumOf2NumbersTarget {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;

        TwoSum(array, target);
    }
    public static void TwoSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + ", " + array[j]);
                    return;
                }
            }
        }
        System.out.println("No such pair found.");
    }
}


