/*
��̬��������ڵĶ���������̬��
	�� �ˣ����ˣ�Ů�ˣ�
	���è����
	è x =new è����;
	���� x=new è����;

1: ��̬�����֣����������ָ�����Լ�����Ķ���
			   ��������ÿ��Խ����Լ����������
2����̬��ǰ�᣺������������֮���й�ϵ���̳л���ʵ�֣�
				ͨ�� ���ڸ��ǣ�
3����̬�ĺô�����̬�ĳ��ֿ��Դ�����߳������չ��
4����̬��Ӧ�ã�
5����̬�ı׶ˣ��������չ�ԣ�����ֻ�����÷��ʸ����еĳ�Ա
6����̬�ĳ��ִ����е��ص㣺
	(1)�ڶ�̬�ķǾ�̬��Ա�������ص㣺
		�ڱ���ʱ�ڣ������������ͱ��������������Ƿ��е��õķ���������У�����ͨ����û�У����û�������ʧ��
		������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
		�ܽ᣺��Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߣ��̳�����д�Ĺ��ܣ�

	���Կ���(2)�ڶ�̬�У���Ա�������ص㣬���۱��뻹�����ж������(�����ͱ�����������)��
			(3)�ڶ�̬�У���̬��static����Ա�������ص㣺���۱��뻹�����ж������(��̬û����д)
*/

abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("Fish");
	}
	public void Catch()
	{
		System.out.println("catch");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Bone");
	}
	public void home()
	{
		System.out.println("Home");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("meat");
	}
	public void sleep()
	{
		System.out.println("Sleep");
	}
}

class DuoTai
{
	public static void main(String[] args)
	{
		function(new Cat());
		function(new Dog());
		function(new Pig());
	}
	public static void function(Animal a)//Animal a=new Cat();��������������ת��
	{
		a.eat();
		if(a instanceof Cat)//instanceof �ж���߶����Ƿ�Ϊ���ұ����ʵ��
		{
			Cat c=(Cat)a;//�����Ҫ����è�����з�����
						//ǿ��ת�ͣ�ǿ�ƽ����������a�����ܽ��������ת���������ͣ���ת����������Cat������ת��
			c.Catch();	//��ת�����Ǹ�������ָ�����Լ����������ʱ��Ӧ�ÿ��Ա�������Ҳ���Ա�����ת��
						//��̬��ʼ���ն�������Ķ��������ű仯��
		}
		else if(a instanceof Dog)
		{
			Dog d=(Dog)a;
			d.home();
		}
		else if(a instanceof Pig)
		{
			Pig p=(Pig)a;
			p.sleep();
		}
	}
}

