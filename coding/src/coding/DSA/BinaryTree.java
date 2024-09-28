package coding.DSA;

public class BinaryTree {
   static class Node{
	   int data;
	   Node left;
	   Node right;
	   
	   Node(int data){
		   this.data=data;
		   this.left=null;
		   this.right=null;
	   }
	   
	   
	   
   }
   
 public static Node binaryTree( Node root,int val) {
	   
	   if(root==null) {
		   root=new Node(val);
		   return root;
	   }
	   
	   if(root.data>val) {
		   root.left=binaryTree(root.left,val);
	   }else {
		   root.right=binaryTree(root.right,val);
	   }
	   return root;
   }
 
 public static void inorder( Node root) {
	 if(root==null) {
		 return;
	 }
	 
	 inorder(root.left);
	 System.out.print(root.data);
	 inorder(root.right);
 }
 
 public static boolean search( Node root,int key) {
	 if(root==null) {
		 return false;
	 }
	 
	 if(root.data==key) {
		 return true;
	 }else if(root.data<key) {
		 return search(root.right,key);
	 }else {
		return  search(root.left,key);
	 }
	
	 
 }
	
	public static void main(String[] args) {
		int a[]= {5,3,4,2,1,6,7};
		Node root=null;
		
		for(int i=0;i<a.length;i++) {
			root=binaryTree(root,a[i]);
		}
		
		inorder(root);
		
		
		if(search(root,1)) {
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}

	}

}
