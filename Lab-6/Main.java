import java.util.Scanner;
public class WrongAgeException extends Exception{
    public WrongAgeException(){
        super("Error Message");
    }
    public WrongAgeException(String message){
        super(message);
    }
}

public class inputScanner{
    protected Scanner Sc;
    public inputScanner(){
        sc=new Scanner(System.in);
    }
}



public class Father extends inputScanner {
    protected int fatherage;

    public Father throws WrongAgeException() {
        super();
        System.out.println("Enter fathers age: ");
        fatherage = sc.nextInt();
        if (fatherage < 0) {
            throw new WrongAgeException("Age cannot be negative");
        }
    }

    public void display() {
        System.out.println("Fathers Age:" + fatherage);
    }

}

public  class Son extends Father{
    protected int sonage;
    public Son throws WrongAgeException(){
        super();
        System.out.println("Enter sons age: ");
        sonage=sc.nextInt();
        if(fatherage<sonage) {
            throw new WrongAgeException("fathers age must be greater than son");
        }
        else if(sonage<0){
                throw new WrongAgeException("son age must be greater than 0");
        }

        }
        public void display(){
            super.display();
            System.out.println("Sons Age:" +sonage);

    }

    public class Main{
        public static void main(Strings[] agrs){
            Son s;
            try{
                s=new Son();
                s.display();
            }
            catch(WrongAgeException e){
                System.ou.println("Error"+e.getmessage());
            }

    }
    }


