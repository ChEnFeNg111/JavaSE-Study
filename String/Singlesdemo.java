/**
单例设计模式：解决一个类在内存中只有一个对象
****开发时一般用饿汉式,建立单例设计模式

问题：
1：为了避免其他程序过多建立该类对象，先禁止其他程序建立该对象
2：为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象
3：为了更方便其他程序对自定义对象的访问可以对外提供一些访问方式

饿汉式
	解决问题：
	1：将函数私有化
	2：在类中创建一个本类对象
	3：提供一个方法可以获取该对象

先初始化对象
称为：

饿汉式
	Singles类一进内存就给对象初始化
	class
	{
		private Singles(){}//1：将函数私有化
		private static final Singles s=new Singles();//2：在类中创建一个本类对象
		public static Singles getsingles()//3：提供一个方法可以获取该对象
		{
			return s;
		}

	}


对象是方法被调用时，才初始化，也叫做对象的延时加载，
称为懒汉式
Singles类进内存，对象还没有存在，只调用getsingles方法时，才建立对象；
class
{
	private Singles(){}//1：将函数私有化
	private static Singles s=null;//2：在类中创建一个本类对象
	public static Singles getsingles()//3：提供一个方法可以获取该对象
	{
		if(s==null)
			synchronized(Singles.class)//锁：同步的，防止建立多个对象，多线程技术
			{
				if(s==null)
				{
					s=new Singles();
				}
			}	
		return s;
	}
}
*/
class Singles
{
	private int num;
	public void Setnum(int num)
	{
		this.num=num;
	}
	public int Getnum()
	{
		return num;
	}


	private Singles(){}//1：将函数私有化
	private static Singles s=new Singles();//2：在类中创建一个本类对象
	public static Singles getsingles()//3：提供一个方法可以获取该对象
	{
		return s;
	}

}

class Singlesdemo
{
	public static void main(String[] args)
	{	
		Singles s1=Singles.getsingles();//s1,s2,s 是同一个对象;
		Singles s2=Singles.getsingles();
		s1.Setnum(20);
		System.out.println(s1.Getnum());
		System.out.println(s2.Getnum());
	}
}