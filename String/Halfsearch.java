/*
折半查找
*/
class Halfsearch
{
	public static void main(String[] args)
	{
		int[] arr={2,5,8,9,18,36,55};
		int index=Halfsearch(arr,55);
		System.out.println("index="+index);
		int index1=Getindex(arr,66);
		System.out.println("index1="+index1);
		
	}
	/*第一种折半查找方法*/
	/*public static int Halfsearch(int[] arr,int key)//获取key第一次出现在数组中的位置，如果返回的是一，那么代表该key不存在该数组中；
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while(min<=max)
		{
			mid=(min+max)/2;
			if(arr[mid]>key)
				max=mid-1;	
			else if(arr[mid]<key)
				min=mid+1;	
			else
				return mid;	
		}	
		return -1;//不存在该元素，无法查找到该位置
	}*/

	/*第二种折半查找方法*/
	public static int Halfsearch(int[] arr,int key)//获取key第一次出现在数组中的位置，如果返回的是一，那么代表该key不存在该数组中；
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while(arr[mid]!=key)
		{
			mid=(min+max)/2;
			if(arr[mid]>key)
				max=mid-1;	
			else if(arr[mid]<key)
				min=mid+1;	
			if(max<min)
				return -1;//不存在该元素，无法查找到该位置
		}	
		return mid;
	}

	/*在一个有序的数组中，插入一个数，使插入后的数组也有序，如何查找出该元素的插入位置*/
	public static int Getindex(int[] arr,int key)//获取key第一次出现在数组中的位置，如果返回的是一，那么代表该key不存在该数组中；
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while(min<=max)
		{
			mid=(min+max)/2;
			if(arr[mid]>key)
				max=mid-1;	
			else if(arr[mid]<key)
				min=mid+1;	
			else
				return mid;	
		}	
		return min;
	}
	

}