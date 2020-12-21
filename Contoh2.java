import java.util.Scanner; 

public class Contoh2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         int totalPertemuan = 16;

         int kehadiran[] = new int[n];
         int persentaseKehadiran[] = new int[n];
         int praktikum [] = new int[n];
         Boolean tugas[] = new Boolean[n];

         String layak[] = new String[n];

         for(int i = 0; i < n; i++) {
             kehadiran[i] = scanner.nextInt();
             persentaseKehadiran[i] = kehadiran[i] * 100 / totalPertemuan;
             praktikum[i] = scanner.nextInt();
             tugas[i] = scanner.nextBoolean();

             layak[i] = persentaseKehadiran[i] > 50 ? praktikum[i] > 80 ? tugas[i] == true ? "Layak" : "tugas kurang" : "nilai praktikum kurang" : "tidak layak";
         }
          
         for(int i = 0; i < n; i++) {
            System.out.println(kehadiran[i]);
            System.out.println(persentaseKehadiran[i]);
            System.out.println(praktikum[i]);
            System.out.println(tugas[i]);
            System.out.println(layak[i]);
         }
    }
}