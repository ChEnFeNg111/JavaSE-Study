/*
����һ��MP3�ļ�,ͨ��������
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
		BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("1.mp3"));//����1.mp3�����Ƶ���2.mp3����,�Ƚ����ݴ浽��������
		BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("2.mp3"));

		int ch = 0;

		while((ch=bfis.read())!=-1)//�ٴӻ�������һ��һ����ȡ����  read()�������������� byte->int
		{
			bfos.write(ch);//write()��ǿ��ת���������� int -> byte����֤�����ݵ�������
		}

		bfis.close();
		bfos.close();


	}
}
