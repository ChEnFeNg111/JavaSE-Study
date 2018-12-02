/*
�ַ�������ʹ�õ����ַ����飩
		FileReader
		FileWriter

		BufferedReader
		BufferedWriter

 ת������InputStreamReader  ���ֽ�������ת���ַ������� �����ַ���  ��ȡת����
		 OutputStreamWriter ���ַ���ͨ���ֽ���������  �����ַ���   д��ת����

�ֽ�������ʹ�õ����ֽ����飩
		InputStream  ��д��
		OutputStream ������

		BufferedInputStream
		BufferedOutputStream

ͨ������¼��һ�����ݲ���ӡ���д��

��һ�� readLine() ���ַ��� BufferedReader ���еķ���

����¼��� read() ���ֽ��� InputStream ��ķ���

����ͨ��ת���� InputStreamReader ���ֽ�������ת���ַ�������

*/

import java.io.*;

class TransStream
{
	public static void main(String[] args)throws IOException
	{
		TransStream();
	}

	public static void TransStream()throws IOException
	{
		/*
		InputStream in = System.in;//����¼��,�ֽ���

		InputStreamReader insr = new InputStreamReader(in);//ͨ��ת���� InputStreamReader ���ֽ�������ת���ַ�������

		BufferedReader bfr = new BufferedReader(insr);//�ַ���

		*/

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));


/*
		 OutputStream out = System.out;

		 OutputStreamWriter opsw = new OutputStreamWriter(out);
		
		 BufferedWriter bfw = new BufferedWriter(opsw);
*/
		 BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String line = null;
		
		while((line = bfr.readLine())!=null)
		{
			if(line.equals("over"))//�������¼�� "over" ������ó���
				break;
			//System.out.println(line.toUpperCase());
			bfw.write(line.toUpperCase());//����̨��ʾ
			bfw.newLine();//���з�
			bfw.flush();
		}

		bfw.close();
		bfr.close();//�ر���
	}
}

