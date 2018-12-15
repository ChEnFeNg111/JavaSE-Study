 /*
字符流和字节流：

字节流两个基类：
	InputStream   OutputStream


字符流两个基类：
	Reader Writer

先学习一下字符流的特点。

既然IO流是用于操作数据的，
那么数据的最常见体现形式是：文件。

那么先以操作文件为主来演示。

需求:在硬盘上，创建一个文件并写入一些文字数据。

找到一个专门用于操作文件的Writer子类对象。FileWriter。  后缀名是父类名。 前缀名是该流对象的功能。

IOException 异常处理方式：
		


*/
import java.io.*;
class  FileWriterDemo
{
	public static void main(String[] args) 
	{
		//创建一个FileWriter对象。该对象一被初始化就必须要明确被操作的文件。
		//而且该文件会被创建到指定目录下。如果该目录下已有同名文件，将被覆盖。
		//其实该步就是在明确数据要存放的目的地。
		//FileWriter fw = new FileWriter("demo.txt");

		//调用write方法，将字符串写入到流中。
		//fw.write("abcde");

		//刷新流对象中的缓冲中的数据。
		//将数据刷到目的地中。
		//fw.flush();


		//关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据。
		//将数据刷到目的地中。
		//和flush区别：flush刷新后，流可以继续使用，close刷新后，会将流关闭。
		//fw.close();

		//IOException 异常处理
		
		FileWriter fw = null;//在外面定义变量
		try
		{
			//传递一个 true 参数，代表不覆盖已有的文件，并在已有的文件的末尾处进行数据续写
			fw = new FileWriter("demo.txt",true);//初始化
			fw.write("\n kobe");//续写
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		finally 
		{
			try
			{
				if(fw!=null)//必须得判断是否为空
					fw.close();
			}
			catch (IOException e)
			{
				System.out.println(e.toString());
			}
			
		}
	}
}
