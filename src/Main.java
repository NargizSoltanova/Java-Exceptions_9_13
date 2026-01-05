import java.util.Arrays;

public class Main {
    static void main() {

        //Task 9
        method1();

        //Task 10

        try{
            method4();
        }catch(Exception e){
            System.out.println(e);
        }

        //Task 11

        BankAccount bankAccount = new BankAccount(500);
        bankAccount.withdraw(600);

        //Task 12

        try{
            withdraw("1234",600);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Task 13

        try {
            System.out.println(5/0);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.stream(e.getStackTrace()).toList());
            // e.printStackTrace(); // bu exception kimidir
            System.out.println(e.getCause());
        }
    }

    private static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception caught in method1: " + e.getMessage());
        }
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        throw new ArithmeticException("Error occurred in method3");
    }

    private static void method4() throws Exception {
        throw new Exception("Checked exception");
    }

    private static void withdraw(String pin, double amount) {
        if (!pin.equals("5789")) {
            throw new InvalidPinException("Invalid PIN");
        }

        if (amount > 500) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        if (amount > 10) {
            throw new DailyLimitExceededException("Daily limit exceeded");
        }
    }
}
