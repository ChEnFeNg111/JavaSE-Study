/*
LinkedList:特有方法
addFirst();
addLast();

getFirst();
getLast();
获取元素，但元素被删除，如果集合中没有元素，会出现NoSuchElementException;

removeFirst();
removeLast();
获取元素，但元素被删除，如果集合中没有元素，会出现NoSuchElementException;


JDK1.6之后出现了替代方法：

offerFirst();
offerLast();

peekFirst();
peekLast();
获取元素，但不删元素，如果集合中没有元素，会返回Null;

pollFirst();
pollLast();
获取元素，但元素被删除，如果集合中没有元素，会返回Null;
*/
import java.util.*;
public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList L = new LinkedList();
		
		L.addFirst("a");//d c b a
		L.addFirst("b");
		L.addFirst("c");
		L.addFirst("d");

		sop("---------------");
		sop(L.getFirst());

		sop("---------------");
		while(!L.isEmpty()) 
		{
			sop(L.removeLast());
		}
		

		LinkedList L1 = new LinkedList();

		L1.offerLast("e");//e f g h
		L1.offerLast("f");
		L1.offerLast("g");
		L1.offerLast("h");

		sop("---------------");
		sop(L1.peekFirst());
		sop("---------------");
		while(!L1.isEmpty())
		{
			sop(L1.pollLast());
		}
			

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}