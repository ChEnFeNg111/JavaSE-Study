/**
�������ģʽ�����һ�������ڴ���ֻ��һ������
****����ʱһ���ö���ʽ,�����������ģʽ

���⣺
1��Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������ö���
2��Ϊ��������������Է��ʵ��������ֻ���ڱ����У��Զ���һ������
3��Ϊ�˸���������������Զ������ķ��ʿ��Զ����ṩһЩ���ʷ�ʽ

����ʽ
	������⣺
	1��������˽�л�
	2�������д���һ���������
	3���ṩһ���������Ի�ȡ�ö���

�ȳ�ʼ������
��Ϊ��

����ʽ
	Singles��һ���ڴ�͸������ʼ��
	class
	{
		private Singles(){}//1��������˽�л�
		private static final Singles s=new Singles();//2�������д���һ���������
		public static Singles getsingles()//3���ṩһ���������Ի�ȡ�ö���
		{
			return s;
		}

	}


�����Ƿ���������ʱ���ų�ʼ����Ҳ�����������ʱ���أ�
��Ϊ����ʽ
Singles����ڴ棬����û�д��ڣ�ֻ����getsingles����ʱ���Ž�������
class
{
	private Singles(){}//1��������˽�л�
	private static Singles s=null;//2�������д���һ���������
	public static Singles getsingles()//3���ṩһ���������Ի�ȡ�ö���
	{
		if(s==null)
			synchronized(Singles.class)//����ͬ���ģ���ֹ����������󣬶��̼߳���
			{
				if(s==null)
				{
					s=new Singles();
				}
			}	
		return s;
	}
}
*/
class Singles
{
	private int num;
	public void Setnum(int num)
	{
		this.num=num;
	}
	public int Getnum()
	{
		return num;
	}


	private Singles(){}//1��������˽�л�
	private static Singles s=new Singles();//2�������д���һ���������
	public static Singles getsingles()//3���ṩһ���������Ի�ȡ�ö���
	{
		return s;
	}

}

class Singlesdemo
{
	public static void main(String[] args)
	{	
		Singles s1=Singles.getsingles();//s1,s2,s ��ͬһ������;
		Singles s2=Singles.getsingles();
		s1.Setnum(20);
		System.out.println(s1.Getnum());
		System.out.println(s2.Getnum());
	}
}