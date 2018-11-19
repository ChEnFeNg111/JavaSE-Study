/*
��ϰ��
	ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�
	ѧ��Student����ַString��
	ѧ�����ԣ����������䡣
	ע�⣺������������ͬ����Ϊͬһ��ѧ����
	��֤ѧ����Ψһ�ԡ�



	1������ѧ����

	2������map��������ѧ����Ϊ������ַ��Ϊֵ�����롣

	3����ȡmap�����е�Ԫ�ء�

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
		return name.hashCode()+age*11;//������ͬ
	}

	public boolean equals(Object obj)//��֤�˼���Ψһ��
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ��");
		
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

		//��һ�ַ�ʽȡ����keySet
		Set<Student> keySet = hs.keySet();

		Iterator<Student> it = keySet.iterator();

		while(it.hasNext())
		{
			Student stu = it.next();
			String add = hs.get(stu);

			System.out.println(stu+"---"+add);
		}

		//�ڶ��ַ�ʽȡ����entrySet
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