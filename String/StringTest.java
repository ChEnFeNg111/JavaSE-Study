/*
��ϰһ��
	ģ��һ��trim������ȥ���ַ������˵Ŀո�
	˼·��
		1�����ַ����ĵ�һ��λ�ÿ�ʼ�����ж��Ƿ�Ϊ�ո�����Ǽ������·��ʣ�һֱ���ʵ����ǿո��λ��Ϊֹ
		2;����ʼ�ͽ�Ϊ���жϵ����ǿո�ʱ����Ҫ��substring()��ȡ�ַ���

��ϰ����
	��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת
	˼·��
		1�����ַ�����ת��Ϊ�ַ�����
		2�����ַ�������з�ת��
		3������ת����ַ����鷴ת���ַ�����
		4������ת�Ŀ�ʼλ�úͽ���λ����Ϊ�������ݼ��ɣ�

��ϰ����
	��ȡһ���ַ������Ӵ�������һ���ַ����г��ֵĴ�����
	��abkkcdkkefkkskk��
	˼·��
		1������һ����������
		2����ȡ��һ��kk���ֵ�λ��//int indexOf(int ch,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�ã�
		3���ӵ�һ�γ��ֵ�λ�ú�ʣ����ַ����м�����ȡ"kk"���ֵ�λ�ã�//index=index+"kk".length();
		4: ÿ��ȡһ�ξͼ���һ�Σ�
		5������ȡ����ʱ��index=-1����������ɣ�

��ϰ�ģ�
		��ȡ�����ַ����������ͬ�ִ���
		��abcwerthsdjfhelloddfdfx��
		"djgfghellocdg"
		1�����Ƚ��̵��Ǹ��ַ������г������εݼ����ִ���ӡ��
		2����ÿ����ȡ���ִ�ȥ�������ж��Ƿ������
			����������ҵ���������
					�������ʧ�ܣ�����

*/
public class StringTest
{
	public  static void main(String[] args)
	{
		sop("---------mytrim---------");
		mytrim();
		sop("---------trans----------");
		trans();
		sop("-------getString--------");
		getString();
		sop("-------getMax-----------");
		String s1="abcwerthsdjfhelloddfdfx";	
		String s2="djgfghellocdg";
		sop("��ͬ������ַ���Ϊ��"+getMax(s1,s2));
		
	}

//��ϰ�ģ�
	public static String getMax(String s1,String s2)
	{
		
		String max,min;

		max=(s1.length()>s2.length())?s1:s2;
		min=(max==s1)?s2:s1;

		for(int x=0 ; x<min.length() ; x++)
		{
			for (int y=0,z=min.length()-x;z!=min.length()+1 ;y++,z++ )//y<-->z��ÿ��ȡ����
			{
				String temp = min.substring(y,z);
				//sop(temp);
				if(max.contains(temp))//�ַ����Ƿ����ĳһ���ַ��� boolean contains(str);
					return	temp;//if((s1.indexOf(temp))!=-1)
			}		
		}
		return "";
	}
//��ϰ����
	public static void getString()
	{
		int count=0;
		int index=0;
		String str="abkkcdkkefkksk";
		String key="kk";

		while ((index=str.indexOf(key,index))!=-1) //��ȡ��һ��kk���ֵ�λ��(ѭ��)��int indexOf(int ch,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ��
		{
			sop("index=="+index);

			index = index + key.length();

			count++;//����ȡ����ʱ��index=-1�����������
		}

		sop("count=="+count);
	}


//��ϰ����
	public static void trans()
	{
		String s="   ab cd   ";
		char[] arr=s.toCharArray();//���ַ�����ת��Ϊ�ַ�����

		reserve(arr,0,s.length());//���ַ�������з�ת������ת�Ŀ�ʼλ�úͽ���λ����Ϊ�������ݼ��ɣ�
		
		reserve(arr,3,5);//ֻ��ab��ת

		String s1=new String(arr);//����ת����ַ����鷴ת���ַ�����

		sop("("+s+")");
		sop("("+s1+")");	
	}

	public static void reserve(char[] arr,int x,int y)
	{
		for(int start=x,end=y-1;  start<end;  start++,end--)
		{
			swap(arr,start,end);
		}
		
	}

	public static void swap(char[] arr,int x,int y)//����ֵ
	{
		char temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

//��ϰһ��
	public static void mytrim()//�������˿ո�
	{
		String s="   a  b  c   ";
		int start=0;
		int end=s.length()-1;

		while (start<=end && s.charAt(start)==' ')//�����ַ���λ�û�ȡ��λ���ϵ� 'ĳ���ַ�' //char charAt(int index);
		{
			start++;
		}
		while (start<=end && s.charAt(end)==' ')
		{
			end--;
		}
		sop("("+s+")");
		sop("("+s.substring(start,end+1)+")");//�Ӵ�:��ȡ�ַ������Ӵ�//String substring(begin,end);
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
}