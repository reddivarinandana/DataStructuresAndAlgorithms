/*5 . Write a program to check whether a given number is a perfect Square.*/
public class PerfectSquare {
    public static void main(String[] args){
        int num = 4;
        for(int i=0; i<=num; i++){
            if(i*i == num){
                System.out.println("Perfect Square");
                return;
            }
        }
        System.out.println("Not a Perfect Square");
    }
}


