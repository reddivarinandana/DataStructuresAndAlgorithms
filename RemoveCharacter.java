class RemoveCharacter {
    public static void main(String[] args) {
        String str = "we are celebrating teachers day";
        String result = removeCharacter(str);
        System.out.println(result);
    }
    public static String removeCharacter(String str) {
        String bag = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'e') {
                bag += str.charAt(i); 
            }
        }
        return bag;
    }
}
