/*
Vector 特有的取出方式 枚举功能
枚举和迭代器一样的

因为枚举的名称以及方法的名称都过长，所以不用枚举，用Iterator迭代器

*/
import java.util.*;

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v = new Vector();

		v.add("a01");
		v.add("b02");
		v.add("c03");

		Enumeration en= v.elements();//枚举
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}