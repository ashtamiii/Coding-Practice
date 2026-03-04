import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first_large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first_large) {
                second_large = first_large;
                first_large = arr[i];
            } else if ((arr[i] != first_large) && (arr[i] > second_large))
                second_large = arr[i];
        }
        System.out.print("Second largest num: " + second_large);
    }
}
