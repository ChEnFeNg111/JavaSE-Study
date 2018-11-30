/*
删除带内容的目录
*/
import java.io.*;

class DeleteDemo
{
	public static void main(String[] args)
	{
		File dir = new File("D:\\java\\IO\\hahah");
		Delete(dir);
	}

	public static void Delete(File dir)
	{
		File[] Files = dir.listFiles();//列出指定目录下的文件存入数组中

		for(int x=0; x<Files.length; x++)//遍历数组
		{
			if(Files[x].isDirectory())//判断是否为目录
				Delete(Files[x]);//递归，进入目录下的文件
			else 
				System.out.println(Files[x].toString()+"===="+Files[x].delete());
		}
		System.out.println(dir.toString()+"---------"+dir.delete());
	}
}