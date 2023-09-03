class Node{
	int data;
	Node left;
	Node right;	
}

public class Tree{
	public static void inOrder(Node root){
		if(root == null){
			return;
		}
		inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
	}
	public static void preOrder(Node root){
		if(root == null){
		return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void postOrder(Node root){
		if(root == null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	public static Node NodeInsert(int data, Node root){
		if(root == null){
			root = new Node();
			root.data = data;
			return root;
		}
		if(data < root.data){
			root.left = NodeInsert(data,root.left);	
		}
		if(data > root.data){
			root.right = NodeInsert(data,root.right);
		}
		return root;
	}
	public static Node NodeDelete(int data, Node root){
		if(root == null){
			return root;
		}
		if(data < root.data){
			root.left = NodeDelete (data, root.left);
		}
		if(data > root.data){
			root.right = NodeDelete (data, root.right);
		}
		else {
		    if (root.left == null) {
		        return root.right;
		    } else if (root.right == null) {
		        return root.left;
		    }

		    root.data = minValue(root.right);
		    root.right = NodeDelete(root.data, root.right);
		}

		return root;
	}

    public static int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
	public static void main(String[] args){
		Node root = new Node();
		root.data = 20;
		Node left = new Node();
		left.data = 10;
		Node right = new Node();
		right.data = 25;
		Node leftleft = new Node();
		leftleft.data = 5;
		Node leftright = new Node();
		leftright.data = 15;
		Node rightright = new Node();
		rightright.data = 35;
		Node rightleft = new Node();
		rightleft.data = 22;
		
		root.left = left;
		root.right = right;
		root.left.left = leftleft;
		root.left.right = leftright;
		root.right = right;
		root.right.right = rightright;
		root.right.left = rightleft;
		
		//System.out.println(root.data);
		//System.out.println(root.left.data);
		//System.out.println(root.right.data);
		//System.out.println(root.left.left.data);
		//System.out.println(root.left.right.data);
		//System.out.println(root.right.right.data);
		//System.out.println(root.right.left.data);
		
		System.out.println("InOrder:");
		inOrder(root);	
		System.out.println("PreOrder:");
		preOrder(root);	
		System.out.println("PostOrder:");
		postOrder(root);
		System.out.println("NodeInsert:");
		NodeInsert(22,root);
		inOrder(root);	
		System.out.println("NodeDelete:");
		NodeDelete(22,root);
		inOrder(root);		
	}
}

