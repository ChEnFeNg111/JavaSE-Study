/*
File类常见方法

1：创建：
		boolean createNewFile():在指定位置创建文件，如果文件已经存在，则不创建，返回false
								和输出流不一样，输出流对象一建立创建文件 而且文件已经存在，会覆盖
	    boolean mkdir():创建文件夹
		boolean mkdirs():创建多级文件夹

2,：删除：
		boolean delete():删除失败返回false ，如果文件正在被使用，则删除不了返回false
		void deleteOnExit():在程序退出时删除指定文件

3：判断：
		boolean exists():文件是否存在
				isFile():是否是个文件
				isDirectory():是否是个目录
				isHidden():是否是个隐藏文件
				isAbsolute():是否为绝对路径

4：获取信息：
		String getName():获取文件名
			   getPath():获取文件路径
			   getParent():获取文件的绝对路径，没有则返回null
				
			   getAbsolutePath():获取绝对路径
	    
		long   lastModified():获取最后一次修改文件的时间
			   length():获取文件大小
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
		//将a.txt封装成file对象。可以将已有的和为出现的文件或者文件夹封装成对象。
		File f = new File("D:\\java\\IO\\b\\g\\qq\\vv\\a.txt");
		
		//sop("create : "+f.createNewFile());
		//sop("create : "+f.mkdir());
		sop("create : "+f.mkdirs());//创建多目录文件夹
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