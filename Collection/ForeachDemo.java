/*
�߼�forѭ��

��ʽ:
	for(��������  ������ : �������ļ��ϣ�Collection��������)
	{
	
	}

�Լ��Ͻ��б���
	ֻ�ܻ�ȡ����Ԫ�أ������ܶԼ��Ͻ��в���

���������˱����������Խ���remove�����е�Ԫ�صĲ���
�������ListIterator,�������ڱ��������жԼ��Ͻ�����ɾ�Ĳ�Ķ���

��ͳfor�͸߼�for��ʲô����
	�߼�for��һ�������ԣ������б�������Ŀ��

�����ڱ�������ʱ���ô�ͳforѭ������Ϊ��ͳfor�нǱ�

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

		//������
		Iterator it = a.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//�߼�for���
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