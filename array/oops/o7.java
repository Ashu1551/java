class BankAccountProject{
    long accountNum;
    private int Balance;
    private int pass;
    BankAccountProject(long ac,int Bal,int p)
    {
        System.out.println("Welcome:"); 
        accountNum=ac;
        Balance=Bal;
        pass=p;
        
    }
    public void deposit(int depBal)
    {
    Balance=Balance+depBal;

    }
    public void Withdraw(int WithBal,int pin)
    {
        if(pass !=pin)
        {
            System.out.println("invalid password");
            return;
        }
        if(WithBal>Balance)
        {
            System.out.println("insufficen Amount");
        }
         else
         {
            Balance=Balance-WithBal;
         }
    }
    public void getBalance(int pin)
    {
        if(pass==pin){
            System.out.println("Available Balance is "+Balance);
        
        }else {
            System.out.println("invalid password");
        }
        
    }

}
public class o7{
    public static void main(String[] args) 
    {   
    
    BankAccountProject obj1=new BankAccountProject(900610110009576l,10000,9893);
    //obj1.getBalance(9893);
    obj1.Withdraw(8000,9893);
    //obj1.getBalance(9893);
    obj1.deposit(5000);
    obj1.Withdraw(8000, 9893);
    obj1.getBalance(9893);
}
}
