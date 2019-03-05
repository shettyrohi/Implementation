
class Node
{
	int ele;
	Node next;
	Node(int ele)
	{
		this.ele=ele;
	}
	Node(int ele, Node next)
	{
		this.ele=ele;
		this.next=next;
	}
}
class MyLinkedList
{
		Node start;
		int size;
		Node p;
public void add(int ele)
{
	if(start==null)
	{
	start=new Node(ele);
	size++;
	}
	else
	{
	p=start;
	while(p.next!=null)
	{
		p=p.next;
	}
	p.next=new Node(ele);
	size++;
	}
}
public void getSize()
{
	System.out.println("no of nodes="+size);
}
 public void add(int index,int ele)	
 {
	if(index>=size)
	{
		System.out.println("exception");
	}
	else
	{
		p=start;
		for(int i=0;i<index-1;i++)
		{
			p=p.next;
		}
		p.next=new Node(ele,p.next);
		size++;
	}
 }
 public void remove(int index)
 {
	 if(index >=size)
	 {
		 System.out.println("exception");
	 }
	 else if(index==0)
	 {
		start=start.next;
		size--;
	 }
	 else
	 {
		p=start;
		for(int i=0;i<index-1;i++)
		{
			p=p.next;
		}
		p.next=p.next.next;
		size--;
	 }
 }
 public void disp()
 {
	 p=start;
	 for(int i=0;i<size;i++)
	 {
		 System.out.println(p.ele);
		 p=p.next;
	 }
 }
}
public class LinkedList {

	public static void main(String[] args) {
		MyLinkedList obj=new MyLinkedList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(50);
		obj.disp();
		obj.getSize();
		obj.add(3,40);
		System.out.println("after adding on element at index 3");
		obj.disp();
		System.out.println("after removing on element at index 1");
		obj.remove(1);
		obj.disp();
	}
}
