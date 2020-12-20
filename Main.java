import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) num[i] = scanner.nextInt();
        scanner.close();

        int even = 0;
        int odd = 0;

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < n; i++) {
            if(num[i] % 2 == 0) {
                even++;
                sumEven += num[i];
            } else {
                odd++;
                sumOdd += num[i];
            }
        }

        int higher = 0;
        int lower = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(num[i] == num[j]) continue;
                if(num[i] > num[j]) {
                    if(j == n-1) {
                        higher = num[i];
                        i = n;
                        break;
                    }
                } else break;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(num[i] == num[j]) continue;
                if(num[i] < num[j]) {
                    if(j == n-1) {
                        lower = num[i];
                        i = n;
                        break;
                    }
                } else break;
            }
        }

        System.out.println("Number of even is " + even);
        System.out.println("Summation of even numbers is " + sumEven);

        System.out.println("Number of odd is " + odd);
        System.out.println("Summation of odd numbers is " + sumOdd);
        
        System.out.println("Higher number is " + higher);
        System.out.println("Lower number is " + lower);
    }
}