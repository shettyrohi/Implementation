import java.util.*;
public class Stack
{
	int[] ar;
	int top;
	int size;
	int len;
	public Stack(int n)
	{
		size=n;
		len=0;
		top=-1;
		ar=new int[n];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public int getSize()
	{
		return len;	
	}
	public int peak() 
	{
		if( isEmpty())
		{
			throw new NoSuchElementException("under flow Exception");
		}
		return ar[top];
	}
	public  void push(int ele)
	{
		if(top+1>=size)
		{
			throw new IndexOutOfBoundsException("overflow Exception");
		}
		else
		{
			ar[++top]=ele;
			len++;
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		len--;
		return ar[top--];
	}
	public void display()
	{
		if(len==0)
		{
			System.out.println("Empty");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args)
	{ 
		Stack obj=new Stack(10);
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		System.out.println(obj.peak());
		obj.display();
		System.out.println("******");
		obj.pop();
		obj.display();
		System.out.println(obj.peak());
	}
}
