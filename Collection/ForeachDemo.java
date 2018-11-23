/*
高级for循环

格式:
	for(数据类型  变量名 : 被遍历的集合（Collection）或数组)
	{
	
	}

对集合进行遍历
	只能获取集合元素，但不能对集合进行操作

迭代器除了遍历，还可以进行remove集合中的元素的操作
如果是用ListIterator,还可以在遍历过程中对集合进行增删改查的动作

传统for和高级for有什么区别？
	高级for有一个局限性，必须有被遍历的目标

建议在遍历数组时，用传统for循环，因为传统for有角标

*/
import java.util.*;
 class ForEachDemo
 {
	 public static void main(String[] args)
	 {
		ArrayList<String> a = new ArrayList<String>();

		a.add("a1");
		a.add("a2");
		a.add("a3");

		//迭代器
		Iterator it = a.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//高级for语句
		for(String s : a)
		{
			System.out.println(s);
		}

		HashMap<Integer,String> h = new HashMap<Integer,String>();

		h.put(1,"a");
		h.put(2,"b");
		h.put(3,"c");

		Set<Integer> keySet = h.keySet();//keySet

		for(Integer i : keySet)
		{
			System.out.println("i ::"+i);
		}

		Set<Map.Entry<Integer,String>> entrySet = h.entrySet();//entrySet

		for( Map.Entry<Integer,String>  m : entrySet)
		{
			System.out.println(m.getKey()+"----"+m.getValue());
		}
 	 }
 }