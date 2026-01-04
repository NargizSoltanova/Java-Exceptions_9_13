import java.util.Arrays;

public class Main {
    static void main() {

        //Task 13
        try {
            System.out.println(5/0);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.stream(e.getStackTrace()).toList());
            e.printStackTrace(); // bu exception kimidir
            System.out.println(e.getCause());
        }
    }
}
