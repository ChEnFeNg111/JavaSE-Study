/*
Objict �������νṹ�ĸ��ࣨ���ࣩ��
�����ж���Ŀ϶��Ƕ����ж��󶼾߱��Ĺ���
*/
class Demo//extends Object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}

	public boolean equals(Object obj)//Object obj=new Demo();��̬
	{
		if(!(obj instanceof Demo))//�����߶��������ұ����ʵ��
			return false;

		Demo d=(Demo)obj;//ǿ��ת�ͣ�����ת��
		return this.num==d.num;
	}
}

class ObjectDemo
{
	public static void main(String[] args)
	{
		Demo d1=new Demo(4);
		Demo d2=new Demo(4);
		System.out.println(d1.equals(d2));//equals(Object oj)����Ķ���Ƚ�
	}
}