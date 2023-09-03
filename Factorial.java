public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial());
    }
    public static int factorial() {
        int num = 5; 
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

