import java.util.Arrays;
import java.util.Scanner;
public class MyArrayList {
	Object ar[];
	int size;
	public MyArrayList()
	{
		ar=new Object[10];
	}
	public Object getLists(int index) 
	{
		if(index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		else {
			return ar[index];
		}
	}
	public void add(Object ele)
	{
		if(ar.length-size<=5)
		{
			increseSize();
		}
		ar[size++]=ele;
	}
	public void increseSize() 
	{
		ar=Arrays.copyOf(ar,ar.length*2);
	}
	public void remove(int index)
	{
		if(index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			ar[index]=null;
			//int t=index;
			for(int i=index;i<size;i++)
			{
				ar[i]=ar[i+1];
				ar[i+1]=null;
			}
			size--;
		}
	}
	public void getSize()
	{
		System.out.println(size);
	}
	public void disp()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		MyArrayList m=new MyArrayList();
		Scanner sc=new Scanner(System.in);
		while(true) { 
			 System.out.println("1. ADD");
			 System.out.println("2. REMOVE");
			 System.out.println("3. Size");
			 System.out.println("4. Display");
			 System.out.println("Enter the choice");
			 int choice;
			 switch(choice=sc.nextInt()) {
			 case 1:
				 System.out.println("Enter the element");
				 int a=sc.nextInt();
				 m.add(a);
				 break;
			 case 2:
				 System.out.println("Enter the index ");
				 int b=sc.nextInt();
				 m.remove(b);
				 break;
			 case 3:
				 m.getSize();
				 break;
			 case 4:
				 m.disp();
				 break;
			 default:
				 System.exit(0);
		 }
	 }
  }
}