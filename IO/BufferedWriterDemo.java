/*
�������ĳ��־���Ϊ��������Ĳ���Ч��

�����ڴ���������֮ǰ�����������������

�û��������ṩ��һ����ƽ̨�� ���з�
                             newLine����
*/
import java.io.*;

class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		//����һ���ַ�д��������
		FileWriter fw = new FileWriter("kobe.txt");

		//Ϊ������ַ�д����Ч�ʣ������˻��弼��
		//ֻҪ����Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯������
		BufferedWriter bw = new BufferedWriter(fw);

		for(int x=0;x<5;x++)
		{
			bw.write("abc"+x);//д���ļ���
			bw.newLine();//д��һ�����з���
			bw.flush();//ֻҪ�ǻ������͵�ˢ�£����������������ˢ�� ��kobe.txt�� �ļ��У�
		}
		
		bw.close();
	}
}