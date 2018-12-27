/*
������ͬ����Ƕ��ͬ��������
*/

class Test implements  Runnable
{
	private boolean flag;
	Test(boolean flag)//���캯����ʼ��
	{
		this.flag=flag;
	}

	public void run()
	{
		if(flag)
		{
			synchronized(Mylock.locka)//�൱��this
			{
				System.out.println("LOCKA");
				synchronized(Mylock.lockb)//ͬ��Ƕ�׵�������
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

class Mylock//�������������
{
	static Object locka=new Object();//static �������
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
