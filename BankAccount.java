
class BankAccount {
    String accountNumber;
    double balance;
    
   void deposit(double amount){
       balance=balance+amount;
       System.out.println("Deposited: "+amount);
   } 
   void withdraw(double amount){
       if(amount<=balance){
           balance=balance-amount;
           System.out.println("Withdrawn: "+amount);
           } else {
           System.out.println("Insufficient balance: ");
       }
   }
   void display(){
       System.out.println("Account Number: "+accountNumber);
       System.out.println("Balance: "+balance);
   }
   

public static void main (String args[]){
    BankAccount num1=new BankAccount();
    num1.accountNumber= "A21";
    num1.balance= 200000;
    BankAccount num2=new BankAccount();
    num2.accountNumber= "A96";
    num2.balance= 100000;
    
    num1.deposit(5500);
    num1.withdraw(300);
    num1.display();
    
    num2.deposit(2000);
    num2.withdraw(1000);
    num2.display();
    
}
}
