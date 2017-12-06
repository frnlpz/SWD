package Lab6_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("FirstAccount",  "100296");
        Account account2 = new Account("SecondAccount", "071500");
        Account account3 = new Account("ThirdAccount",  "111370");
        Account account4 = new Account("FourthAccount", "080971");
        Account account5 = new Account("FifthAccount",  "021489");
        Account account6 = new Account("SixthAccount",  "082293");
        Account account7 = new Account("SeventhAccount","121093");

        bank.AddAccount(account1);
        bank.AddAccount(account2);
        bank.AddAccount(account3);
        bank.AddAccount(account4);
        bank.AddAccount(account5);
        bank.AddAccount(account6);
        bank.AddAccount(account7);

        account1.DepositMoney(30);
        account2.DepositMoney(70);
        account3.DepositMoney(130);
        account4.DepositMoney(20);
        account5.DepositMoney(45);
        account6.DepositMoney(1800);
        account7.DepositMoney(1);

        System.out.println(bank.GetAccount("FirstAccount",  "100296").toString());
        System.out.println(bank.GetAccount("SecondAccount", "071500").toString());
        System.out.println(bank.GetAccount("ThirdAccount",  "111370").toString());
        System.out.println(bank.GetAccount("FourthAccount", "080971").toString());
        System.out.println(bank.GetAccount("FifthAccount",  "021489").toString());
        System.out.println(bank.GetAccount("SixthAccount",  "082293").toString());
        System.out.println(bank.GetAccount("SeventhAccount","121093").toString());


    }
}
