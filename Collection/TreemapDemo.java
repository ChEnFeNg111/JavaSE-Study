/*
练习：
"sdfgzxcvasdfxcvdf"获取该字符串中的字母出现的次数。

希望打印结果：a(1)c(2).....

通过结果发现，每一个字母都有对应的次数。
说明字母和次数之间都有映射关系。

注意了，当发现有映射关系时，可以选择map集合。
因为map集合中存放就是映射关系。


什么使用map集合呢？
当数据之间存在这映射关系时，就要先想map集合。

思路：
1，将字符串转换成字符数组。因为要对每一个字母进行操作。

2，定义一个map集合，因为打印结果的字母有顺序，所以使用treemap集合。

3，遍历字符数组。
	将每一个字母作为键去查map集合。
	如果返回null，将该字母和1存入到map集合中。
	如果返回不是null，说明该字母在map集合已经存在并有对应次数。
	那么就获取该次数并进行自增。，然后将该字母和自增后的次数存入到map集合中。覆盖调用原理键所对应的值。

4，将map集合中的数据变成指定的字符串形式返回。



*/

import java.util.*;

class MapTest3
{
	public static void main(String[] args)
	{
		String s = charCount("sa$%#^&dfbfbfd+_--dvbcjhbdfjfhdsgb");
		System.out.println(s);
	}

	public static String charCount(String str)
	{
		char[] ch = str.toCharArray();//将字符串转化为字符数组

		TreeMap<Character,Integer> t = new TreeMap<Character,Integer>();//建立TreeMap集合

		for(int x=0;x<ch.length;x++)//遍历字符数组
		{
			if(!(ch[x]>='a' && ch[x]<='z' || ch[x]>='A' && ch[x]<='Z'))
				continue;//结束此次循环，继续下次循环

			Integer value = t.get(ch[x]);//获取该字符在map集合中的值
			
			if(value==null)
			{
				t.put(ch[x],1);
			}	
			else
			{
				value=value+1;
				t.put(ch[x],value);//将映射关系存入map集合中
			}		
		}

		StringBuilder s = new StringBuilder();//定义一个容器，缓冲区存储数据

		Set<Map.Entry<Character,Integer>> entrySet = t.entrySet();//用 entrySet 方式获取

		Iterator<Map.Entry<Character,Integer>> it = entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<Character,Integer> m = it.next();
			Character chs = m.getKey();
			Integer value = m.getValue();
			
			s.append(chs+"("+value+")");//将获取到的数据存入缓冲区
		}

		return s.toString();//返回一个字符串s
	}

}