/*
练习一：
	模拟一个trim方法，去除字符串两端的空格
	思路：
		1：从字符串的第一个位置开始进行判断是否为空格，如果是继续往下访问，一直访问到不是空格的位置为止
		2;当开始和解为都判断到不是空格时，就要用substring()获取字符串

练习二：
	将一个字符串进行反转；将字符串中指定部分进行反转
	思路：
		1：将字符串先转换为字符数组
		2：将字符数组进行反转；
		3：将反转后的字符数组反转回字符串；
		4：将反转的开始位置和结束位置作为参数传递即可；

练习三：
	获取一个字符串（子串）在另一个字符串中出现的次数；
	”abkkcdkkefkkskk“
	思路：
		1：定义一个计数器；
		2：获取第一此kk出现的位置//int indexOf(int ch,int fromIndex):从fromIndex指定位置开始，获取ch在字符串中出现的位置；
		3：从第一次出现的位置后剩余的字符串中继续获取"kk"出现的位置；//index=index+"kk".length();
		4: 每获取一次就计数一次；
		5：当获取不到时（index=-1），计数完成；

练习四：
		获取两个字符串中最大相同字串，
		”abcwerthsdjfhelloddfdfx“
		"djgfghellocdg"
		1：首先将短的那个字符串进行长度依次递减的字串打印；
		2：将每个获取的字串去长串中判断是否包含；
			如果包含则找到输出结果；
					否则查找失败！！！

*/
public class StringTest
{
	public  static void main(String[] args)
	{
		sop("---------mytrim---------");
		mytrim();
		sop("---------trans----------");
		trans();
		sop("-------getString--------");
		getString();
		sop("-------getMax-----------");
		String s1="abcwerthsdjfhelloddfdfx";	
		String s2="djgfghellocdg";
		sop("相同的最大字符串为："+getMax(s1,s2));
		
	}

//练习四：
	public static String getMax(String s1,String s2)
	{
		
		String max,min;

		max=(s1.length()>s2.length())?s1:s2;
		min=(max==s1)?s2:s1;

		for(int x=0 ; x<min.length() ; x++)
		{
			for (int y=0,z=min.length()-x;z!=min.length()+1 ;y++,z++ )//y<-->z是每次取长度
			{
				String temp = min.substring(y,z);
				//sop(temp);
				if(max.contains(temp))//字符串是否包含某一个字符串 boolean contains(str);
					return	temp;//if((s1.indexOf(temp))!=-1)
			}		
		}
		return "";
	}
//练习三：
	public static void getString()
	{
		int count=0;
		int index=0;
		String str="abkkcdkkefkksk";
		String key="kk";

		while ((index=str.indexOf(key,index))!=-1) //获取第一此kk出现的位置(循环)，int indexOf(int ch,int fromIndex):从fromIndex指定位置开始，获取ch在字符串中出现的位置
		{
			sop("index=="+index);

			index = index + key.length();

			count++;//当获取不到时（index=-1），计数完成
		}

		sop("count=="+count);
	}


//练习二：
	public static void trans()
	{
		String s="   ab cd   ";
		char[] arr=s.toCharArray();//将字符串先转换为字符数组

		reserve(arr,0,s.length());//将字符数组进行反转；将反转的开始位置和结束位置作为参数传递即可；
		
		reserve(arr,3,5);//只将ab反转

		String s1=new String(arr);//将反转后的字符数组反转回字符串；

		sop("("+s+")");
		sop("("+s1+")");	
	}

	public static void reserve(char[] arr,int x,int y)
	{
		for(int start=x,end=y-1;  start<end;  start++,end--)
		{
			swap(arr,start,end);
		}
		
	}

	public static void swap(char[] arr,int x,int y)//交换值
	{
		char temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

//练习一：
	public static void mytrim()//消除两端空格；
	{
		String s="   a  b  c   ";
		int start=0;
		int end=s.length()-1;

		while (start<=end && s.charAt(start)==' ')//根据字符串位置获取该位置上的 '某个字符' //char charAt(int index);
		{
			start++;
		}
		while (start<=end && s.charAt(end)==' ')
		{
			end--;
		}
		sop("("+s+")");
		sop("("+s.substring(start,end+1)+")");//子串:获取字符串的子串//String substring(begin,end);
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
}