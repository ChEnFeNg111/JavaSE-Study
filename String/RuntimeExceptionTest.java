/*
RuntimeException:����ʱ�쳣������������ֹͣ
	����ں��������׳����쳣���������Բ�����������һ��ͨ��
	����ں����������˸��쳣�������߿��Բ��ý��д���try /throw��������һ��ͨ��

֮���Բ����ں���������������Ϊ����Ҫ�õ����ߴ���
�����쳣����ʱ��ϣ������ֹͣ����Ϊ������ʱ���������޷���������������ϣ��ֹͣ����󣬶Դ������������

�����쳣�����֣�
1: ����ʱ�������쳣��try/catch/throw��

2:����ʱ���������쳣������ʱ�쳣��RuntimeException�Լ������ࣩ
	�����ࣺIllegalArgumentException--�����ʱֵΪ��
			IllegalMonitorStateException--�����ǰ�̲߳��Ǵ˶����������������
			InterruptedException--����ڵ�ǰ�̵߳ȴ�֪֮ͨǰ�������ڵȴ�֪ͨʱ���κ��߳��ж��˵�ǰ�̣߳����׳����쳣ʱ����ǰ�̵߳��ж�״̬�����;
			
*/
class FushuException extends RuntimeException//����ʱ�쳣������������ֹͣ
{
	FushuException(String mes)
	{
		super(mes);
	}
}

class demo
{
	int div(int a,int b)//�ں��������׳����쳣���������Բ�����������һ��ͨ��
	{
		if(b<0)
			throw new FushuException("���ֳ���Ϊ������");//�ں��������׳����쳣
		if(b==0)
			throw new ArithmeticException("�������");//�ں��������׳����쳣
		return a/b;
	}
}

class RuntimeExceptionTest
{
	public static void main(String[] args)
	{
		demo d=new demo();
		int x=d.div(4,-3);//�����߿��Բ��ý��д���try /throw��������һ��ͨ��
		System.out.println("x=="+x);
		System.out.println("over!!");
	}
}
