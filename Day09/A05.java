/*5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.

(use implements method)
*/

public class A05
{	boolean value_set;
	synchronized public void disp1(){
		for(int i = 1 ; i<=50 ; i++){
			while(value_set)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
			}
		}
			System.out.println(i);
			notifyAll();
			value_set=true;
		}
	}
	synchronized public void disp2(){
		for(int i = 50 ; i>0 ; i--){
			while(!value_set)
			{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
			}
		}
		value_set=false;
		System.out.println(i);
		notifyAll();
			

		}
	}
	public static void main(String args[])
	{
		A05 a1 = new A05();
		Th1 thr1 = new Th1(a1);
		Th2 thr2 = new Th2(a1);
		Thread t1 = new Thread(thr1);
		Thread t2 = new Thread(thr2);
		t1.start();
		t2.start();
	}
}



class Th1 implements Runnable{

	A05 obj;
	public Th1(A05 obj){
		this.obj=obj;
	}
	public void run(){
		obj.disp1();
	}
}

class Th2 implements Runnable{

	A05 obj;
	public Th2(A05 obj){
		this.obj=obj;
	}
	public void run(){
		obj.disp2();
	}
}



	

