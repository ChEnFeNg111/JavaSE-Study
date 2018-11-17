/*
Set��Ԫ�������򣨴����ȡ����˳��һ��һ�£���Ԫ�ز������ظ���
	|--HashSet: �ײ�����ݽṹ�� ��ϣ��
			HashSet����α�֤Ԫ�ص�Ψһ�ԣ�����
				ͨ��Ԫ�ص����������� hashCode() �� equals() �����
				���Ԫ�ص�hashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue
				���Ԫ�ص�hashCodeֵ��ͬ���������equals;

			ע�⣺HashSet���϶����ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ����������ķ�����Ԫ�ص�hashCode��equals����
				  ��ArrayList�ж������ķ�����equals��������;

	|--TreeSet�����Զ�Set������Ԫ�ؽ������򣻣�ǰ��Ԫ��Ҫ�߱��Ƚ��ԣ�
				�ײ����ݽṹ�� ������
				��֤Ԫ��Ψһ�Ե�����
				compareTo()���� return 0;

				TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ���
				Ԫ����Ҫʵ�� Comparable �ӿڣ����� compareTo��T t��������
				���ַ�ʽ��ΪԪ�ص���Ȼ˳��Ҳ��Ĭ��˳��

				TreeSet�ĵڶ�������ʽ
				��Ԫ�������߱��Ƚ���ʱ�����߾߱��ıȽ��Բ�������Ҫ��
				��ʱ����Ҫ�ü�������߱��Ƚ���
				ʵ�� Comparator �ӿڣ����� comapre(T t,T t) ����
				�ڼ��ϳ�ʼ��ʱ������Ԫ�ؾ߱��Ƚ���

Set���ϵĹ��ܺ�Collection��һ�µ�

����
	��TreeSet�����д洢�Զ������ѧ��
	����ѧ���������������

ע�⣺����ʱ������Ҫ������ͬʱ��һ��Ҫ�ж�һ�´�Ҫ�����Ƿ���ͬ��
*/ 


import java.util.*;

class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();//���Զ�Set������Ԫ�ؽ������� 

		ts.add(new Student("kobe1",18));
		ts.add(new Student("kobe2",15));
		ts.add(new Student("kobe4",20));
		//ts.add(new Student("kobe2",15));�޷������ظ����ݣ�Set��Ԫ�������򣨴����ȡ����˳��һ��һ�£���Ԫ�ز������ظ�����TreeSet��֤��˳��

		Iterator it = ts.iterator();//������

		while(it.hasNext())
		{
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+"-----"+stu.getAge());
		}
	}
}

class Student implements Comparable//�ýӿ�ǿ���� ѧ�� �߱��Ƚ���
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

	public int compareTo(Object obj)//��дComparable�е� compareTo() ������ֻ���ȽϺ�Ľ��
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("���಻��ѧ������");
		
		Student s = (Student)obj;//ǿ��ת��

		System.out.println(this.name+"------compareTo------"+s.name);

		//����������������������ݴ˶�����С�ڡ����ڻ��Ǵ���ָ������

		if(this.age>s.age)//���ڷ�������
			return 1;

		if(this.age==s.age)//���ڷ���0����������ͬʱ���ٽ��������ֵ�˳��Ƚ�һ��
		{
			return this.name.compareTo(s.name);//�̳���String�е� compareTo()
		}
		
		return -1;//С�ڷ��ظ���
	}
}

