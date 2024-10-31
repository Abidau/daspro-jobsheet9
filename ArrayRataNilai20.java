import java.util.Scanner;
public class ArrayRataNilai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            //Percobaan 3
        int[] nilaiMahasiswa = new int[10];
        double total = 0;
        double raRata;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        } for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }

        raRata = total/nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai = " + raRata);

            // Pertanyaan 1
        // int[] nilaiMahasiswa = new int[10];
        // double total = 0;
        // double raRata;
        // int jmlMahasiswaLulus = 0;

        // for (int i = 0; i < nilaiMahasiswa.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
        //     nilaiMahasiswa[i] = sc.nextInt();
        // } for (int i = 0; i < nilaiMahasiswa.length; i++) {
        //     total += nilaiMahasiswa[i];
        //     if (nilaiMahasiswa[i] > 70) {
        //         jmlMahasiswaLulus++;
        //     }
        // }

        // raRata = total/nilaiMahasiswa.length;
        // System.out.println("Rata-rata nilai = " + raRata);
        // System.out.println("Mahasiswa yang lulus = " + jmlMahasiswaLulus);

            // Pertanyaan 2
        // System.out.print("Masukkan jumlah mahasiswa : ");
        // int jmlMahasiswa = sc.nextInt();
    
        // int[] nilaiMahasiswa = new int[jmlMahasiswa];
        // double total = 0;
        // double totalTdk = 0;
        // double raRata;
        // double raRatatidakLulus;
        // int mahasiswaTdklulus = 0;
        // int mahasiswaLulus = 0;
    
        // for (int i = 0; i < nilaiMahasiswa.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
        //         nilaiMahasiswa[i] = sc.nextInt();
        //     } for (int i = 0; i < nilaiMahasiswa.length; i++) {
        //             if (nilaiMahasiswa[i] <= 70) {
        //                 totalTdk += nilaiMahasiswa[i];
        //                 mahasiswaTdklulus++;
        //             } if (nilaiMahasiswa[i] > 70) {
        //                 total += nilaiMahasiswa[i];
        //                 mahasiswaLulus++;
        //             }
        //     }
    
        // if (mahasiswaLulus > 0) {
        //     raRata = total/mahasiswaLulus;
        //     System.out.println("Rata-rata nilai mahasiswa lulus = " + raRata);
        // } if (mahasiswaTdklulus > 0) {
        //     raRatatidakLulus = totalTdk/mahasiswaTdklulus;
        //     System.out.println("Rata-rata nilai mahasiswa tidak lulus = " + raRatatidakLulus);
        // }
           
        sc.close();
    }
}