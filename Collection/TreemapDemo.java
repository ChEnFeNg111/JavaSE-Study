/*
��ϰ��
"sdfgzxcvasdfxcvdf"��ȡ���ַ����е���ĸ���ֵĴ�����

ϣ����ӡ�����a(1)c(2).....

ͨ��������֣�ÿһ����ĸ���ж�Ӧ�Ĵ�����
˵����ĸ�ʹ���֮�䶼��ӳ���ϵ��

ע���ˣ���������ӳ���ϵʱ������ѡ��map���ϡ�
��Ϊmap�����д�ž���ӳ���ϵ��


ʲôʹ��map�����أ�
������֮�������ӳ���ϵʱ����Ҫ����map���ϡ�

˼·��
1�����ַ���ת�����ַ����顣��ΪҪ��ÿһ����ĸ���в�����

2������һ��map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��treemap���ϡ�

3�������ַ����顣
	��ÿһ����ĸ��Ϊ��ȥ��map���ϡ�
	�������null��������ĸ��1���뵽map�����С�
	������ز���null��˵������ĸ��map�����Ѿ����ڲ��ж�Ӧ������
	��ô�ͻ�ȡ�ô�����������������Ȼ�󽫸���ĸ��������Ĵ������뵽map�����С����ǵ���ԭ�������Ӧ��ֵ��

4����map�����е����ݱ��ָ�����ַ�����ʽ���ء�



*/

import java.util.*;

class MapTest3
{
	public static void main(String[] args)
	{
		String s = charCount("sa$%#^&dfbfbfd+_--dvbcjhbdfjfhdsgb");
		System.out.println(s);
	}

	public static String charCount(String str)
	{
		char[] ch = str.toCharArray();//���ַ���ת��Ϊ�ַ�����

		TreeMap<Character,Integer> t = new TreeMap<Character,Integer>();//����TreeMap����

		for(int x=0;x<ch.length;x++)//�����ַ�����
		{
			if(!(ch[x]>='a' && ch[x]<='z' || ch[x]>='A' && ch[x]<='Z'))
				continue;//�����˴�ѭ���������´�ѭ��

			Integer value = t.get(ch[x]);//��ȡ���ַ���map�����е�ֵ
			
			if(value==null)
			{
				t.put(ch[x],1);
			}	
			else
			{
				value=value+1;
				t.put(ch[x],value);//��ӳ���ϵ����map������
			}		
		}

		StringBuilder s = new StringBuilder();//����һ���������������洢����

		Set<Map.Entry<Character,Integer>> entrySet = t.entrySet();//�� entrySet ��ʽ��ȡ

		Iterator<Map.Entry<Character,Integer>> it = entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<Character,Integer> m = it.next();
			Character chs = m.getKey();
			Integer value = m.getValue();
			
			s.append(chs+"("+value+")");//����ȡ�������ݴ��뻺����
		}

		return s.toString();//����һ���ַ���s
	}

}