package CIE;

import java.util.Scanner;

public class Internals extends Student 
{
    protected int marks[] = new int[5];

    public Internals() {}

    public void inputCIEmarks() 
	 {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Internal Marks for " + name);
        for (int i = 0; i < 5; i++) 
		   {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = s.nextInt();
        }
    }
}
