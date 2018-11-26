/*
���Ͽ�ܹ�����
	Collections:
*/

import java.util.*;

class CollectionsDemo
{
	public static void main(String[] args)
	{
		sop("-----------------------------");
		sortDemo();
		sop("-----------------------------");
		maxDemo();
		sop("-----------------------------");
		binarySearch();
		sop("-----------------------------");
		shuffleDemo();
		sop("-----------------------------");
		orderDemo();
		sop("-----------------------------");
	}
	
	public static void orderDemo()//�����ϰ����ȣ���->С������
	{
		TreeSet<String> t = new TreeSet<String>(Collections.reverseOrder(new LengthCompare()));

		t.add("ddsvgd");
		t.add("vsvd");
		t.add("agv");
		t.add("bfeth");

		Iterator it = t.iterator();

		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void shuffleDemo()//������м���
	{
		List<String> list = new ArrayList<String>();

		list.add("acvdf");
		list.add("df");
		list.add("cvdf");
		list.add("vf");
		list.add("efg");
		list.add("z");

		sop(list);
		Collections.shuffle(list);
		sop(list);

	}

	public static void binarySearch()//���ַ����ң�����Ҫ�߱��Ƚ���
	{
		List<String> list = new ArrayList<String>();

		list.add("acvdf");
		list.add("df");
		list.add("cvdf");
		list.add("vf");
		list.add("efg");
		list.add("z");
		
		Collections.sort(list,new LengthCompare());
		sop(list);

		int index = Collections.binarySearch(list,"vf");
		sop("index="+index);
	}

	public static void maxDemo()//�������ֵ
	{
		List<String> list = new ArrayList<String>();

		list.add("acvdf");
		list.add("df");
		list.add("cvdf");
		list.add("vf");
		list.add("efg");
		list.add("z");

		String max=Collections.max(list,new LengthCompare());

		sop("max=="+max);
	}
	public static void sortDemo()//����
	{
		List<String> list = new ArrayList<String>();

		list.add("acvdf");
		list.add("df");
		list.add("cvdf");
		list.add("vf");
		list.add("efg");
		list.add("z");

		//Collections.sort(list);
		Collections.sort(list,new LengthCompare());//һ�Ѷ�������

		sop(list);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

class LengthCompare implements Comparator<String>//�Ƚ��������ַ������ȱȽ�
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}