class question10
{
  public static void main(String args[])
  {
    String s="Hello";
    String s1=new String(s);
    System.out.println(s + " equals " + s1 + " -> " +s.equals(s1));

    System.out.println(s + " == " + s1 + " -> " + (s == s1));
  }
}