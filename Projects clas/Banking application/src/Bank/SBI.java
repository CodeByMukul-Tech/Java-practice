package Bank;

import Banking_features.Bankingapplication;

public class SBI implements Bankingapplication {

    @Override
    public int check_balance(String password) {
        return 0;
    }

    @Override
    public int deposited(int balance) {
        return 0;
    }

    @Override
    public int withdraw(int balance , String password) {
        return 0;
    }

    @Override
    public boolean change_password(String old, String news) {
        return false;
    }

    @Override
    public String account_type(String password, String account) {
        return "";
    }
}
