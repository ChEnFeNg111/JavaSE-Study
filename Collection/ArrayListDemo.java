/*
ArrayList练习
去除ArrayList集合中的重复元素；
*/

import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("01");
		al.add("02");
		al.add("01");
		al.add("04");
		al.add("01");
		al.add("02");

		sop(al);

		al=singleElement(al);

		sop(al);
	}

	public static ArrayList singleElement(ArrayList al)
	{
		//定义一个临时容器
		ArrayList Al = new ArrayList();

		Iterator it = al.iterator();//迭代器，遍历数组

		while (it.hasNext())
		{
			Object obj = it.next();

			if(!Al.contains(obj))//判断是否包含重复的
				Al.add(obj);
		}

		return Al;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}