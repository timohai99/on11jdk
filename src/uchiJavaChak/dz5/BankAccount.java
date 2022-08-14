package uchiJavaChak.dz5;

 class BankAccount {
     int id;
     String name;
     Double balance;

     double PopolnenieScheta (double a) {
         double result1 = a + balance;
         return result1;
     }

     double snyatieSoScheta (double b) {
         double result2 = b + balance;
         return result2;
     }

     void showPop() {
         System.out.println("пополнено на " + balance);
     }

 }


    class BankAccountTest {
        public static void main(String[] args) {

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