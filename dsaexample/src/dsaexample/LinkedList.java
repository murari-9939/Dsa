package dsaexample;

import java.util.Scanner;

public class LinkedList {
	static class Node{
		int data;
		Node next;
		 Node(int data) {
		
			this.data = data;
			this.next = null;
		}
		
	}
//	we have to declare head nuLL
	Node head=null;
	
	public void Creation() {
		int data, n;
		do{
		Scanner st= new Scanner(System.in);
		System.out.println("enter data");
		data=st.nextInt();
//		creating object of the node class and passing data dta1 ke jagha per new_node bhi likh
//		sakte hai
		Node data1= new Node(data);
//		condidtion If linked list does not exists
		if(head==null) {
//			the head me hame data assing karna parega
			head=data1; //10
		}
//		agar koi node already exist karta hai to
		else {
			data1.next=head; //30,20,10
			head=data1;
			
		}
		System.out.println("do you want to add more data if yes then press 1");
		n=st.nextInt();
	
		}
		while(n==1);
		
	}
	public void traverse() {
//		we have to take pointer temp to inisilizae with head for iterating the linked list
		Node temp=head;
		if(head==null)   {
			System.out.println("linked list does not exist");
		}
		else {
			while(temp !=null) {
				System.out.println(temp.data+" ");
//				data ko print karwate rahnge aur next node me jate rahegge
				temp=temp.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList pt = new LinkedList();
		pt.Creation();
		pt.traverse();
	}

}
