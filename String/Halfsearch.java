/*
�۰����
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
	/*��һ���۰���ҷ���*/
	/*public static int Halfsearch(int[] arr,int key)//��ȡkey��һ�γ����������е�λ�ã�������ص���һ����ô�����key�����ڸ������У�
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
		return -1;//�����ڸ�Ԫ�أ��޷����ҵ���λ��
	}*/

	/*�ڶ����۰���ҷ���*/
	public static int Halfsearch(int[] arr,int key)//��ȡkey��һ�γ����������е�λ�ã�������ص���һ����ô�����key�����ڸ������У�
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
				return -1;//�����ڸ�Ԫ�أ��޷����ҵ���λ��
		}	
		return mid;
	}

	/*��һ������������У�����һ������ʹ����������Ҳ������β��ҳ���Ԫ�صĲ���λ��*/
	public static int Getindex(int[] arr,int key)//��ȡkey��һ�γ����������е�λ�ã�������ص���һ����ô�����key�����ڸ������У�
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