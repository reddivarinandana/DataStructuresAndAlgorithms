public class ReverseString {
    public static void main(String[] args) {
        String string = "nandana";
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        System.out.println(reverse);
    }
}


