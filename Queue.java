
import java.util.NoSuchElementException;
public class Queue {
	int[] queue;
	int front;
	int rear;
	int size;
	int len;
	public Queue(int n)
	{
		size=n;
		len=0;
		front=-1;
		rear=-1;
		queue=new int[n];
	}
	public boolean isEmpty()
	{
	return front==-1;
	}
	public boolean isFull()
	{
		return front==0&&rear==size-1;
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
		return queue[front];
	}
	public  void insert(int ele)
	{
		if(rear==-1)
		{front =0;
		rear=0;
		queue[rear]=ele;
		len++;
		}
		else if(rear>=size-1)
		{

			throw new IndexOutOfBoundsException("overflow Exception");
		}
		else
		{
			queue[++rear]=ele;
			len++;
		}
	}
	public int remove()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		else
		{
			len--;
			int ele=queue[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			return ele;
		}
	}
	public void display()
	{
	if(len==0)
	{
		System.out.println("Empty");
	}
	else {
	for(int i=front;i<=rear;i++)
	{
		System.out.println(""+queue[i]);
	}
	}
	}
	public static void main(String[] args)
	{ 
		Queue obj=new Queue(10);
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		obj.display();
		System.out.println("Peak:"+obj.peak());
		System.out.println("******");
		obj.remove();
		obj.display();
		System.out.println("Peak:"+obj.peak());
		
		
	}
}
