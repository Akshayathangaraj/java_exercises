import java.util.Scanner;

public class WalletApp {
    public static void main(String[] args) {
        EWallet myWallet = new EWallet();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- E-Wallet Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Pay Money");
            System.out.println("3. View Mini Statement");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    double addAmt = sc.nextDouble();
                    myWallet.addMoney(addAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to pay: ");
                    double payAmt = sc.nextDouble();
                    myWallet.pay(payAmt);
                    break;

                case 3:
                    myWallet.viewMiniStatement();
                    break;

                case 4:
                    System.out.println("Current Balance: " + myWallet.getBalance());
                    break;

                case 5:
                    System.out.println("Thank you for using E-Wallet.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice != 5);
        
        sc.close();
    }
}
