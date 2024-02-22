 class region
{
  public static void main(String args[])
  {
    String s1="Bmsce College";
    String s2="Welcome to Bmsce College of engineering";
    Boolean isMatch=s2.regionMatches(11,s1,0,4);
    if(isMatch)
      System.out.println("substring is matched");
    else
      System.out.println("substring is not matched");
    System.out.println("Bmsce College");
    System.out.println("Welcome to Bmsce College of engineering");
  }
  
}