import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if (n <= 1)
            isprime = false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        if (isprime)
            System.out.print("Prime number");
        else
            System.out.print("Not a prime number");
    }
}
