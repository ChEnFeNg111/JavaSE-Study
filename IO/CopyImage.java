/*
�ֽ�������ʹ�õ����ֽ����飩
		InputStream  ��д��
		OutputStream ������

������Ҫ������ͼƬ���ݣ���ʱ��Ҫʹ�õ��ֽ���
*/

import java.io.*;

class CopyImage
{
	public static void main(String[] arg)
	{
		FileInputStream  fis = null;//������
		FileOutputStream fos = null;//�����
		try
		{
			fis = new FileInputStream("1.png");//��"1.pgn"ͼƬ���ݸ��Ƶ���2.pgn����
			fos = new FileOutputStream("2.png");

			byte [] buf = new byte[2048];//1024��������

			int len = 0;

			while((len=fis.read(buf))!=-1)//����ȡ�����ֽڴ浽 buf[] �ֽ�������
			{
				fos.write(buf,0,len);//�� �ֽ����� buf[] д�뵽 ��2.png�� ;
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("�����ļ�ʧ��");
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
				throw new RuntimeException("�����ļ�ʧ��");
			}

			try
			{
				if(fos!=null)
					fos.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("�����ļ�ʧ��");
			}
		}
	}
}