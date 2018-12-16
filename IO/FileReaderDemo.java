/*
�ļ�����
	���Ƶ�ԭ��
��ʵ���ǽ�C���µ��ļ����ݴ洢��D�̵�һ���ļ��С�

���裺
1����D�̴���һ���ļ������ڴ洢C���ļ��е����ݡ�
2�������ȡ����C���ļ�������
3��ͨ�����ϵĶ�д������ݴ洢��
4���ر���Դ��
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
			fr=new FileReader("DateDemo.java");//��ȡ DateDemo.java �ļ�
			
			char[] buf = new char[1024];//����һ��������ȡ��������

			int len=0;

			while((len=fr.read(buf))!=-1)
			{
				fw.write(buf,0,len);//�������������д�� ��DateDemo_copy.txt���ļ���
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("��дʧ��");
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