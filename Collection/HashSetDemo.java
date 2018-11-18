/*
Set：元素是无序（存入和取出的顺序不一定一致），元素不可以重复；
	|--HashSet: 底层的数据结构是 哈希表
			HashSet是如何保证元素的唯一性？？？
				通过元素的两个方法： hashCode() 和 equals() 来完成
				如果元素的hashCode值相同，才会判断equals是否为true
				如果元素的hashCode值不同，不会调用equals;

			注意：HashSet集合对于判断元素是否存在，以及删除等操作，依赖的方法是元素的hashCode和equals方法
				  而ArrayList判断依赖的方法是equals（）方法;

	|--TreeSet：可以对Set集合中元素进行排序； 

Set集合的功能和Collection是一致的
*/
import java.util.*;

class Person
{
	private String name;
	private int age;

	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int hashCode()//复写Object类中的 hashCode()
	{
		System.out.println(this.name+"----hashCode");
		return name.hashCode()+age*666;
	}
	
	public boolean equals(Object obj)//复写Object类中的 hashCode(),比较相同哈希值的元素的内容是否一致；
	{
		if(!(obj instanceof Person))
			return false;

		Person p = (Person)obj;//强制转化
		System.out.println(this.name+"----equals----"+p.name);

		return this.name.equals(p.name) && this.age==p.age;//比较是否相同，返回true/false;
	}
}

public class HashCodeDemo
{
	public static void main(String[] args)
	{
		HashSet h = new HashSet();

		h.add(new Person("a1",10));
		h.add(new Person("a2",12));
		h.add(new Person("a3",13));
		h.add(new Person("a2",12));

		Iterator it = h.iterator();//迭代器

		while (it.hasNext())
		{
			Person p = (Person)it.next();
			sop(p.getName()+"::::"+p.getAge());
		}	
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}