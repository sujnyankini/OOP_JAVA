public class question4and5
{
    public static void main (String[] a)
    {
        String s="welcome to bmsce college";
        char word[]=new char[6];
        char[] w=s.toCharArray();//tochararray
        s.getChars(11,16,word,0);//getchars
        System.out.println(word);
        System.out.println(w);
        String s1="ABC";
        byte[] b=s1.getBytes();//getbytes
        for(int i=0;i<b.length;i++)
        {
        System.out.println(b[i]);
        }
    }
}