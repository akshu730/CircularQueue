package CircularQueues;

public class SimpleCircularQueue 
{
	int front;
	int rear;
	int capacity;
	int[] array;
	
	SimpleCircularQueue(int size)
	{
		capacity = size;
		rear = -1;
		front = -1;
		array = new int[size];
	}
	
	public boolean isEmpty()
	{
		return (front==-1);
	}
	
	public boolean isFull()
	{
		return ((rear+1)%capacity == front);
	}
	
	public void enqueue(int data)
	{
		if(isFull())
			System.out.println("Queue is full");
		else
		{
			rear = (rear+1)%capacity;
			array[rear] = data;
			if(front==-1)
				front = rear;
			System.out.println(data+" inserted to the queue");
		}
	}
	
	public void dequeue()
	{
		int data;
		if(isEmpty())
			System.out.println("Queue is empty");
		else
		{
			data = array[front];
			System.out.println(data+" is removed from the queue");
			if(front==rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front = (front+1)%capacity;
			}
		}

	}
}
