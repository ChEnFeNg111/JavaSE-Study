/*
ɾ�������ݵ�Ŀ¼
*/
import java.io.*;

class DeleteDemo
{
	public static void main(String[] args)
	{
		File dir = new File("D:\\java\\IO\\hahah");
		Delete(dir);
	}

	public static void Delete(File dir)
	{
		File[] Files = dir.listFiles();//�г�ָ��Ŀ¼�µ��ļ�����������

		for(int x=0; x<Files.length; x++)//��������
		{
			if(Files[x].isDirectory())//�ж��Ƿ�ΪĿ¼
				Delete(Files[x]);//�ݹ飬����Ŀ¼�µ��ļ�
			else 
				System.out.println(Files[x].toString()+"===="+Files[x].delete());
		}
		System.out.println(dir.toString()+"---------"+dir.delete());
	}
}