package sem4;

public class E31 extends Thread
{
	private static Integer i = new Integer(1);
	//private static Integer j = new Integer(1);
	private static int k=0;
	private E31 mi_thread;
	
	public E31(){k++;}
	
	public void run(){
		if(k<500)
		{
			mi_thread=new E31();
			i--; // i = -498
			mi_thread.start();
			try{
				mi_thread.join();
				}
				catch (InterruptedException e){}
			//i = -498
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		E31 otro_thread = new E31();
		otro_thread.start();
		otro_thread.join();
		System.out.println(i.toString());
	}
}
