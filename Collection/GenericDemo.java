/*


���ͣ�JDK1.5�汾֮����ֵ������ԣ����ڽ����ȫ���⣬��һ����ȫ����
		<��������>
�ô���
	1��������ʱ�ڳ�������  ClassCastException ת�Ƶ�����ʱ��
		�����ڳ���Ա������⣬����������������٣�ʹ�������ȫ

	2��������ǿ��ת�����鷳

���͸�ʽ��ͨ��< >������Ҫ������������������
��ʹ�ü���ʱ����������Ҫ�洢������������Ϊ�������ݵ�<>�м���
		  
��ʹ��Java�ṩ�Ķ���ʱ��ʲôʱ��д���ͣ�����
	ͨ���ڼ��Ͽ���кܳ�����
	ֻҪ����< >��Ҫ���巺��

<?> ͨ�����Ҳ�������Ϊռλ����
���͵��޶���
<? extends E>: ���Խ���E���ͻ���E�������͡����ޡ�
<? super E>: ���Խ���E���ͻ���E�ĸ����͡�����

//�����ࡣ
/*
ʲôʱ���巺���ࣿ
������Ҫ�����������������Ͳ�ȷ����ʱ��
���ڶ���Object�������չ��
���ڶ��巺���������չ��

//�����ඨ��ķ��ͣ�������������Ч�����������ʹ�ã�
//��ô������Ķ�����ȷҪ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶��ˡ�
//Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
//��ô���Խ����Ͷ����ڷ����ϡ�

����֮����
��̬���������Է������϶���ķ��͡�
�����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�


*/
import java.util.*;

class GenericDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> a = new TreeSet<String>(new myGeneric());
		
		a.add("abc");
		a.add("fdcd");
		a.add("eg");
		a.add("g");

		Iterator<String> it = a.iterator();

		while(it.hasNext())
		{
			String s=it.next();
			//String s=(String)it.next();������ǿ��ת�����鷳
			System.out.println(s);
		}
	}
}

class myGeneric implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		int num= new Integer(o1.length()).compareTo(new Integer(o2.length()));

		if(num==0)
			return o1.compareTo(o2);
		return num;
	}
}