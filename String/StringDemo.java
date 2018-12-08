/*
String类适用于描述字符串事物
所以它提供了多个方法对字符串进行操作

常见的操作？？？
	一：获取：
		1：字符串中包含的字符数，也就是字符串的长度
			int length();获取长度
		2：根据位置获取位置上的某个字符
			char charAt(int index);
		3: 根据字符获取该字符在字符串中的位置
			int indexOf(int ch):返回的是ch在字符串中第一次出现的位置
			int indexOf(int ch,int fromIndex):从fromIndex指定位置开始，获取ch在字符串中出现的位置；

			int indexOf(String str):返回的是str在字符串中第一次出现的位置
			int indexOf(String str,int fromIndex):从fromIndex指定位置开始，获取str在字符串中出现的位置；
			
			int lastIndexOf(int ch)；返回的是ch从字符串的最后往前查找到的第一次出现的位置；反向查找

	二：判断：
		1：字符串是否包含某一个字符串
			boolean contains(str);
			特殊之处：indexOf(str)：也可以索引str第一次出现的位置，如果返回的是 -1 ，表示该str不存在该字符串中；
					所以也可以用于对指定判断是否包含
						if(str.indexOf("aa")!=-1)
					而且该方法即可以判断，又可以获取出现的位置；
		2：字符串是否有内容：
			boolean isEmpty():就是判断长度是否为0；
		3：字符串是否是以指定内容开头
			boolean startsWith(str)
		3: 字符串是否是以指定内容结尾的
			boolean endsWith(str);

	三：转换：
		1：将字符数组转化为字符串
			构造函数：String(char[])
					  String(char[],offset,count):将字符数组中的一部分转成字符串

			静态方法：
					   static String copyValueOf(char[])
					   static String copyValueOf(char[] data,int offset,int count)
					   static String valueOf(char[]);
***		2：将字符串转化为字符数组
			char[] toCharArray();

		3：将字节数组转成字符串
			String(byte[])
			String(byte[],offset,count):将字节数组中的一部分转成字符串

		4：将字符串转成字节数组
			byte[] getBytes();
		5: 将基本数据类型转成字符串
			static String valueOf(int)
			static String valueOf(double)
			//String.valueOf(3);=="3";==3+"";

		特殊：字符串和字节数组在转化过程中，是可以指定编码表的


	四：替换：
		String repalce(oldchar,newchar);
	
	五：切割：
		String[] split(regex);regex:正则表达式

	六：子串:获取字符串的子串
		String substring(begin);
		String substring(begin,end);
		
	七：转换//去除空格//比较
		1：将字符串转成大写/小写
			String toUpperCase();
			String toLowerCase();

		2：将字符串两端的多个空格去除
			String trim();

		3：对两个字符串进行自然顺序的比较
			int  compareTo(string);//忽略大小写比较：把字符串全变成小写

			s1.compareTo(s2)//返回0：s1=s2；
							//返回正数：s1>s2;
							//返回负数s1<s2		
*/


public class StringDemo
{
	public static void main(String[] args)
	{
		sop("------------get--------------");
		methodGet();
		sop("------------IS---------------");
		methodIs();
		sop("-----------trans-------------");
		methodTrans();
		sop("-----------replace-----------");
		methodReplace();
		sop("-----------split-------------");
		methodSplit();
		sop("-----------sub---------------");
		methodSub();
		sop("-----------change------------");
		methodChange();
		sop("----------compare------------");
		methodCompare();
	}

	public static void methodCompare()
	{
		String s1="aaa";//比较的是ASCII码表的值
		String s2="abc";

		sop(s1.compareTo(s2));//返回0：s1=s2；返回正数：s1>s2;返回负数s1<s2		
	}
	public static void methodChange()
	{
		String s="	Hello Java	";

		sop(s.toUpperCase());//全转化为大写
		sop(s.toLowerCase());//全转换为小写
		sop(s.trim());//去除头尾两端空格,但不去除中间的空格
	}
	public static void methodSub()
	{
		String s="abcdef";

		sop(s.substring(3));//从指定位置开始到结尾，
		sop(s.substring(1,5));//包含头，不包含尾， s.substring(0,s.length());
		//sop(s.substring(9));//如果角标不存在，会出现角标越界异常
		
	}
	public static void methodSplit()
	{
		String s="cheng,feng,kobe";
		String[] a=s.split(",");
		for(int x=0;x<a.length;x++)
		{
			sop("a[x]=="+a[x]);
		}
	}

	public static void methodReplace()
	{
		String s="hello java";
		String s1=s.replace('a','n');
		String s2=s.replace("java","world");
		String s3=s.replace('p','b');//不存在该 字符，则无法替换，将返回原串；

		sop("s =="+s);
		sop("s1=="+s1);
		sop("s2=="+s2);
		sop("s3=="+s3);
	}
	public static void methodTrans()
	{
		char[] arr={'a','b','d','e','g'};
		String s=new String(arr,1,4);////将字符数组中的一部分转成字符串
		sop("s=="+s);

		String s1="savvfgkf";
		char[] a=s1.toCharArray();//将字符串转化为字符数组
		for(int x=0;x<a.length;x++)
		{
			sop("ch=="+a[x]);//打印输出
		}

		sop(String.valueOf(35408));	//将基本数据类型转成字符串
	}

	public static void methodGet()
	{
		String str="asdgfabckadff";

		sop(str.length());//
		sop(str.charAt(5));
		sop(str.indexOf("a"));
		sop(str.indexOf("a",9));
		sop(str.indexOf("abc"));
		sop(str.indexOf("abc",8));
		sop(str.lastIndexOf("b"));

	}

	public static void methodIs()
	{
		String str1="anvdkvndgdlfj";

		sop(str1.contains("vdkv"));
		sop(str1.isEmpty());
		sop(str1.startsWith("anvd"));
		sop(str1.endsWith("dlfj"));

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}