
public class preorderTraversal {
	protected static class Node{
	int key;
	String expression;
	Node leftChild;
	Node rightChild;
	
	public Node(int key, String exp)
	{
		this.key = key;
		this.expression = exp;
	}
	public String toString() {
		return expression+ " ";
	}
	}

	Node root;
	public void addNode(int key, String expression) {
		Node newNode = new Node(key, expression);
				if(root==null) {
					root = newNode;
				}
				else {
					Node focusNode = root;
					Node parent;
					while(true) {
						parent = focusNode;
						if(key<focusNode.key) {
							focusNode = focusNode.leftChild;
							if(focusNode==null) {
								parent.leftChild = newNode;
								return;
							}
						}
						else {
							focusNode = focusNode.rightChild;
							if(focusNode == null) {
								parent.rightChild = newNode;
								return;
							}
						}
					}
				}
					
	}
	public void preorderTraverseTree(Node focusNode) {
		if(focusNode!=null) {
			System.out.print(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}
	public static void main(String[] args)
	{
		preorderTraversal tree = new preorderTraversal();
         tree.addNode(50,"-");//position 1
         tree.addNode(20, "/");//position 2
         tree.addNode(60, "+");//3
	     tree.addNode(10, "*");//4                       
         tree.addNode(30, "+");//5
         tree.addNode(55, "*");//6
         tree.addNode(80, "6");//7
         tree.addNode(5, "+");//8  
         tree.addNode(11, "3");//9
         tree.addNode(25, "-"); //10
         tree.addNode(35, "2");//11
 		tree.addNode(51, "3"); //12
 		tree.addNode(57, "-");//13
 		tree.addNode(4, "3");//14
 		tree.addNode(6, "1");//15          
 		 tree.addNode(24, "9");
         tree.addNode(26, "5");
 		tree.addNode(56, "7"); //16
        tree.addNode(58, "4");//17                  
   tree.preorderTraverseTree(tree.root);

		
	}
}
