/*
字符流：（使用的是字符数组）
		FileReader
		FileWriter

		BufferedReader
		BufferedWriter

 转换流：InputStreamReader  将字节流对象转出字符流对象 属于字符流  读取转换流
		 OutputStreamWriter 将字符流通向字节流的桥梁  属于字符流   写入转换流

字节流：（使用的是字节数组）
		InputStream  （写）
		OutputStream （读）

		BufferedInputStream
		BufferedOutputStream

通过键盘录入一行数据并打印其大写，

读一行 readLine() 是字符流 BufferedReader 类中的方法

键盘录入的 read() 是字节流 InputStream 类的方法

可以通过转换流 InputStreamReader 将字节流对象转出字符流对象

*/

import java.io.*;

class TransStream
{
	public static void main(String[] args)throws IOException
	{
		TransStream();
	}

	public static void TransStream()throws IOException
	{
		/*
		InputStream in = System.in;//键盘录入,字节流

		InputStreamReader insr = new InputStreamReader(in);//通过转换流 InputStreamReader 将字节流对象转出字符流对象

		BufferedReader bfr = new BufferedReader(insr);//字符流

		*/

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));


/*
		 OutputStream out = System.out;

		 OutputStreamWriter opsw = new OutputStreamWriter(out);
		
		 BufferedWriter bfw = new BufferedWriter(opsw);
*/
		 BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String line = null;
		
		while((line = bfr.readLine())!=null)
		{
			if(line.equals("over"))//如果键盘录入 "over" 则结束该程序
				break;
			//System.out.println(line.toUpperCase());
			bfw.write(line.toUpperCase());//控制台显示
			bfw.newLine();//换行符
			bfw.flush();
		}

		bfw.close();
		bfr.close();//关闭流
	}
}

