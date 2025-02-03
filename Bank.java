public class Bank {
    int accNumber;
    String accHolderName;
    int accBalance;
    public Bank(int accNumber, int accBalance, String accHolderName){
        this.accBalance = accBalance;
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
    }
    public void depositAmount(int amount){
        accBalance += amount;
        System.out.println("For Account Number: " + accNumber + " Amount deposited in your account, your current balance is: " + accBalance);
    }
    public void withdrawAmount(int amount){
        if(amount<=accBalance){
            accBalance -= amount;
            System.out.println("For Account Number: " + accNumber + " Amount " + amount + " withdrawn from this account, your current balance is: " + accBalance);
        }
        else{
            System.out.println("Not Enough Balance");
        }
    }
    public void checkBalance(){
        System.out.println("Your Account Balance is: " + accBalance);
    }

    public static void main(String[] args) {
        Bank sbi = new Bank(123456, 5000, "Aman");
        sbi.withdrawAmount(100);
    }
}
