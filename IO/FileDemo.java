/*
File�ೣ������

1��������
		boolean createNewFile():��ָ��λ�ô����ļ�������ļ��Ѿ����ڣ��򲻴���������false
								���������һ�������������һ���������ļ� �����ļ��Ѿ����ڣ��Ḳ��
	    boolean mkdir():�����ļ���
		boolean mkdirs():�����༶�ļ���

2,��ɾ����
		boolean delete():ɾ��ʧ�ܷ���false ������ļ����ڱ�ʹ�ã���ɾ�����˷���false
		void deleteOnExit():�ڳ����˳�ʱɾ��ָ���ļ�

3���жϣ�
		boolean exists():�ļ��Ƿ����
				isFile():�Ƿ��Ǹ��ļ�
				isDirectory():�Ƿ��Ǹ�Ŀ¼
				isHidden():�Ƿ��Ǹ������ļ�
				isAbsolute():�Ƿ�Ϊ����·��

4����ȡ��Ϣ��
		String getName():��ȡ�ļ���
			   getPath():��ȡ�ļ�·��
			   getParent():��ȡ�ļ��ľ���·����û���򷵻�null
				
			   getAbsolutePath():��ȡ����·��
	    
		long   lastModified():��ȡ���һ���޸��ļ���ʱ��
			   length():��ȡ�ļ���С
*/
import java.io.*;

class FileDemo
{
	public static void main(String[] args)throws IOException
	{
		//METHOD_1();
		//METHOD_2();
		//METHOD_3();
		METHOD_4();
	}

	public static void METHOD_1()throws IOException
	{
		//��a.txt��װ��file���󡣿��Խ����еĺ�Ϊ���ֵ��ļ������ļ��з�װ�ɶ���
		File f = new File("D:\\java\\IO\\b\\g\\qq\\vv\\a.txt");
		
		//sop("create : "+f.createNewFile());
		//sop("create : "+f.mkdir());
		sop("create : "+f.mkdirs());//������Ŀ¼�ļ���
	}

	public static void METHOD_2()
	{
		File f = new File("s.txt");

		sop("delete : "+f.delete());

	}

	public static void METHOD_3()
	{
		File f = new File("D:\\java\\IO\\hahah");

		sop("exists : "+f.exists());
		sop("isFile : "+f.isFile());
		sop("isAbsolute : "+f.isAbsolute());
		sop("isDirectory : "+f.isDirectory());
		sop("isHidden : "+f.isHidden());
	}

	public static void METHOD_4()
	{
		File f = new File("D:\\java\\IO\\kobe.txt");

		sop("getName: "+f.getName());
		sop("getPath: "+f.getPath());
		sop("getParent: "+f.getParent());
		sop("getAbsolutePath: "+f.getAbsolutePath());
		sop("lastModified: "+f.lastModified());
		sop("length: "+f.length());

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}