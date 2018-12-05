/*
缓冲区的出现就是为了提高流的操作效率

所以在创建缓冲区之前，必须得先有流对象

该缓冲区中提供了一个跨平台的 换行符
                             newLine（）
*/
import java.io.*;

class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		//创建一个字符写入流对象
		FileWriter fw = new FileWriter("kobe.txt");

		//为了提高字符写入流效率，加入了缓冲技术
		//只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可
		BufferedWriter bw = new BufferedWriter(fw);

		for(int x=0;x<5;x++)
		{
			bw.write("abc"+x);//写入文件中
			bw.newLine();//写入一个换行符；
			bw.flush();//只要是缓冲区就得刷新，将缓冲区里的数据刷到 ”kobe.txt“ 文件中；
		}
		
		bw.close();
	}
}