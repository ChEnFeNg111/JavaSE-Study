/*
ArrayList��ϰ
ȥ��ArrayList�����е��ظ�Ԫ�أ�
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
		//����һ����ʱ����
		ArrayList Al = new ArrayList();

		Iterator it = al.iterator();//����������������

		while (it.hasNext())
		{
			Object obj = it.next();

			if(!Al.contains(obj))//�ж��Ƿ�����ظ���
				Al.add(obj);
		}

		return Al;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}