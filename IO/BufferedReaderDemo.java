/*
字符读取流缓冲区

该缓冲区提供了一个 一次读一行的方法 readLine() ,方便于对文本数据的获取

当返回null时，表示读到文件末尾
*/
import java.io.*;

class BufferedReaderDemo
{
	public static void main(String[] args)throws IOException
	{
		//创建一个输入流对象
		FileReader fr = new FileReader("kobe.txt");
		
		//创建一个缓冲区，将需要被提高效率的 字符读取流对象 作为参数传递给缓冲区的构造函数即可
		BufferedReader br = new BufferedReader(fr);
		
		String line=null;
			
		while((line=br.readLine())!=null)//null作为结束标志如果已到达流末尾，则返回 null
		
		{
			System.out.println(line);//读取整个文本行，

			br.close();
		}
	}
}