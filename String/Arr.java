/*
用选择排序对数组进行排序；
*/
import java.util.*;
class  Arr 
{
	public static void main(String[] args)
	{
		int[] arr={5,1,6,4,2,8,9};
		//排序前
		Printarr(arr);
		//排序
		Bubblesort(arr);//冒泡排序
		Arrsort(arr);//选择排序
		//Arrays.sort(arr);//java中已经定义好的一种排序方式。开发中，对数组排序，要使用该句代码；
		//排序后
		Printarr(arr);

	}

	public static void Arrsort(int[] arr)//选择排序函数，性能较低运行时间长；
	{
		
		for(int x=0;x<arr.length-1;x++)//比较到最后一个数时没有课比较的数
		{
			for(int y=x+1;y<arr.length;y++)
			{
				
				if(arr[x]>arr[y])//多条语句时必须加上花括号“{ }”
				{
					int temp=arr[x];//定义一个中间变量，进行交换
					arr[x]=arr[y];
					arr[y]=temp;
				}	
			}
		}
	}

	
	public static void Bubblesort(int[] arr)//冒泡排序 ,相邻两元素进行比较，如果符合换位条件就进行交换
	{
		for(int x=0;x<arr.length-1;x++)//第一圈最（大/小）值出现在最后一位；
		{
			for(int y=0;y<arr.length-x-1;y++)//-x:是为了减少每一次比较的元素，
			{
				if (arr[y]<arr[y+1])//-1：避免角标越界
				{
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
	}

	public static void Printarr(int[] arr)//打印数组函数
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