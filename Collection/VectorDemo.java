/*
Vector ���е�ȡ����ʽ ö�ٹ���
ö�ٺ͵�����һ����

��Ϊö�ٵ������Լ����������ƶ����������Բ���ö�٣���Iterator������

*/
import java.util.*;

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v = new Vector();

		v.add("a01");
		v.add("b02");
		v.add("c03");

		Enumeration en= v.elements();//ö��
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}