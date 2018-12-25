/*
静态代码块
格式：
static
{
		静态代码块中的执行语句
}

特点：随着类的加载而执行，只执行一次，并优先于主函数执行
	  用于给类进行初始化
*/

/*执行结果：
a
c 9
d
hello world!
*/

class Staticcode
{
	int num=9;
	Staticcode()//没有创建该对象就不调用该方法，不输出b
	{
		System.out.println("b");
	}
	static//静态代码块,给类进行初始化
	{
		System.out.println("a");
	}
	//给对象初始化
	{
		System.out.println("c "+this.num);
	}

	Staticcode(int x)
	{
		System.out.println("d");
	}


}
class Staticcodedemo
{
	public static void main(String[] args)
	{
		new Staticcode(5);
		System.out.println("hello world!");
	}
}