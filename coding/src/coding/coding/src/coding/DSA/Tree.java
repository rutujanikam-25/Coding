package coding.DSA;

public class Tree {
	static class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}

		@Override
		public String toString() {
			return data+"";
		}
		
		
	}
	
	static class BinaryTree{
		static int idx=-1;
		 public static Node buildTree(int nodes[]) {
			idx++; 
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;  
		 }
		 
		 public static void preorder(Node root) {
			 if(root==null) {
				 return;
			 }
			 System.out.print(root.data+" ");
			 preorder(root.left);
			 preorder(root.right);
		 }
		 
		 public static void inorder(Node root) {
				if(root==null) {
					return;
				}
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		 
		 public static void postorder(Node root) {
				if(root==null) {
					return;
				}
				
				postorder(root.left);
				postorder(root.right);
				System.out.print(root.data+"  ");
				
		 }
		 
		 public static int count(Node root) {
			 if(root==null) {
				 return 0;
			 }
			 
			 int cl=count(root.left);
			 int cr=count(root.right);
			 
			 return cl+cr+1;
		 }
		 
		 public static int sum(Node root) {
			 if(root==null) {
				 return 0;
			 }
			 
			 int sl=sum(root.left);
			 int sr=sum(root.right);
			 
			 return sl+sr+root.data;
		 }
		 
		 public static int height(Node root) {
			 if(root==null) {
				 return 0;
			 }
			 
			 int lh=height(root.left);
			 int rh=height(root.right);
			 
			 int my=Math.max(lh, rh)+1;
			 return my;
		 }
		 
	}
	
	
	

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree t=new BinaryTree();
      Node root=t.buildTree(nodes);
      System.out.println(root);
      System.out.println("---------------------------------------------------");
      t.preorder(root);
      System.out.println("--------------------------------------------------");
      t.inorder(root);
      System.out.println("-------------------------------------");
      t.postorder(root);
      System.out.println();
      System.out.println(t.count(root));
      System.out.println(t.sum(root));
      System.out.println(t.height(root));
	}


	

}
