/*
�ַ���ȡ��������

�û������ṩ��һ�� һ�ζ�һ�еķ��� readLine() ,�����ڶ��ı����ݵĻ�ȡ

������nullʱ����ʾ�����ļ�ĩβ
*/
import java.io.*;

class BufferedReaderDemo
{
	public static void main(String[] args)throws IOException
	{
		//����һ������������
		FileReader fr = new FileReader("kobe.txt");
		
		//����һ��������������Ҫ�����Ч�ʵ� �ַ���ȡ������ ��Ϊ�������ݸ��������Ĺ��캯������
		BufferedReader br = new BufferedReader(fr);
		
		String line=null;
			
		while((line=br.readLine())!=null)//null��Ϊ������־����ѵ�����ĩβ���򷵻� null
		
		{
			System.out.println(line);//��ȡ�����ı��У�

			br.close();
		}
	}
}