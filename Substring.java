public class Substring {
    public static void main(String[] args){
        String s1 = "Nandana";
        String s2 = "Nanda";
        boolean a = false;
        for(int i=0; i<s1.length(); i++){
            String bag = "";
            for(int j=i; j<s2.length(); j++){
                bag += s1.charAt(j);
                //System.out.println(bag);
                if(bag.equals(s2)){
                    a = true;
                    break;
                }
            }
        }
        if(a == true){
            System.out.println("s2 is a substring of s1");
        }else{
            System.out.println("s2 is not a substring of s1");
        }
    }
}

