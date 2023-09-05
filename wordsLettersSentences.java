class Main{
    public static void main(String[] args){
        String str = "Nandana is a good girl. She is learning Javascript and DSA.";
        int word = 0;
        int sentence = 0;
        int letter = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '.'){
                sentence++;
            }else if(str.charAt(i) == ' ' ){
                word++;
            }else if(str.charAt(i) != ' '){
                letter++;
            }
        }
        if(str.charAt(str.length()-1) != ' '){
            word++;
        }
        System.out.println("Number of Words : "+word);
        System.out.println("Number of Letters : "+letter);
        System.out.println("Number of Sentences : "+sentence);
    }
}
