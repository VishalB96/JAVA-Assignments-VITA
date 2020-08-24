public class A02 implements Runnable
{
	public void run()
	{
		for(char i='A';i<'K';i++)
		{	
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		A02 ob=new A02();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}