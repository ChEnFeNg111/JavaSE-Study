/*
拷贝一个MP3文件,通过缓冲区
				BufferedInputStream
				BufferedOutputStream
*/

import java.io.*;

class CopyMp3
{
	public static void main(String[] args)throws IOException
	{
		copyMp3();
	}

	public static void copyMp3()throws IOException
	{
		BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("1.mp3"));//将“1.mp3”复制到“2.mp3”中,先将数据存到缓冲区中
		BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("2.mp3"));

		int ch = 0;

		while((ch=bfis.read())!=-1)//再从缓冲区中一个一个读取出来  read()在提升数据类型 byte->int
		{
			bfos.write(ch);//write()在强制转化数据类型 int -> byte，保证了数据的完整性
		}

		bfis.close();
		bfos.close();


	}
}
