package Banking_features;

public interface Bankingapplication {
    int check_balance(String password);
    int deposited(int balance);
    int withdraw(int balance , String password);
    boolean change_password(String old , String news);
    String account_type(String password , String account_number);


}
