import java.util.Scanner;
public class Tugas120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        int jumlahNilai = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];
        int total = 0;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;


        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        } for (int i = 0; i < jumlahNilai; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            } if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
        }

        double rataRata = (double) total / jumlahNilai;

        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("Rata-rata Nilai : " + rataRata);
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMahasiswa[i]);
        }

        sc.close();
    }
}