import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_even = Integer.MIN_VALUE;
        int max_odd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (max_even < arr[i])
                    max_even = arr[i];
            } else {
                if (max_odd < arr[i])
                    max_odd = arr[i];
            }
        }
        System.out.println("Highest even: " + max_even);
        System.out.print("Highest odd: " + max_odd);
    }
}
