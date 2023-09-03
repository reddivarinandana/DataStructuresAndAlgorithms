class Node{
	int data;
	Node next;
}

class Queue{
	static Node first = null;
	static Node last = null;
	public static void Enqueue(int data){
		Node temp = new Node();
		temp.data = data;
		if(first == null){
			first = temp;
			last = temp;
		}else{
			last.next = temp;
			last = temp;
		}	
	}
	public static int Dequeue(){
		if(first != null){
			first = first.next;
		}
		return -1;	
	}
	public static void display(){
		Node traverse = first;
		while(traverse != null){
			System.out.println(traverse.data);
			traverse = traverse.next;
		}
	}
	public static void main(String[] args){
		System.out.println("Adding Queue Data");
		Queue.Enqueue(10);
		Queue.Enqueue(20);
		Queue.Enqueue(30);
		Queue.Enqueue(40);
		Queue.Enqueue(50);
		Queue.Enqueue(60);
		Queue.Enqueue(70);
		Queue.Enqueue(80);
		Queue.Enqueue(90);
		Queue.Enqueue(100);
		display();
		System.out.println("After Deleting Queue Data");
		Queue.Dequeue();
		Queue.Dequeue();
		Queue.Dequeue();
		Queue.Dequeue();
		Queue.Dequeue();
		display();
	}
}
