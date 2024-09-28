package coding.DSA;

public class LinkedList1 {
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
		}

		@Override
		public String toString() {
			return data;
		}
		
	}
	
	//add - first,last
	//------------------------------------------------------------------------------------------
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return	;
		}
		newNode.next=head;
		head=newNode;
		}
//-------------------------------------------------------------------------------------------------
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
		}
//-------------------------------------------------------------------------------	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
		}
		
		Node currNode=head;
		
		while(currNode!=null) {
			System.out.print(currNode+" -> ");
			currNode=currNode.next;
		}
		System.out.println("Null");
		
	}
//---------------------------------------------------------------------------------------
	public void deleteFirst() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		
		head=head.next;
	}
//----------------------------------------------------------------------------------------
	public void deleteLast() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLast=head;
		Node last=head.next;
		
		while(last.next!=null) {
			last=last.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
		
	}
	
	
	public static void main(String[] args) {
		
           LinkedList1 list=new LinkedList1();
           list.addFirst("a");
           list.addFirst("b");
           list.printList();
           list.addLast("c");
           list.addLast("X");
           list.printList();
           
	}

}
