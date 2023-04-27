public class Account {
    //user's personal info
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    //constructor
    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

     //Deposit function
    public void DepoistMoney(double DepoistedMoney) {
        this.Balance += DepoistedMoney;
        System.out.println("Deposit is Successful!!! Your new balance is " + this.Balance);
    }

    //create setters & getters for each variable
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phonenumber) {
        PhoneNumber = phonenumber;
    }


}
