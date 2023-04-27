
public class Bank {
    public static void main(String[] args) {
        //creating object
        Account AmysAccount = new Account("3094598", 0.0, "Amy", "amyktruongdev@gmail.com", "9578045255");

        //testing all functions, successful !!!!!!!!!!!!!!!!! :D
        AmysAccount.DepoistMoney(1000);
        AmysAccount.Withdraw(200);
        AmysAccount.DepoistMoney(300);
        AmysAccount.Withdraw(1200);
    }
}