/*
打印杨辉三角
*/
class Yanghui
{
	public static void main(String[] args)
		{
			int i,j;
			int a[][]=new int [10][10];//定义一个二位数组
			for(i=0;i<a.length;i++)
			{
				a[i]=new int [i+1];//动态配置每一列的空间大小，每一列的空间与行号相同
			}
			for(i=0;i<a.length;i++)
			{
				a[i][0]=1;//给每一行的头和尾赋值为1
				a[i][i]=1;
				for(j=1;j<i;j++)
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];//杨辉三角规律
				}
			}
			
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"\t");//打印杨辉三角
				}
				System.out.println();
			}
		}

}