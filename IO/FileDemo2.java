import java.io.*; 

class FileDemo2 
{
	public static void main(String[] args)throws IOException
	{
		//过滤出固定后缀名的文件
		File f = new File("D:\\java");
		filterFile(f);
		
	
		//列出指定目录的所有内容
		File dir = new File("D:\\java\\IO");
		showList(dir);
		
	}
	
	public static void filterFile(File file){
		
		String [] names = file.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)//重写 FilenameFilter 中的 accept()方法 
			{
				return name.endsWith(".java");//过滤出后缀名为“ .java ”的文件
			}
		});//匿名内部类

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
			if(name[x].isDirectory())//判断是否为目录文件
				showList(name[x]);
			System.out.println(name[x]);
		}
	}

}