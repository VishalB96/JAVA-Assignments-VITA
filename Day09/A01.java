public class A01 extends Thread
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

		A01 t1=new A01();
		A01 t2=new A01();
		t1.start();
		t2.start();
	}
}