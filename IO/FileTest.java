/*
��ϰ��
	��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����浽һ���ı��ļ���
	����һ��java�ļ��б�

˼·��
1����ָ��Ŀ¼���еݹ�
2���ڵݹ�����л�ȡ��׺��Ϊ .java ���ļ��ľ���·��
3������ȡ�ľ���·�����뵽������
4���ٽ������е�����д��һ�� java.txt �ı���

*/

import java.io.*;
import java.util.*;//����

class Test
{
	public static void main(String[] args)throws IOException
	{
			File dir = new File("D:\\java");
			List<File> list = new ArrayList<File>();

			fileToList(dir,list);

			System.out.println(list.size());
			
			File file =new File("D:\\java\\java.txt");//ָ�������ı�

			WriteToFile(list,file.toString());
	}

	public static void fileToList(File dir,List<File> list)
	{
		File [] files = dir.listFiles();

		for(File f : files)
		{
			if(f.isDirectory())
				fileToList(f,list);//��ָ��Ŀ¼���еݹ�
			
			else if(f.getName().endsWith(".java"))//�ڵݹ�����л�ȡ��׺��Ϊ .java ���ļ��ľ���·��
				list.add(f);//����ȡ�ľ���·�����뵽������
		}
	}

	public static void writeToFile(List<File> list,String javaFile)
	{
		BufferedWriter bfw = null;//���Ч��
		try
		{   
			bfw = new BufferedWriter(new FileWriter(javaFile));
			for(File f : list)//��������
			{
				String path = f.getAbsolutePath();//��ȡ����·��
				bfw.write(path);//�ٽ������е�����д��һ�� java.txt �ı���
				bfw.newLine();//����
				bfw.flush();
			}
			
		}
		catch (IOException e)
		{
			throw new RuntimeException("д��ʧ��");
		}
		finally
		{
			try
			{
				bfw.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("д��ر�ʧ��");
			}
		}
	}

}