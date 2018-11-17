/*
Set：元素是无序（存入和取出的顺序不一定一致），元素不可以重复；
	|--HashSet: 底层的数据结构是 哈希表
			HashSet是如何保证元素的唯一性？？？
				通过元素的两个方法： hashCode() 和 equals() 来完成
				如果元素的hashCode值相同，才会判断equals是否为true
				如果元素的hashCode值不同，不会调用equals;

			注意：HashSet集合对于判断元素是否存在，以及删除等操作，依赖的方法是元素的hashCode和equals方法
				  而ArrayList判断依赖的方法是equals（）方法;

	|--TreeSet：可以对Set集合中元素进行排序；（前提元素要具备比较性）
				底层数据结构是 二叉树
				保证元素唯一性的依据
				compareTo()方法 return 0;

				TreeSet排序的第一种方式：让元素自身具备比较性
				元素需要实现 Comparable 接口，覆盖 compareTo（T t）方法；
				这种方式成为元素的自然顺序，也叫默认顺序；

				TreeSet的第二种排序方式
				当元素自身不具备比较性时，或者具备的比较性不是所需要的
				这时就需要让集合自身具备比较性
				实现 Comparator 接口，覆盖 comapre(T t,T t) 方法
				在集合初始化时，就让元素具备比较性

Set集合的功能和Collection是一致的

需求：
	往TreeSet集合中存储自定义对象学生
	按照学生的年龄进行排序

注意：排序时，当主要条件相同时，一定要判断一下次要条件是否相同；
*/ 


import java.util.*;

class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();//可以对Set集合中元素进行排序； 

		ts.add(new Student("kobe1",18));
		ts.add(new Student("kobe2",15));
		ts.add(new Student("kobe4",20));
		//ts.add(new Student("kobe2",15));无法存入重复数据，Set：元素是无序（存入和取出的顺序不一定一致），元素不可以重复；但TreeSet保证了顺序

		Iterator it = ts.iterator();//迭代器

		while(it.hasNext())
		{
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+"-----"+stu.getAge());
		}
	}
}

class Student implements Comparable//该接口强制让 学生 具备比较性
{
	private String name;
	private int age;

	Student(String name,int age)
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

	public int compareTo(Object obj)//复写Comparable中的 compareTo() 方法，只看比较后的结果
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("该类不是学生对象");
		
		Student s = (Student)obj;//强制转型

		System.out.println(this.name+"------compareTo------"+s.name);

		//负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。

		if(this.age>s.age)//大于返回正数
			return 1;

		if(this.age==s.age)//等于返回0，当年龄相同时，再将姓名按字典顺序比较一下
		{
			return this.name.compareTo(s.name);//继承了String中的 compareTo()
		}
		
		return -1;//小于返回负数
	}
}

