/*
匿名内部类：
	1:匿名内部类其实就是内部类的简写格式
	2：定义匿名内部类的前提：
		内部类必须是继承一个类或者实现接口；
	3：匿名内部类的格式：
		new 父类/接口（）
		{
			定义子类的内容；
		}
	4：匿名内部类就是一个匿名子对象，可以理解为带内容的对象；
	5：匿名内部类中定义的方法最好不超过三个；
*/

interface Inter
{
	void method();
}

class Test
{
	//补足代码，通过匿名内部类；
	/*static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("method run");
		}
	}*/
	static Inter function() 
	{
		//return new Inner();
		return new Inter()//匿名内部类
		{
			public void method()
			{
				System.out.println("method run");
			}
		};
	}
}
 
class InnerClass
{
	public static void main(String[] args)
	{
		//Test.function():Test类中有一个静态的function方法;（类名直接调用方法）
		//.method():function这个方法运算后的结果是一个对象，而且是一个Inter类型的对象；
		//应为只有是Inter类型的对象，才可以调用method方法；
		Test.function().method();
		/*
			Inter in =Test.function();
			in.method();
		*/
	}
}