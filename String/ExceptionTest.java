/*
�Զ����쳣����Ϊ��Ŀ�л�������е����⣬
			����Щ����û�б�Java����������װ����
			���Զ�����Щ���е�������԰���Java�Ķ������װ��˼��
			�����е����⣬�����Զ����װ

���ں����ڲ�����throw�׳��쳣������ô�ͱ���Ҫ��Ӧ�Ĵ�����
Ҫô���ڲ�try catch����
Ҫô�ں����������쳣���õ�����ȥ����

һ������£������ڳ����쳣����������Ҫ������

�Զ�����쳣��δ�����쳣��Ϣ�����Դ�ӡ�Ľ����ֻ���쳣�����ƣ�ȴû���쳣����Ϣ

��ζ����쳣��Ϣ������

	FushuException()				
	{
		super();//�̳и������Ϣ
	}

	��Ϊ�������Ѿ����쳣��Ϣ�Ĳ����������
	��������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ�����ͨ��super()���
	��ô�Ϳ���ֱ��ͨ��getMassage������ȡ�Զ�����쳣��Ϣ��

�Զ����쳣���������Զ�����̳�Exception

�̳�Exceptionԭ��
	�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳���
	���Ƕ��߱��׳��֣������������Throwable�����ϵ�ж����ص�

ֻ�������ϵ�е���Ͷ���ſ��Ա�throws��throw����

throws:ʹ���ں����ϣ�
throw: ʹ���ں�����

throws:��������쳣�࣬���Ը�������ö��Ÿ���
throw������������쳣����

*/

class FushuException extends Exception//�Զ����쳣,����̳�Exception��
{
	private int value;
	
	FushuException(String mes,int value)//��Ϊ�������Ѿ����쳣��Ϣ�Ĳ����������//��������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ�����ͨ��super()���//��ô�Ϳ���ֱ��ͨ��getMassage������ȡ�Զ�����쳣��Ϣ��
	{
		super(mes);
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
}

class demo
{
	int chu(int a,int b)throws FushuException//�����쳣
	{
		if(b<0)
			throw new FushuException("���������˸��� ��/����",b);//�ֶ�ͨ���ؼ��� throw �׳��쳣��Ϣ��
		return a/b;
	}
}
class ExceptionTest1
{
	public static void main(String[] args)
	{
		try
		{
			demo d=new demo();
			int x=d.chu(10,-5);
			System.out.println("x==="+x);
		}
		catch (FushuException e)
		{
			System.out.println(e.toString());
			System.out.println("\t\t����ĸ�����"+e.getValue());
		}

		System.out.println("over!!!");
	}
}