package Lab6_1;

public class Account {
    private String name, dateOfBirth;
    private int balance;

    public Account(String name, String dateOfBirth){
        this.name        = name;
        this.dateOfBirth = dateOfBirth;
        this.balance     = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void DepositMoney(int increase){
        this.balance += increase;
    }

    @Override
    public String toString(){
        return "Name: "+ name +"\nBalance: "+ balance +"\n";
    }
}
