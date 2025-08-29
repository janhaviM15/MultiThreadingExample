package multithreading;

class Test1 extends Thread

{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(5*i);
		}
	}
}

class Test2 extends Thread
{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(6*i);
		}
	}
}
public class Ex6 
{
	public static void main(String[] args) 
		{
		Test1 t1 = new Test1();
		t1.start();
		
		Test2 t2 = new Test2();
		t2.start();
		
		
	}

}
