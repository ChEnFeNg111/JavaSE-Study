/*
��ӡ�������
*/
class Yanghui
{
	public static void main(String[] args)
		{
			int i,j;
			int a[][]=new int [10][10];//����һ����λ����
			for(i=0;i<a.length;i++)
			{
				a[i]=new int [i+1];//��̬����ÿһ�еĿռ��С��ÿһ�еĿռ����к���ͬ
			}
			for(i=0;i<a.length;i++)
			{
				a[i][0]=1;//��ÿһ�е�ͷ��β��ֵΪ1
				a[i][i]=1;
				for(j=1;j<i;j++)
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];//������ǹ���
				}
			}
			
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"\t");//��ӡ�������
				}
				System.out.println();
			}
		}

}