class replacetest 
{
	public static void main(String args[]) 
	{
		StringBuffer sb = new StringBuffer("This  is  a test. ");
		StringBuffer sb1 = new StringBuffer("This is a test ,too");
 		sb.replace(2,4,"was");
		sb.replace(6,9,"was");
		sb1.replace(2,4,"was");
		sb1.replace(6,8,"was");
		System.out.println("After replace: " + sb + sb1);
	}
}