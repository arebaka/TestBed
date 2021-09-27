import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int x = in.nextInt();
        int y = in.nextInt();

        int sum = x + y;

        System.out.println("Their sum is " + sum);
    }
}
