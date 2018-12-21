/*
0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F==十六进制
0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15
查表法
把十六进制的数存入一个数组中，
再根据每一次“&15”后的结果跟表中的数据相匹配
*/
class ToHex
{
	public static void main(String[] args)
	{
		tohex(60);//将60的十六进制表示出来
		System.out.println();
		tobin(60);//将60的八进制表示出来
		System.out.println();
		tooct(60);//将60的二进制表示出来
		
	}

	public static void tohex(int num)
	{
		
		char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[8];//十六进制的二进制表示法是32位的，定义有一个临时容器
		int pos=arr.length;//定义一个操作数组的指针，用来表示数据存储的位置
		if(num==0)
		{
			System.out.println(0);
		}
		while(num!=0)
		{
			  int temp=num&15;//每次取最后四位，总共32位
			  arr[--pos]=ch[temp];//--pos从数组的最后一位开始存数据，这样就不会存在数据倒着放的现象
			  num=num>>>4;
		}
		System.out.println("pos="+pos);
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

	public static void tobin(int num)
	{
		char[] ch ={'0','1'};//二进制
		char[] arr = new char[32];//int 十六进制的二进制表示法是32位的，定义有一个临时容器
		int pos=arr.length;//定义一个指针，用来表示数据存储的位置
		if(num==0)
		{
			System.out.println(0);
			
		}
		while(num!=0)
		{
			  int temp=num&1;//每次取最后四位，总共32位
			  arr[--pos]=ch[temp];//ch[temp]查表得，--pos从数组的最后一位开始存数据，这样就不会存在数据倒着放的现象
			  num=num>>>1;
		}
		System.out.println("pos="+pos);

		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

	public static void tooct(int num)
	{
		char[] ch ={'0','1','2','3','4','5','6','7'};//八进制
		char[] arr = new char[32];//int 十六进制的二进制表示法是32位的，定义有一个临时容器
		int pos=arr.length;//定义一个指针，用来表示数据存储的位置
		if(num==0)
		{
			System.out.println(0);
			
		}
		while(num!=0)
		{
			  int temp=num&7;//每次取最后四位，总共32位
			  arr[--pos]=ch[temp];//ch[temp]查表得，--pos从数组的最后一位开始存数据，这样就不会存在数据倒着放的现象
			  num=num>>>3;
		}
		System.out.println("pos="+pos);

		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}


}