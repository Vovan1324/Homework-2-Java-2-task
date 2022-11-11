public class Main {
    public static void main(String[] args) {

        int AccountClient = 100;
        int DepositAmount = 1100;
        int Bonus;

        if (DepositAmount > 1000) {
            Bonus = DepositAmount / 100;
        } else {
            Bonus = 0;
        }

        int BalanceAccount = AccountClient + DepositAmount + Bonus;
        System.out.println("Баланс вашего счета:" + BalanceAccount + " руб. Полученный бонус: " + Bonus + "руб");
    }
}