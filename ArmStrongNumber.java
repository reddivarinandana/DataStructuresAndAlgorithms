public class ArmStrongNumber {
    public static void main(String[] args){ 
        int num = 153;
        int temp = num;
        String str = num + "";
        int length = str.length();
        double sum = 0;
        while( num > 0){
            double remainder = num % 10;
            sum = sum + Math.pow(remainder , length);
            num = num / 10;
        }
        if(sum == temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
