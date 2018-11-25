/*


泛型：JDK1.5版本之后出现的新特性，用于解决安全问题，是一个安全机制
		<数据类型>
好处：
	1：将运行时期出现问题  ClassCastException 转移到编译时期
		方便于程序员解决问题，让运行事情问题减少，使程序更安全

	2：避免了强制转化的麻烦

泛型格式：通过< >来定义要操作的引用数据类型
当使用集合时，将集合中要存储的数据类型作为参数传递到<>中即可
		  
在使用Java提供的对象时，什么时候写泛型？？？
	通常在集合框架中很常见；
	只要见到< >就要定义泛型

<?> 通配符。也可以理解为占位符。
泛型的限定；
<? extends E>: 可以接收E类型或者E的子类型。上限。
<? super E>: 可以接收E类型或者E的父类型。下限

//泛型类。
/*
什么时候定义泛型类？
当类中要操作的引用数据类型不确定的时候，
早期定义Object来完成扩展。
现在定义泛型来完成扩展。

//泛型类定义的泛型，在整个类中有效。如果被方法使用，
//那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就已经固定了。
//为了让不同方法可以操作不同类型，而且类型还不确定。
//那么可以将泛型定义在方法上。

特殊之处：
静态方法不可以访问类上定义的泛型。
如果静态方法操作的应用数据类型不确定，可以将泛型定义在方法上。


*/
import java.util.*;

class GenericDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> a = new TreeSet<String>(new myGeneric());
		
		a.add("abc");
		a.add("fdcd");
		a.add("eg");
		a.add("g");

		Iterator<String> it = a.iterator();

		while(it.hasNext())
		{
			String s=it.next();
			//String s=(String)it.next();避免了强制转化的麻烦
			System.out.println(s);
		}
	}
}

class myGeneric implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		int num= new Integer(o1.length()).compareTo(new Integer(o2.length()));

		if(num==0)
			return o1.compareTo(o2);
		return num;
	}
}