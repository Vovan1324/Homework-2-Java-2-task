public class Main {
    public static void main(String[] args) {

        int accountclient = 100;
        int depositamount = 1100;
        int bonus;

        if (depositamount > 1000) {
            bonus = depositamount / 100;
        }
        else { bonus = 0;
        }

        int balanceaccount = accountclient + depositamount + bonus;
        System.out.println("Баланс вашего счета:" + balanceaccount + " руб. Полученный бонус: " + bonus + "руб" );
    }
}