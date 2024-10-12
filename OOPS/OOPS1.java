package OOPS;
public class OOPS1 {
    class BankAccount{
        private int balance;
        private boolean validate(String userName, String password){
            if(userName == "Himanshu" && password == "himanshu") return true;
            else return false;
        }
        public void setBalance(int balance){
            String userName = "Himanshu";
            String password = "himanshu";
            if(validate(userName, password)==true){
                this.balance = balance; 
            }
            else System.out.print("Incorrect Details");
        }
        public void printBalance(){
            System.out.print(balance);
        }
    }

    public static void main(String[] args) {
        OOPS1 oops = new OOPS1(); // Create an instance of the outer class
        BankAccount himanshu = oops.new BankAccount(); // Create an instance of the inner class
        himanshu.printBalance();
        himanshu.setBalance(1000);
        himanshu.printBalance();
    }
}

