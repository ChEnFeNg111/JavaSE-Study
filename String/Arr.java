/*
��ѡ������������������
*/
import java.util.*;
class  Arr 
{
	public static void main(String[] args)
	{
		int[] arr={5,1,6,4,2,8,9};
		//����ǰ
		Printarr(arr);
		//����
		Bubblesort(arr);//ð������
		Arrsort(arr);//ѡ������
		//Arrays.sort(arr);//java���Ѿ�����õ�һ������ʽ�������У�����������Ҫʹ�øþ���룻
		//�����
		Printarr(arr);

	}

	public static void Arrsort(int[] arr)//ѡ�������������ܽϵ�����ʱ�䳤��
	{
		
		for(int x=0;x<arr.length-1;x++)//�Ƚϵ����һ����ʱû�пαȽϵ���
		{
			for(int y=x+1;y<arr.length;y++)
			{
				
				if(arr[x]>arr[y])//�������ʱ������ϻ����š�{ }��
				{
					int temp=arr[x];//����һ���м���������н���
					arr[x]=arr[y];
					arr[y]=temp;
				}	
			}
		}
	}

	
	public static void Bubblesort(int[] arr)//ð������ ,������Ԫ�ؽ��бȽϣ�������ϻ�λ�����ͽ��н���
	{
		for(int x=0;x<arr.length-1;x++)//��һȦ���/С��ֵ���������һλ��
		{
			for(int y=0;y<arr.length-x-1;y++)//-x:��Ϊ�˼���ÿһ�αȽϵ�Ԫ�أ�
			{
				if (arr[y]<arr[y+1])//-1������Ǳ�Խ��
				{
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
	}

	public static void Printarr(int[] arr)//��ӡ���麯��
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
}