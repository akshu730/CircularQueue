package CircularQueues;

import java.util.InputMismatchException;
import java.util.Scanner;



public class SimpleCircularQueueDriver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter the size of the Queue");
		int size = sc.nextInt();
		SimpleCircularQueue scq = new SimpleCircularQueue(size);
		while(!flag)
		{
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Isfull");
			System.out.println("4. Isempty");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
			{
				System.out.println("Enter the element");
				try
				{
					int element = sc.nextInt();
					scq.enqueue(element);
				}
				catch(InputMismatchException e)
				{
					e.printStackTrace();
				}
				
				
			}break;
			case 2:
			{
				scq.dequeue();
				
			}break;
			case 3:
			{
				System.out.println(scq.isFull());
			}break;
			case 4:
			{
				System.out.println(scq.isEmpty());
			}break;
			case 5:
			{
				flag = true;
			}break;
			default:
				System.out.println("Invalid input");
			}

		}
		sc.close();
		}

}
