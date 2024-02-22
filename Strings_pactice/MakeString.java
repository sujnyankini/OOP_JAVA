/*To construct one string from another*/

class MakeString 
{
	public static void main(String args[]) 
	{
		char ch[] = {'B', 'M', 'S', 'C','E'};
		String s1 = new String(ch);
		String s2 = new String(s1);
		System.out.println(s1);
		System.out.println(s2); 
	} 
}

