package iss.sg.edu.nus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
    

    BankAccount jiaAccount = new BankAccount("jia", "ag-1111", 200000);
    
    System.out.println(jiaAccount.toString());
    // withdraw();
    }
}
