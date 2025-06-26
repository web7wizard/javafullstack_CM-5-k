import java.util.Scanner;
public class Q1 
{  
    public static void main(String[] args)
    {  
        Scanner sc= new Scanner(System.in);
        System.out.println("wanna create account in bank!!!");
        System.out.println("1 for creating account , 2 for nope");
        int ch;
        ch=sc.nextInt();
        if(ch==1)
        { 
        BankAccount_UserOperation myAccount = new BankAccount_UserOperation(1000);  
        Runnable t1=()-> myAccount.deposit(500);  
        Runnable t2=()-> myAccount.withdraw(700);   
        Runnable t3=()-> myAccount.checkBalance();   
                                                                           
        Thread DepositThread = new Thread(t1);
        Thread WithdrawThread = new Thread(t2);   
        Thread BalanceThread= new Thread(t3);  
        DepositThread .start(); 
        WithdrawThread.start();   
        BalanceThread.start();
       }
       else
       {
         System.out.println("oops ok tell me when you are ready next time");
       } 
    } 
}

class BankAccount_UserOperation
{   
    private double balance; 
    public BankAccount_UserOperation(double initbalance) 
    {   
        this.balance = initbalance;   
    } 

    public synchronized void deposit(double amount) 
    {    
        System.out.println(Thread.currentThread().getName() + " Depositing " + amount);  
        this.balance += amount;    
        System.out.println("Updated balance after Deposit : " + this.balance);   
    }

    public synchronized void withdraw(double amount)
    {    
        if(amount > this.balance) 
        {    
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance... transaction failed");    
        }    
        else 
        {     
            System.out.println(Thread.currentThread().getName() + " Withdrawing Amount " + amount);     
            this.balance -= amount; 
            System.out.println("Updated balance after Withdraw : " + this.balance);   
        }  
    }    

    public synchronized void checkBalance()
    {     
        System.out.println(Thread.currentThread().getName() + " Checking balance : " + this.balance);  
    }   
}

/*class DepositThread extends Thread
{  
    private BankAccount_UserOperation account;   
    private double amount;      

    public DepositThread(BankAccount_UserOperation account, double amount) 
    {   
        this.account = account;    
        this.amount = amount;  
    }   

    public void run()
    {     
        account.deposit(amount);  
    }   
}

class WithdrawThread extends Thread
{  
    private BankAccount_UserOperation account;  
    private double amount; 

    public WithdrawThread(BankAccount_UserOperation account, double amount)
    {
        this.account = account;   
        this.amount = amount;   
    }  

    public void run()
    {   
        account.withdraw(amount);  
    }       
} 

class BalanceThread extends Thread
{   
    private BankAccount_UserOperation account; 

    public BalanceThread(BankAccount_UserOperation account) 
    {    
        this.account = account;  
    }    

    public void run() 
    {     
        account.checkBalance(); 
    }   
}*/