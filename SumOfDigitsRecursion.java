public class SumOfDigitsRecursion {
    public static void main(String[] args){
        int number = 4243;
        int remainder = 0;
        int sum =0;
        System.out.println(digitSum(number,remainder,sum));
    }
    public static int digitSum(int num,int rem,int sum){
        if(num == 0){
            return sum;
        }
        rem = num % 10;
        sum = sum + rem;
        num = num/10;
        return digitSum(num,rem,sum);
    }
}
