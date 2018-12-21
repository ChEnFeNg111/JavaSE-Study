/*
0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F==ʮ������
0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15
���
��ʮ�����Ƶ�������һ�������У�
�ٸ���ÿһ�Ρ�&15����Ľ�������е�������ƥ��
*/
class ToHex
{
	public static void main(String[] args)
	{
		tohex(60);//��60��ʮ�����Ʊ�ʾ����
		System.out.println();
		tobin(60);//��60�İ˽��Ʊ�ʾ����
		System.out.println();
		tooct(60);//��60�Ķ����Ʊ�ʾ����
		
	}

	public static void tohex(int num)
	{
		
		char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[8];//ʮ�����ƵĶ����Ʊ�ʾ����32λ�ģ�������һ����ʱ����
		int pos=arr.length;//����һ�����������ָ�룬������ʾ���ݴ洢��λ��
		if(num==0)
		{
			System.out.println(0);
		}
		while(num!=0)
		{
			  int temp=num&15;//ÿ��ȡ�����λ���ܹ�32λ
			  arr[--pos]=ch[temp];//--pos����������һλ��ʼ�����ݣ������Ͳ���������ݵ��ŷŵ�����
			  num=num>>>4;
		}
		System.out.println("pos="+pos);
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

	public static void tobin(int num)
	{
		char[] ch ={'0','1'};//������
		char[] arr = new char[32];//int ʮ�����ƵĶ����Ʊ�ʾ����32λ�ģ�������һ����ʱ����
		int pos=arr.length;//����һ��ָ�룬������ʾ���ݴ洢��λ��
		if(num==0)
		{
			System.out.println(0);
			
		}
		while(num!=0)
		{
			  int temp=num&1;//ÿ��ȡ�����λ���ܹ�32λ
			  arr[--pos]=ch[temp];//ch[temp]���ã�--pos����������һλ��ʼ�����ݣ������Ͳ���������ݵ��ŷŵ�����
			  num=num>>>1;
		}
		System.out.println("pos="+pos);

		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

	public static void tooct(int num)
	{
		char[] ch ={'0','1','2','3','4','5','6','7'};//�˽���
		char[] arr = new char[32];//int ʮ�����ƵĶ����Ʊ�ʾ����32λ�ģ�������һ����ʱ����
		int pos=arr.length;//����һ��ָ�룬������ʾ���ݴ洢��λ��
		if(num==0)
		{
			System.out.println(0);
			
		}
		while(num!=0)
		{
			  int temp=num&7;//ÿ��ȡ�����λ���ܹ�32λ
			  arr[--pos]=ch[temp];//ch[temp]���ã�--pos����������һλ��ʼ�����ݣ������Ͳ���������ݵ��ŷŵ�����
			  num=num>>>3;
		}
		System.out.println("pos="+pos);

		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}


}