/*
�����ڲ��ࣺ
	1:�����ڲ�����ʵ�����ڲ���ļ�д��ʽ
	2�����������ڲ����ǰ�᣺
		�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڣ�
	3�������ڲ���ĸ�ʽ��
		new ����/�ӿڣ���
		{
			������������ݣ�
		}
	4�������ڲ������һ�������Ӷ��󣬿������Ϊ�����ݵĶ���
	5�������ڲ����ж���ķ�����ò�����������
*/

interface Inter
{
	void method();
}

class Test
{
	//������룬ͨ�������ڲ��ࣻ
	/*static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("method run");
		}
	}*/
	static Inter function() 
	{
		//return new Inner();
		return new Inter()//�����ڲ���
		{
			public void method()
			{
				System.out.println("method run");
			}
		};
	}
}
 
class InnerClass
{
	public static void main(String[] args)
	{
		//Test.function():Test������һ����̬��function����;������ֱ�ӵ��÷�����
		//.method():function������������Ľ����һ�����󣬶�����һ��Inter���͵Ķ���
		//ӦΪֻ����Inter���͵Ķ��󣬲ſ��Ե���method������
		Test.function().method();
		/*
			Inter in =Test.function();
			in.method();
		*/
	}
}