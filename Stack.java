class Node{
	int data;
	Node next;
}
class Stack{
	static Node top = null;
	public static Node push(int data){
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if(top == null){
			top = temp;
		}else{
			temp.next = top;
			top = temp;
		}
		return top;
	}
	public static int pop(){
		if(top != null){
			top = top.next;
		}
		return -1;
	}
	public static void display(){
		Node traverse = top;
		while(traverse != null){
			System.out.println(traverse.data);
			traverse = traverse.next;
		}
	}
	public static void main(String[] args){
		System.out.println("Push Stack Data");
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.push(40);
		Stack.push(50);
		Stack.push(60);
		Stack.push(70);
		Stack.push(80);
		Stack.push(90);
		Stack.push(100);
		display();
		System.out.println("After POP Stack Data");
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		display();	
	}
}