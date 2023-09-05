/*10 . Write a program to find the 3rd largest element and 2nd smallest element in an array without using sorting methods.*/
public class ThirdLargestSecondSmallest {
    public static void main(String[] args){
        int[] arr= {5,4,3,2,1};
        for(int i=0;i<arr.length; i++){
            for(int j=i+1 ; j < arr.length ;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0 ;i<arr.length;i++){
            System.out.println("Third Largest Elelment : "+arr[arr.length-3]);
            // System.out.println(arr[arr.length-3]);
            System.out.println("Second smallest element : "+arr[1]);
            // System.out.println(arr[1]);
            break;
        }
    }
}



