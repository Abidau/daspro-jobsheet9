import java.util.Scanner;
public class Tugas220 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + " : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga " + namaPesanan[i] + " : ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("-------------------");
        System.out.println("Daftar Pesanan : ");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pilihan ke-" + (i + 1) + " adalah " + namaPesanan[i] + " dengan  harga Rp." + hargaPesanan[i]);
        }

        System.out.println("Total Biaya : "+ totalBiaya);
        System.out.println("-------------------");

        sc.close();
    }
}