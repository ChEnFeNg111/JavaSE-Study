/*
字节流：（使用的是字节数组）
		InputStream  （写）
		OutputStream （读）

需求：需要操作的图片数据，这时就要使用的字节流
*/

import java.io.*;

class CopyImage
{
	public static void main(String[] arg)
	{
		FileInputStream  fis = null;//输入流
		FileOutputStream fos = null;//输出流
		try
		{
			fis = new FileInputStream("1.png");//将"1.pgn"图片内容复制到“2.pgn”中
			fos = new FileOutputStream("2.png");

			byte [] buf = new byte[2048];//1024的整数倍

			int len = 0;

			while((len=fis.read(buf))!=-1)//将读取到的字节存到 buf[] 字节数组中
			{
				fos.write(buf,0,len);//将 字节数组 buf[] 写入到 “2.png” ;
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("复制文件失败");
		}
		finally
		{
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("复制文件失败");
			}

			try
			{
				if(fos!=null)
					fos.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("复制文件失败");
			}
		}
	}
}