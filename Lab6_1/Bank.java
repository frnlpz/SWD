package Lab6_1;

import java.util.ArrayList;

public class Bank {

    protected ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    void AddAccount(Account account){
        accounts.add(account);
    }

    public Account GetAccount(String name, String dateOfBirth){
        for (int i=0; i<=accounts.size(); i++){
            if (accounts.get(i).getName().equals(name) && accounts.get(i).getDateOfBirth().equals(dateOfBirth))
                return accounts.get(i);
        }
        System.out.println("Error. Account not found.");
        return null;
    }
}
