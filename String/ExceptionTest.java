/*
自定义异常：因为项目中会出现特有的问题，
			而这些问题没有被Java所描述并封装对象
			所以对于这些特有的问题可以按照Java的对问题封装的思想
			将特有的问题，进行自定义封装

当在函数内部出现throw抛出异常对象，那么就必须要对应的处理动作
要么在内部try catch处理
要么在函数上声明异常，让调用者去处理

一般情况下，函数内出现异常，函数上需要声明；

自定义的异常并未定义异常信息，所以打印的结果中只有异常的名称，却没有异常的信息

如何定义异常信息？？？

	FushuException()				
	{
		super();//继承父类的信息
	}

	因为父类中已经把异常信息的操作都完成了
	所以子类只要在构造时，将异常信息传递给父类通过super()语句
	那么就可以直接通过getMassage方法获取自定义的异常信息；

自定义异常：必须是自定义类继承Exception

继承Exception原因：
	异常体系有一个特点：因为异常类和异常对象都被抛出；
	他们都具备抛出现，这个可抛性是Throwable这个体系中独有特点

只有这个体系中的类和对象才可以被throws和throw操作

throws:使用在函数上；
throw: 使用在函数内

throws:后面跟的异常类，可以跟多个，用逗号隔开
throw：后面跟的是异常对像；

*/

class FushuException extends Exception//自定义异常,必须继承Exception类
{
	private int value;
	
	FushuException(String mes,int value)//因为父类中已经把异常信息的操作都完成了//所以子类只要在构造时，将异常信息传递给父类通过super()语句//那么就可以直接通过getMassage方法获取自定义的异常信息；
	{
		super(mes);
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
}

class demo
{
	int chu(int a,int b)throws FushuException//声明异常
	{
		if(b<0)
			throw new FushuException("除数出现了负数 ：/负数",b);//手动通过关键字 throw 抛出异常信息；
		return a/b;
	}
}
class ExceptionTest1
{
	public static void main(String[] args)
	{
		try
		{
			demo d=new demo();
			int x=d.chu(10,-5);
			System.out.println("x==="+x);
		}
		catch (FushuException e)
		{
			System.out.println(e.toString());
			System.out.println("\t\t错误的负数："+e.getValue());
		}

		System.out.println("over!!!");
	}
}