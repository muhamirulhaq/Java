import java.util.Scanner;

public class No12 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Input jumlah sepatu di toko : ");
        int n = user.nextInt();

        printIndexUkuranSepatu(n);
        user.close();

    }

    public static String ukuranSepatu(int n) {
        Scanner user = new Scanner(System.in);
        int h[] = new int[n];

        String str = "";

        System.out.println("Input ukuran-ukuran sepatu yang ada di toko : ");
        for(int i = 1; i <= n; i++) {
            System.out.print("Sepatu ke-" + i + " : ");
            h[i-1] = user.nextInt();
        }

        System.out.println("Input ukuran sepatu pacar : ");
        int x = user.nextInt();

        // BATASAN -> nilai n, x, dan h berada dalam interval 1 dan 100.000

        for(int j = 0; j < n; j++) {

            if(n >= 1 && n <= 100000 && x >= 1 && x <= 100000 && h[j] >= 1 && h[j] <= 100000) {

                for(int i = 1; i <= n; i++) {
                    if(x == h[i-1]) {

                        if(j == 0) {
                            str = "Ukuran " + x + " berada pada urutan ke-" + i;
                        }
                        
                        break;
                    }
                }           

            } else {
                str = "Melebihi batas!";
                break;
            }
        }
        user.close();
        return str;
    }

    public static void printIndexUkuranSepatu(int n) {
        System.out.println(ukuranSepatu(n));
    }
}

