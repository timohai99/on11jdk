package uchiJavaChak.dz5.BankAccount;

public class BankAccountTest {
        class BankAccountTest {
                public void main(String[] args) {

                        BankAccount Myaccount = new BankAccount();
                        BankAccount YourAccount = new BankAccount();
                        BankAccount HisAccount = new BankAccount();

                        Myaccount.id = 1;
                        Myaccount.name = "Ivan";
                        Myaccount.balance = 12.35;

                        YourAccount.id = 2;
                        YourAccount.name = "Mike";
                        YourAccount.balance = 2.0;

                        HisAccount.id = 3;
                        HisAccount.name = "Zaur";
                        HisAccount.balance = 124.12;

                        BankAccount c1 = new BankAccount();
                        double popol = c1.PopolnenieScheta(33.7);
                        System.out.println(c1.PopolnenieScheta(33.7));

                }

        }
}
