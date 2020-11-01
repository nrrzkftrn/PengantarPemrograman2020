import java.util.Scanner;

class Nomor02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan Menu yang diinginkan :");
        try
        {
            int menu = input.nextInt();
            double s, p, l, a, t, r, atas, bawah, d1, d2;
            double phi = 3.14;
            switch (menu) {
                case 1 :
                    System.out.println("\n** Pilih Bangun Datar **");
                    System.out.println("1. Persegi");
                    System.out.println("2. Persegi Panjang");
                    System.out.println("3. Segitiga");
                    System.out.println("4. Lingkaran");
                    System.out.println("5. Jajar Genjang");
                    System.out.println("6. Trapesium");
                    System.out.println("7. Belah Ketupat");
                    System.out.println("8. Layang-Layang");

                    System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                    int bangunruang = input.nextInt();
                    switch (bangunruang) {
                        case 1 :
                            System.out.println("\nInput Panjang Sisi");
                            s = input.nextDouble();
                            double luaspersegi = s * s;
                            System.out.printf("Luas Persegi = %.2f\n", luaspersegi);
                            break;
                        case 2 :
                            System.out.println("\nInput Panjang");
                            p = input.nextDouble();
                            System.out.println("Input Lebar");
                            l = input.nextDouble();
                            double luaspersegipanjang = p * l;
                            System.out.printf("Luas Persegi Panjang = %.2f\n", luaspersegipanjang);
                            break;
                        case 3 :
                            System.out.println("\nInput Alas");
                            a = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double luassegitiga = (a * t) / 2;
                            System.out.printf("Luas Segitiga = %.2f\n", luassegitiga);
                            break;
                        case 4 :
                            System.out.println("\nInput jari-jari" );
                            r = input.nextDouble();
                            double luaslingkar = phi * r * r;
                            System.out.printf("Luas Lingkaran = %.2f\n", luaslingkar);
                            break;
                        case 5 :
                            System.out.println("\nInput Alas");
                            a = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double luasjajar = a * t;
                            System.out.printf("Luas Jajar Genjang = %.2f\n", luasjajar);
                            break;
                        case 6 :
                            System.out.println("\nInput Sisi Atas");
                            atas = input.nextDouble();
                            System.out.println("Input Sisi Bawah");
                            bawah = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double luastrap = (atas + bawah) * 1/2 * t;
                            System.out.printf("Luas Trapesium = %.2f\n", luastrap);
                            break;
                        case 7 :
                            System.out.println("\nInput Diagonal 1");
                            d1 = input.nextDouble();
                            System.out.println("Input Diagonal 2");
                            d2 = input.nextDouble();
                            double luasketupat = (d1 * d2) / 2;
                            System.out.printf("Luas Belah Ketupat = %.2f\n", luasketupat);
                            break;
                        case 8 :
                            System.out.println("\nInput Diagonal 1");
                            d1 = input.nextDouble();
                            System.out.println("Input Diagonal 2");
                            d2 = input.nextDouble();
                            double luaslayang = (d1 * d2) / 2;
                            System.out.printf("Luas Layang-Layang = %.2f\n", luaslayang);
                            break;
                        default :
                            System.out.println("Masukkan menu yang benar");        
                } break;
                case 2 :
                    System.out.println("\n** Pilih Bangun Ruang **");
                    System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Limas");
                    System.out.println("4. Prisma");
                    System.out.println("5. Tabung");
                    System.out.println("6. Kerucut");
                    System.out.println("7. Bola");

                    System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan :");
                    bangunruang = input.nextInt();
                    switch (bangunruang) {
                        case 1 :
                            System.out.println("\nInput Panjang Sisi");
                            s = input.nextDouble();
                            double volkubus = s * s * s;
                            System.out.printf("Volume Kubus = %.2f\n", volkubus);
                            break;
                        case 2 :
                            System.out.println("\nInput Panjang");
                            p = input.nextDouble();
                            System.out.println("Input Lebar");
                            l = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double volbalok = p * l * t;
                            System.out.printf("Volume Balok = %.2f\n", volbalok);
                            break;
                        case 3 :
                            System.out.println("\nInput Luas Alas");
                            a = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double vollimas = (a * t) / 3;
                            System.out.printf("Volume Limas = %.2f\n", vollimas);
                            break;
                        case 4 :
                            System.out.println("\nInput Luas Alas");
                            a = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double volprisma = a * t;
                            System.out.printf("Volume Prisma = %.2f\n", volprisma);
                            break;
                        case 5 :
                            System.out.println("\nInput jari-jari");
                            r = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double voltabung = phi * r * r * t;
                            System.out.printf("Volume Tabung = %.2f\n", voltabung);
                            break;
                        case 6 :
                            System.out.println("\nInput jari-jari");
                            r = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double volkerucut = (phi * r * r * t) / 3;
                            System.out.printf("Volume Kerucut = %.2f\n", volkerucut);
                            break;
                        case 7 :
                            System.out.println("\nInput jari-jari");
                            r = input.nextDouble();
                            double volbola = (4 * phi * r * r * r) / 3;
                            System.out.printf("Volume Bola = %.2f\n", volbola);
                            break;
                        default :
                            System.out.println("Masukkan menu yang benar");      
                } break;
            default :
                System.out.println("Masukkan menu yang benar");
            }
        } catch(Exception error){
            System.out.println("Masukkan menu yang benar");
        }
    }
}