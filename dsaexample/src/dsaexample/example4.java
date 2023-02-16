package dsaexample;

public class example4 {
	Node head;
	private int size;
	example4(){
		this.size=0;
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
//			jo next hoga by default sb ke liye null hoga
			this.next=null;
			size++;
		}
	}
//	do tarh ke add hote ek add-first, add -last
	public void addFirst(String data) {
	
		Node new_node = new Node(data);
		if(head==null) {
			head=new_node;
			return;
		}
		new_node.next=head;
		head=new_node;
	}
	
	public void addLast(String data) {
	
		Node new_node = new Node(data);
		if(head==null) {
			head=new_node;
			return;
		}
		Node CurrentNode=head;
		while(CurrentNode.next!=null) {
			CurrentNode=CurrentNode.next;
		}
		CurrentNode.next=new_node;
	}
	public void  printList() {
//		Node head = null;
		if(head==null) {
			System.out.println("lis is empty");
		}
		Node CurrentNode=head;
		while(CurrentNode!=null) {
			System.out.print(CurrentNode.data+" ");
			CurrentNode=CurrentNode.next;
		}
		System.out.println("null");
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		head=head.next;
		}
//delete last
	public void deleteLast() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLast= head;
		Node lastNode=head.next;
		while(lastNode.next !=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
//finding the size of linked list
public int Getsize() { 
	return size;
}

public static void main(String[] args) {
	example4 lp1= new example4();
	lp1.addFirst("a");
	lp1.addFirst("b");
	lp1.addFirst("c");
	lp1. printList();
	lp1.addLast("h");
	lp1. printList();
	lp1.deleteFirst();
	lp1.printList();
	lp1. deleteLast();
	lp1. printList();
	
	System.out.println(lp1.Getsize());
}
}
