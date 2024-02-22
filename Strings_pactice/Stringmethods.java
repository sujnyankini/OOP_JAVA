class Stringmethods
{
	public static void main(String args[])
	{
		char chs[] = { 'A', 'B', 'C' };
		String s1 = new String(chs);

		//To find string length
		System.out.println(s1.length());

		//Use string literal
		String s2 = "ABC"; 
		System.out.println("ABC".length());

		//String concatenation
		int rollno = 10;
 		String s3 = "Roll no " + rollno + " is present.";
 		System.out.println(s3);
	}
}






