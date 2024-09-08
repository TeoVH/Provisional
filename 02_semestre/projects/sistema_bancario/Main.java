import java.util.Scanner;

class Main {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Account cuenta = new Account();
        cuenta.deposit(1000);
        System.out.println(cuenta.getBalance());
        cuenta.spend(500);
        System.out.println(cuenta.getBalance());
    }
}