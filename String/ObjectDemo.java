/*
Objict 类是类层次结构的根类（超类），
该类中定义的肯定是对所有对象都具备的功能
*/
class Demo//extends Object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}

	public boolean equals(Object obj)//Object obj=new Demo();多态
	{
		if(!(obj instanceof Demo))//如果左边对象不是是右边类的实例
			return false;

		Demo d=(Demo)obj;//强制转型，向下转型
		return this.num==d.num;
	}
}

class ObjectDemo
{
	public static void main(String[] args)
	{
		Demo d1=new Demo(4);
		Demo d2=new Demo(4);
		System.out.println(d1.equals(d2));//equals(Object oj)任意的对象比较
	}
}