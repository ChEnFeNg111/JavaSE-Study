/*
StringBuffer :是一个容器
特点：1:长度是可变化的
	  2：可以字节操作多个数据类型
	  3:最终会通过 toString() 方法变成字符串
	
一：存储：
	StringBuffer append():将指定数据作为参数添加到已有数据中；
	StringBuffer insert(index,数据)：可以将数据插入到指定index位置；

二：删除
	StringBuffer delete(start,end):删除缓冲区中的数据，包含start,不包含end;
	StringBuffer deleteCharAt(index):删除指定位置的字符

三；获取
	char charAt(int index)
	int indexOf(String str)
	int lastIndexOf(String str)
	int length()
	String substring(int start,int end)

四：修改：
	StringBuffer repalce(start,end,string)
	void setCharAt(int index,char ch)

五：反转
	StringBuffer reverse();

jdk1.5之后出现了StringBuilder//提高效率

	StringBuffer是线程同步的；   （多线程）
	StringBuilder是线程不同步的；（单线程）

java 升级的三个因素：
	1: 提高效率；
	2：简化书写；
	3：提高安全性：
*/

public class StringBufferDemo
{
	public static void main(String[] args)
	{
		sop("-----------------------");
		method_create();
		sop("-----------------------");
		method_delete();
		sop("-----------------------");
		method_get();
		sop("-----------------------");
		method_replace();
		sop("-----------------------");
		method_reverse();
		sop("-----------------------");
		method_getChars();
		
	}
//将缓冲区的指定数据存储到指定字符串中；
	public static void methodGetChars()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");

		char[] arr=new char[6];

		sb.getChars(3,7,arr,1);
		
		for(int x=0;x<arr.length;x++)
		{
				sop("arr["+x+"]=="+arr[x]+";");
		}
	}
//反转：
	public static void methodReverse()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");

		sb.reverse();
		sop(sb.toString());
	}
//修改：
	public static void methodReplace()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");
		
		sb.replace(3,7,"kkkk");
		sop(sb.toString());
		
		sb.setCharAt(5,'g');
		sop(sb.toString());
	}
//获取：
	public static void methodGet()
	{
		StringBuffer sb=new StringBuffer("abcdefghijk");

		sop(sb.length());

		sop(sb.charAt(3));

		sop(sb.indexOf("cde"));
		
		sop(sb.lastIndexOf("cde"));

		sop(sb.substring(2,6));
	}
//存储：
	public static void methodCreate()
	{
		StringBuffer sb=new StringBuffer();

		sb.append("true").append(34).append('v');
		sop(sb.toString());

		sb.insert(2,"a");
		sop(sb.toString());
	}

//删除
	public static void methodDelete()
	{
		StringBuffer sb=new StringBuffer("abcdefg");

		sb.delete(2,5);
		sop(sb.toString());
		
		sb.deleteCharAt(2);
		sop(sb.toString());
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}