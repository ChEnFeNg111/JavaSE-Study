/*
LinkedList:���з���
addFirst();
addLast();

getFirst();
getLast();
��ȡԪ�أ���Ԫ�ر�ɾ�������������û��Ԫ�أ������NoSuchElementException;

removeFirst();
removeLast();
��ȡԪ�أ���Ԫ�ر�ɾ�������������û��Ԫ�أ������NoSuchElementException;


JDK1.6֮����������������

offerFirst();
offerLast();

peekFirst();
peekLast();
��ȡԪ�أ�����ɾԪ�أ����������û��Ԫ�أ��᷵��Null;

pollFirst();
pollLast();
��ȡԪ�أ���Ԫ�ر�ɾ�������������û��Ԫ�أ��᷵��Null;
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