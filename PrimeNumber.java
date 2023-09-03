public class PrimeNumber {
     public static void main(String[] args) {
        if (isPrimeNumber()) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }

    public static boolean isPrimeNumber() {
        int number = 2; 
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

