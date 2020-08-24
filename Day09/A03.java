public class A03 implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<6;i++)
		{	
			System.out.println("EXEC "+i);
		}
	}
	public static void main(String args[])
	{
		A03 ob=new A03();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		Thread t3=new Thread(ob);
		t1.start();
		t2.start();
		t3.start();
	}
}