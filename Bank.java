
public class Bank {
    public static void main(String[] args) {
        //creating object
        Account AmysAccount = new Account("3094598", 0.0, "Amy", "amyktruongdev@gmail.com", "9578045255");

        //insert prompts for user
        System.out.println("-------Welcome to the Bank of Meow!-------");
        

        //testing all functions, successful !!!!!!!!!!!!!!!!! :D
        AmysAccount.DepoistMoney(1000);
        AmysAccount.Withdraw(200);
        AmysAccount.DepoistMoney(300);
        AmysAccount.Withdraw(1200);

        
    }
}