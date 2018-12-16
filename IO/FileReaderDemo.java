/*
文件拷贝
	复制的原理：
其实就是将C盘下的文件数据存储到D盘的一个文件中。

步骤：
1，在D盘创建一个文件。用于存储C盘文件中的数据。
2，定义读取流和C盘文件关联。
3，通过不断的读写完成数据存储。
4，关闭资源。
*/
import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args)
	{
		copy();
	}

	public static void copy()
	{
		FileReader fr = null;
		FileWriter fw = null;

		try
		{
			fw=new FileWriter("DateDemo_copy.txt");
			fr=new FileReader("DateDemo.java");//读取 DateDemo.java 文件
			
			char[] buf = new char[1024];//创建一个容器存取读到数据

			int len=0;

			while((len=fr.read(buf))!=-1)
			{
				fw.write(buf,0,len);//将数组里的数据写到 “DateDemo_copy.txt”文件中
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("读写失败");
		}
		finally
		{
			if(fr!=null)
				try
				{
					fr.close();
				}
				catch (IOException e)
				{
					System.out.println(e.toString());
				}
			if(fw!=null)
				try
				{
					fw.close();
				}
				catch (IOException e)
				{
					System.out.println(e.toString());
				}
		}
	}
}