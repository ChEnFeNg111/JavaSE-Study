/*
Set��Ԫ�������򣨴����ȡ����˳��һ��һ�£���Ԫ�ز������ظ���
	|--HashSet: �ײ�����ݽṹ�� ��ϣ��
			HashSet����α�֤Ԫ�ص�Ψһ�ԣ�����
				ͨ��Ԫ�ص����������� hashCode() �� equals() �����
				���Ԫ�ص�hashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue
				���Ԫ�ص�hashCodeֵ��ͬ���������equals;

			ע�⣺HashSet���϶����ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ����������ķ�����Ԫ�ص�hashCode��equals����
				  ��ArrayList�ж������ķ�����equals��������;

	|--TreeSet�����Զ�Set������Ԫ�ؽ������� 

Set���ϵĹ��ܺ�Collection��һ�µ�
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

	public int hashCode()//��дObject���е� hashCode()
	{
		System.out.println(this.name+"----hashCode");
		return name.hashCode()+age*666;
	}
	
	public boolean equals(Object obj)//��дObject���е� hashCode(),�Ƚ���ͬ��ϣֵ��Ԫ�ص������Ƿ�һ�£�
	{
		if(!(obj instanceof Person))
			return false;

		Person p = (Person)obj;//ǿ��ת��
		System.out.println(this.name+"----equals----"+p.name);

		return this.name.equals(p.name) && this.age==p.age;//�Ƚ��Ƿ���ͬ������true/false;
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

		Iterator it = h.iterator();//������

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