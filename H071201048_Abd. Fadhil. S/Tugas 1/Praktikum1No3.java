import java.util.Scanner;
public class Praktikum1No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Ketinggian Menara");
        int h = input.nextInt();
        System.out.println("Masukkan Ujung Belakang Kapal");
        int a = input.nextInt();
        System.out.println("Masukkan Ujung Depan Kapal");
        int b = input.nextInt();
        double Segitiga1;
        double Segitiga2;
        
        Segitiga1 = Math.tan(Math.toRadians(a));
        Segitiga2 = Math.tan(Math.toRadians(b));

        double Pk;
        Pk = (Segitiga1 * h) - (Segitiga2 * h);

        System.out.printf("%.1f m", Pk);
        




    }
}
