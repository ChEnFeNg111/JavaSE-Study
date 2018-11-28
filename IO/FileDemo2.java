import java.io.*; 

class FileDemo2 
{
	public static void main(String[] args)throws IOException
	{
		//���˳��̶���׺�����ļ�
		File f = new File("D:\\java");
		filterFile(f);
		
	
		//�г�ָ��Ŀ¼����������
		File dir = new File("D:\\java\\IO");
		showList(dir);
		
	}
	
	public static void filterFile(File file){
		
		String [] names = file.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)//��д FilenameFilter �е� accept()���� 
			{
				return name.endsWith(".java");//���˳���׺��Ϊ�� .java �����ļ�
			}
		});//�����ڲ���

		for(String name : names)
		{
			System.out.println(name);
		}
	}

	public static void showList(File dir)
	{
		System.out.println(dir);
		File [] name = dir.listFiles();

		for(int x=0; x<name.length; x++)
		{
			if(name[x].isDirectory())//�ж��Ƿ�ΪĿ¼�ļ�
				showList(name[x]);
			System.out.println(name[x]);
		}
	}

}