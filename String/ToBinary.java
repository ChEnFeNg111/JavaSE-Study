/*
十进制转十六进制
*/
class	ToBinary
{
	public static void main(String[] args)
	{
		tobinary(60);
	}

	public static void tobinary(int num)
	{
		StringBuffer a=new StringBuffer();
		for(int x=0;x<8;x++)
		{
			int temp=num&15;//取最后四位
			if(temp>9)
				//System.out.println((char)(temp-10+'A'));
				a.append((char)(temp-10+'A'));
			else
				//System.out.println(temp);
				a.append(temp);

			num=num>>>4;//往右移四位
		}
		System.out.println(a.reverse());
	}
}