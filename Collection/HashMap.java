/*
练习：
	每一个学生都有对应的归属地。
	学生Student，地址String。
	学生属性：姓名，年龄。
	注意：姓名和年龄相同的视为同一个学生。
	保证学生的唯一性。



	1，描述学生。

	2，定义map容器。将学生作为键，地址作为值。存入。

	3，获取map集合中的元素。

*/
import java.util.*;

class Student implements Comparable<Student>
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

	public String toString()
	{
		return name+"::"+age;
	}

	public int compareTo(Student s)
	{
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}

	public int hashCode()
	{
		return name.hashCode()+age*11;//避免相同
	}

	public boolean equals(Object obj)//保证了键的唯一性
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("类型不匹配");
		
		Student s=(Student)obj;
		return this.name.equals(s.name) && this.age==s.age; 
	}
}

class MapTest
{
	public static void main(String[] args)
	{
		HashMap<Student,String> hs = new HashMap<Student,String>();

		hs.put(new Student("kobe1",18),"beijing");
		hs.put(new Student("kobe1",18),"nanjin");
		hs.put(new Student("kobe2",24),"tianjin");
		hs.put(new Student("kobe3",30),"guangdong");
		hs.put(new Student("kobe4",35),"jiangxi");

		//第一种方式取出：keySet
		Set<Student> keySet = hs.keySet();

		Iterator<Student> it = keySet.iterator();

		while(it.hasNext())
		{
			Student stu = it.next();
			String add = hs.get(stu);

			System.out.println(stu+"---"+add);
		}

		//第二种方式取出：entrySet
		Set<Map.Entry<Student,String>> entrySet = hs.entrySet();

		Iterator<Map.Entry<Student,String>> iter = entrySet.iterator();

		while(iter.hasNext())
		{
			Map.Entry<Student,String> m = iter.next();

			Student stu = m.getKey();
			String add = m.getValue();

			System.out.println(stu+"::"+add);
		}
	}
}