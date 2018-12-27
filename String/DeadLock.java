/*
死锁：同步中嵌套同步！！！
*/

class Test implements  Runnable
{
	private boolean flag;
	Test(boolean flag)//构造函数初始化
	{
		this.flag=flag;
	}

	public void run()
	{
		if(flag)
		{
			synchronized(Mylock.locka)//相当于this
			{
				System.out.println("LOCKA");
				synchronized(Mylock.lockb)//同步嵌套导致死锁
				{
					System.out.println("LOCKB");
				}
			}
		}

		else
		{
			synchronized(Mylock.lockb)
			{
				System.out.println("B LOCKB");
				synchronized(Mylock.locka)
				{
					System.out.println("A LOCKA");
				}
			}
		}
	}
}

class Mylock//单独存放两个锁
{
	static Object locka=new Object();//static 方便调用
	static Object lockb=new Object();
}

class DeadLock
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Test(true));
		Thread t2=new Thread(new Test(false));
		t1.start();
		t2.start();
	}
} 
