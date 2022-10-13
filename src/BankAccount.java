public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = sum;

    }
    public void withDraw (double sum) throws LimitException{
        if (sum > getAmount()){
            throw new LimitException( "Сумма снятия больше остатка ", getAmount());
        }else {
            System.out.println("вы можете снять со счета: " + getAmount());
            this.amount -= sum;
            System.out.println("C вашего счёта было снято: " + sum + "$ USD" +
                    "\nВаш текущий счёт: " + amount + "$ USD\n");
        }

    }
}
