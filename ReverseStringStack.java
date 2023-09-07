class Node{
    char data;
    Node next;
}
class Stack {
    static Node top;
    public static void push(char data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        if(top == null){
            top = temp;
            return;
        }
        temp.next = top;
        top = temp;
    }
    public static char pop(){
        if(top == null){
            return '\0';
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }
    public static void main(String[] args) {
        String str = "Nandana";
        Stack stack = new Stack();
        char[] strArray = str.toCharArray();
        for(int i = 0;i<strArray.length;i++){
            stack.push(strArray[i]);
        }
        for(int i = 0;i<strArray.length;i++){
            strArray[i] = stack.pop();
        }
        System.out.println(str);
        System.out.println(String.valueOf(strArray));
    }
}


