/*
练习：
	将一个指定目录下的java文件的绝对路径，存到一个文本文件中
	建立一个java文件列表

思路：
1：对指定目录进行递归
2：在递归过程中获取后缀名为 .java 的文件的绝对路径
3：将获取的绝对路径存入到集合中
4：再将集合中的数据写入一个 java.txt 文本中

*/

import java.io.*;
import java.util.*;//集合

class Test
{
	public static void main(String[] args)throws IOException
	{
			File dir = new File("D:\\java");
			List<File> list = new ArrayList<File>();

			fileToList(dir,list);

			System.out.println(list.size());
			
			File file =new File("D:\\java\\java.txt");//指定创建文本

			WriteToFile(list,file.toString());
	}

	public static void fileToList(File dir,List<File> list)
	{
		File [] files = dir.listFiles();

		for(File f : files)
		{
			if(f.isDirectory())
				fileToList(f,list);//对指定目录进行递归
			
			else if(f.getName().endsWith(".java"))//在递归过程中获取后缀名为 .java 的文件的绝对路径
				list.add(f);//将获取的绝对路径存入到集合中
		}
	}

	public static void writeToFile(List<File> list,String javaFile)
	{
		BufferedWriter bfw = null;//提高效率
		try
		{   
			bfw = new BufferedWriter(new FileWriter(javaFile));
			for(File f : list)//遍历集合
			{
				String path = f.getAbsolutePath();//获取绝对路径
				bfw.write(path);//再将集合中的数据写入一个 java.txt 文本中
				bfw.newLine();//换行
				bfw.flush();
			}
			
		}
		catch (IOException e)
		{
			throw new RuntimeException("写入失败");
		}
		finally
		{
			try
			{
				bfw.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("写入关闭失败");
			}
		}
	}

}