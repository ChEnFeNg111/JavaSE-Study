/*
StringBuffer :��һ������
�ص㣺1:�����ǿɱ仯��
	  2�������ֽڲ��������������
	  3:���ջ�ͨ�� toString() ��������ַ���
	
һ���洢��
	StringBuffer append():��ָ��������Ϊ������ӵ����������У�
	StringBuffer insert(index,����)�����Խ����ݲ��뵽ָ��indexλ�ã�

����ɾ��
	StringBuffer delete(start,end):ɾ���������е����ݣ�����start,������end;
	StringBuffer deleteCharAt(index):ɾ��ָ��λ�õ��ַ�

������ȡ
	char charAt(int index)
	int indexOf(String str)
	int lastIndexOf(String str)
	int length()
	String substring(int start,int end)

�ģ��޸ģ�
	StringBuffer repalce(start,end,string)
	void setCharAt(int index,char ch)

�壺��ת
	StringBuffer reverse();

jdk1.5֮�������StringBuilder//���Ч��

	StringBuffer���߳�ͬ���ģ�   �����̣߳�
	StringBuilder���̲߳�ͬ���ģ������̣߳�

java �������������أ�
	1: ���Ч�ʣ�
	2������д��
	3����߰�ȫ�ԣ�
*/

public class StringBufferDemo
{
	public static void main(String[] args)
	{
		sop("-----------------------");
		method_create();
		sop("-----------------------");
		method_delete();
		sop("-----------------------");
		method_get();
		sop("-----------------------");
		method_replace();
		sop("-----------------------");
		method_reverse();
		sop("-----------------------");
		method_getChars();
		
	}
//����������ָ�����ݴ洢��ָ���ַ����У�
	public static void methodGetChars()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");

		char[] arr=new char[6];

		sb.getChars(3,7,arr,1);
		
		for(int x=0;x<arr.length;x++)
		{
				sop("arr["+x+"]=="+arr[x]+";");
		}
	}
//��ת��
	public static void methodReverse()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");

		sb.reverse();
		sop(sb.toString());
	}
//�޸ģ�
	public static void methodReplace()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");
		
		sb.replace(3,7,"kkkk");
		sop(sb.toString());
		
		sb.setCharAt(5,'g');
		sop(sb.toString());
	}
//��ȡ��
	public static void methodGet()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");

		sop(sb.length());

		sop(sb.charAt(3));

		sop(sb.indexOf("cde"));
		
		sop(sb.lastIndexOf("cde"));

		sop(sb.substring(2,6));
	}
//�洢��
	public static void methodCreate()
	{
		StringBuffer sb=new StringBuffer();

		sb.append("true").append(34).append('v');
		sop(sb.toString());

		sb.insert(2,"a");
		sop(sb.toString());
	}

//ɾ��
	public static void methodDelete()
	{
		StringBuffer sb=new StringBuffer("abcdefg");

		sb.delete(2,5);
		sop(sb.toString());
		
		sb.deleteCharAt(2);
		sop(sb.toString());
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}