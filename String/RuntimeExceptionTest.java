/*
RuntimeException:运行时异常，会引发程序停止
	如果在函数内容抛出该异常，函数可以不声明，编译一样通过
	如果在函数上声明了该异常，调用者可以不用进行处理（try /throw），编译一样通过

之所以不用在函数上声明，是因为不需要让调用者处理
当该异常发生时，希望程序停止，因为在运行时，出现了无法继续运算的情况，希望停止程序后，对代码进行修正；

对于异常分两种：
1: 编译时被检测的异常（try/catch/throw）

2:编译时不被检测的异常（运行时异常：RuntimeException以及其子类）
	其子类：IllegalArgumentException--如果超时值为负
			IllegalMonitorStateException--如果当前线程不是此对象监视器的所有者
			InterruptedException--如果在当前线程等待通知之前或者正在等待通知时，任何线程中断了当前线程，在抛出此异常时，当前线程的中断状态被清除;
			
*/
class FushuException extends RuntimeException//运行时异常，会引发程序停止
{
	FushuException(String mes)
	{
		super(mes);
	}
}

class demo
{
	int div(int a,int b)//在函数内容抛出该异常，函数可以不声明，编译一样通过
	{
		if(b<0)
			throw new FushuException("出现除数为负数了");//在函数内容抛出该异常
		if(b==0)
			throw new ArithmeticException("被零除啦");//在函数内容抛出该异常
		return a/b;
	}
}

class RuntimeExceptionTest
{
	public static void main(String[] args)
	{
		demo d=new demo();
		int x=d.div(4,-3);//调用者可以不用进行处理（try /throw），编译一样通过
		System.out.println("x=="+x);
		System.out.println("over!!");
	}
}
