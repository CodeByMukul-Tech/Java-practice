package Bank;

import Banking_features.Bankingapplication;

import java.util.UUID;

public class HDFC implements Bankingapplication {

   private String account_number;
   private String holder_name;
   private String password;
   private int balance;
   private double rate_of_interest;

   HDFC( String Holdername ,String password,int balancea){
       this.account_number = String.valueOf(UUID.randomUUID());
       this.holder_name=Holdername;
       this.password = password;
       this.balance = balancea;
       this.rate_of_interest = 5.7;

   }



    @Override
    public int check_balance(String password) {
        if(!this.password.equals(password)){
            System.out.println("worng password");

        }
        return this.balance;
    }

    @Override
    public int deposited(int balance) {
        return this.balance+=balance;
    }

    @Override
    public int withdraw(int amount,String password) {

         if(!this.password.equals(password)){
             System.out.println("wrong password");
         }
         if(amount>this.balance){
             System.out.println("Insucient Balance");
         }
         return  this.balance-=amount;

    }

    @Override
    public boolean change_password(String old, String news) {
           if(!this.password.equals(old)){
               System.out.println("Wrong password");
               return false;
           }
           this.password = news;
           return  true;
    }

    @Override
    public String account_type(String password , String account_number) {

    }
}
