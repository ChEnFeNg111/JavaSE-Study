/*
��̬�����
��ʽ��
static
{
		��̬������е�ִ�����
}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ�Σ���������������ִ��
	  ���ڸ�����г�ʼ��
*/

/*ִ�н����
a
c 9
d
hello world!
*/

class Staticcode
{
	int num=9;
	Staticcode()//û�д����ö���Ͳ����ø÷����������b
	{
		System.out.println("b");
	}
	static//��̬�����,������г�ʼ��
	{
		System.out.println("a");
	}
	//�������ʼ��
	{
		System.out.println("c "+this.num);
	}

	Staticcode(int x)
	{
		System.out.println("d");
	}


}
class Staticcodedemo
{
	public static void main(String[] args)
	{
		new Staticcode(5);
		System.out.println("hello world!");
	}
}