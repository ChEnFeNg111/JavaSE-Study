 /*
�ַ������ֽ�����

�ֽ����������ࣺ
	InputStream   OutputStream


�ַ����������ࣺ
	Reader Writer

��ѧϰһ���ַ������ص㡣

��ȻIO�������ڲ������ݵģ�
��ô���ݵ����������ʽ�ǣ��ļ���

��ô���Բ����ļ�Ϊ������ʾ��

����:��Ӳ���ϣ�����һ���ļ���д��һЩ�������ݡ�

�ҵ�һ��ר�����ڲ����ļ���Writer�������FileWriter��  ��׺���Ǹ������� ǰ׺���Ǹ�������Ĺ��ܡ�

IOException �쳣����ʽ��
		


*/
import java.io.*;
class  FileWriterDemo
{
	public static void main(String[] args) 
	{
		//����һ��FileWriter���󡣸ö���һ����ʼ���ͱ���Ҫ��ȷ���������ļ���
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼�¡������Ŀ¼������ͬ���ļ����������ǡ�
		//��ʵ�ò���������ȷ����Ҫ��ŵ�Ŀ�ĵء�
		//FileWriter fw = new FileWriter("demo.txt");

		//����write���������ַ���д�뵽���С�
		//fw.write("abcde");

		//ˢ���������еĻ����е����ݡ�
		//������ˢ��Ŀ�ĵ��С�
		//fw.flush();


		//�ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ��Ļ����е����ݡ�
		//������ˢ��Ŀ�ĵ��С�
		//��flush����flushˢ�º������Լ���ʹ�ã�closeˢ�º󣬻Ὣ���رա�
		//fw.close();

		//IOException �쳣����
		
		FileWriter fw = null;//�����涨�����
		try
		{
			//����һ�� true �����������������е��ļ����������е��ļ���ĩβ������������д
			fw = new FileWriter("demo.txt",true);//��ʼ��
			fw.write("\n kobe");//��д
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		finally 
		{
			try
			{
				if(fw!=null)//������ж��Ƿ�Ϊ��
					fw.close();
			}
			catch (IOException e)
			{
				System.out.println(e.toString());
			}
			
		}
	}
}
