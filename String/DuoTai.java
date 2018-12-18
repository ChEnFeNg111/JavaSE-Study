/*
多态：事物存在的多种体现形态；
	例 人：男人，女人；
	动物：猫，狗
	猫 x =new 猫（）;
	动物 x=new 猫（）;

1: 多态的体现：父类的引用指向了自己子类的对象；
			   父类的引用可以接受自己的子类对象
2：多态的前提：必须是类与类之间有关系，继承或者实现；
				通常 存在覆盖；
3：多态的好处：多态的出现可以大大的提高程序的扩展性
4：多态的应用：
5：多态的弊端：提高了扩展性，但是只能引用访问父类中的成员
6：多态的出现代码中的特点：
	(1)在多态的非静态成员变量的特点：
		在编译时期：参阅引用类型变量所属的类中是否有调用的方法，如果有，编译通过，没有，如果没有则编译失败
		在运行时期：参阅对象所属的类中是否有调用的方法；
		总结：成员函数在多态调用时，编译看左边，运行看右边（继承有重写的功能）

	面试考：(2)在多态中，成员变量的特点，无论编译还是运行都看左边(引用型变量所属的类)；
			(3)在多态中，静态（static）成员函数的特点：无论编译还是运行都看左边(静态没有重写)
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
	public static void function(Animal a)//Animal a=new Cat();类型提升，向上转型
	{
		a.eat();
		if(a instanceof Cat)//instanceof 判断左边对象是否为其右边类的实例
		{
			Cat c=(Cat)a;//如果想要调用猫的特有方法：
						//强制转型，强制将父类的引用a（不能将父类对象转成子类类型），转成子类类型Cat，向下转型
			c.Catch();	//能转化的是父类引用指向了自己的子类对象时，应该可以被提升，也可以被轻质转换
						//多态自始至终都是子类的对象在做着变化；
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

