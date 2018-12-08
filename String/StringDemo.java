/*
String�������������ַ�������
�������ṩ�˶���������ַ������в���

�����Ĳ���������
	һ����ȡ��
		1���ַ����а������ַ�����Ҳ�����ַ����ĳ���
			int length();��ȡ����
		2������λ�û�ȡλ���ϵ�ĳ���ַ�
			char charAt(int index);
		3: �����ַ���ȡ���ַ����ַ����е�λ��
			int indexOf(int ch):���ص���ch���ַ����е�һ�γ��ֵ�λ��
			int indexOf(int ch,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�ã�

			int indexOf(String str):���ص���str���ַ����е�һ�γ��ֵ�λ��
			int indexOf(String str,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ�ã�
			
			int lastIndexOf(int ch)�����ص���ch���ַ����������ǰ���ҵ��ĵ�һ�γ��ֵ�λ�ã��������

	�����жϣ�
		1���ַ����Ƿ����ĳһ���ַ���
			boolean contains(str);
			����֮����indexOf(str)��Ҳ��������str��һ�γ��ֵ�λ�ã�������ص��� -1 ����ʾ��str�����ڸ��ַ����У�
					����Ҳ�������ڶ�ָ���ж��Ƿ����
						if(str.indexOf("aa")!=-1)
					���Ҹ÷����������жϣ��ֿ��Ի�ȡ���ֵ�λ�ã�
		2���ַ����Ƿ������ݣ�
			boolean isEmpty():�����жϳ����Ƿ�Ϊ0��
		3���ַ����Ƿ�����ָ�����ݿ�ͷ
			boolean startsWith(str)
		3: �ַ����Ƿ�����ָ�����ݽ�β��
			boolean endsWith(str);

	����ת����
		1�����ַ�����ת��Ϊ�ַ���
			���캯����String(char[])
					  String(char[],offset,count):���ַ������е�һ����ת���ַ���

			��̬������
					   static String copyValueOf(char[])
					   static String copyValueOf(char[] data,int offset,int count)
					   static String valueOf(char[]);
***		2�����ַ���ת��Ϊ�ַ�����
			char[] toCharArray();

		3�����ֽ�����ת���ַ���
			String(byte[])
			String(byte[],offset,count):���ֽ������е�һ����ת���ַ���

		4�����ַ���ת���ֽ�����
			byte[] getBytes();
		5: ��������������ת���ַ���
			static String valueOf(int)
			static String valueOf(double)
			//String.valueOf(3);=="3";==3+"";

		���⣺�ַ������ֽ�������ת�������У��ǿ���ָ��������


	�ģ��滻��
		String repalce(oldchar,newchar);
	
	�壺�и
		String[] split(regex);regex:������ʽ

	�����Ӵ�:��ȡ�ַ������Ӵ�
		String substring(begin);
		String substring(begin,end);
		
	�ߣ�ת��//ȥ���ո�//�Ƚ�
		1�����ַ���ת�ɴ�д/Сд
			String toUpperCase();
			String toLowerCase();

		2�����ַ������˵Ķ���ո�ȥ��
			String trim();

		3���������ַ���������Ȼ˳��ıȽ�
			int  compareTo(string);//���Դ�Сд�Ƚϣ����ַ���ȫ���Сд

			s1.compareTo(s2)//����0��s1=s2��
							//����������s1>s2;
							//���ظ���s1<s2		
*/


public class StringDemo
{
	public static void main(String[] args)
	{
		sop("------------get--------------");
		methodGet();
		sop("------------IS---------------");
		methodIs();
		sop("-----------trans-------------");
		methodTrans();
		sop("-----------replace-----------");
		methodReplace();
		sop("-----------split-------------");
		methodSplit();
		sop("-----------sub---------------");
		methodSub();
		sop("-----------change------------");
		methodChange();
		sop("----------compare------------");
		methodCompare();
	}

	public static void methodCompare()
	{
		String s1="aaa";//�Ƚϵ���ASCII����ֵ
		String s2="abc";

		sop(s1.compareTo(s2));//����0��s1=s2������������s1>s2;���ظ���s1<s2		
	}
	public static void methodChange()
	{
		String s="	Hello Java	";

		sop(s.toUpperCase());//ȫת��Ϊ��д
		sop(s.toLowerCase());//ȫת��ΪСд
		sop(s.trim());//ȥ��ͷβ���˿ո�,����ȥ���м�Ŀո�
	}
	public static void methodSub()
	{
		String s="abcdef";

		sop(s.substring(3));//��ָ��λ�ÿ�ʼ����β��
		sop(s.substring(1,5));//����ͷ��������β�� s.substring(0,s.length());
		//sop(s.substring(9));//����Ǳ겻���ڣ�����ֽǱ�Խ���쳣
		
	}
	public static void methodSplit()
	{
		String s="cheng,feng,kobe";
		String[] a=s.split(",");
		for(int x=0;x<a.length;x++)
		{
			sop("a[x]=="+a[x]);
		}
	}

	public static void methodReplace()
	{
		String s="hello java";
		String s1=s.replace('a','n');
		String s2=s.replace("java","world");
		String s3=s.replace('p','b');//�����ڸ� �ַ������޷��滻��������ԭ����

		sop("s =="+s);
		sop("s1=="+s1);
		sop("s2=="+s2);
		sop("s3=="+s3);
	}
	public static void methodTrans()
	{
		char[] arr={'a','b','d','e','g'};
		String s=new String(arr,1,4);////���ַ������е�һ����ת���ַ���
		sop("s=="+s);

		String s1="savvfgkf";
		char[] a=s1.toCharArray();//���ַ���ת��Ϊ�ַ�����
		for(int x=0;x<a.length;x++)
		{
			sop("ch=="+a[x]);//��ӡ���
		}

		sop(String.valueOf(35408));	//��������������ת���ַ���
	}

	public static void methodGet()
	{
		String str="asdgfabckadff";

		sop(str.length());//
		sop(str.charAt(5));
		sop(str.indexOf("a"));
		sop(str.indexOf("a",9));
		sop(str.indexOf("abc"));
		sop(str.indexOf("abc",8));
		sop(str.lastIndexOf("b"));

	}

	public static void methodIs()
	{
		String str1="anvdkvndgdlfj";

		sop(str1.contains("vdkv"));
		sop(str1.isEmpty());
		sop(str1.startsWith("anvd"));
		sop(str1.endsWith("dlfj"));

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}