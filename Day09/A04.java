 public class A04 implements Runnable
{
	static Class cr;
	 static void disp()
	 {
		synchronized(cr)
		{
			for(int i=1;i<11;i++)
			{
				System.out.println(i);
			}
		}
	}
	public void run()
	{
		disp();
	}
	public static void main(String args[])throws Exception
	{
		cr=Class.forName("A04");
		A04 c=new A04();
		(new Thread(c)).start();
		(new Thread(c)).start();
	}
}