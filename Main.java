import java.util.Scanner;

class BankAccount {
    private int accNo;
    private String accName;
    private String email;
    private double balance;

    // Getters
    public int getAccNo() {return accNo;}
    public String getAccName() {return accName;}
    public String getEmail() {return email;}
    public  double getBalance() {return balance;}

    // Setters
    public void setAccNo(int no) {accNo = no;}
    public void setAccName(String name) {accName = name;}
    public void setEmail( String e) {email = e;}
    public void setBalance(double bal) {balance = bal;}

    public void display() {
        System.out.printf("%-8s%-10s%-20s%-10.0f%n", accNo, accName, email, balance );
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[3];

        for (int i = 0; i < 3; i++) {
            accounts[i] = new BankAccount();
            System.out.print("Enter Account No: ");
            accounts[i].setAccNo(sc.nextInt());
            System.out.print("Enter Account Name: ");
            accounts[i].setAccName(sc.next());
            System.out.print("Enter Email: ");
            accounts[i].setEmail(sc.next());
            System.out.print("Enter Balance: ");
            accounts[i].setBalance(sc.nextDouble());
        }
    
    System.out.println();
    System.out.printf("%-8s%-10s%-20s%-10s%n", "Acc No", "Acc Name", "Email", "Balance");
    System.out.println("=================================================");    
    for (BankAccount a : accounts)
        a.display();

    sc.close();
    }
}

