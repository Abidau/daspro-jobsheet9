import java.util.Scanner;
public class ArrayNilai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

            //Percobaan 2
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " :");
            nilaiAkhir[i] =sc.nextInt();
        } for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }

            // Pertanyaan 1
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // } for (int i = 0; i < 10; i++) {
        //         System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        //     }

            // Pertanyaan 3
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // } for (int i = 0; i < nilaiAkhir.length; i++) {
        //     if (nilaiAkhir[i] > 70) {
        //         System.out.println("Nilai akhir ke-" + i + " lulus!");        
        //     }
        // }

            // Pertanyaan 4
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // } for (int i = 0; i < nilaiAkhir.length; i++) {
        //     if (nilaiAkhir[i] > 70) {
        //         System.out.println("Nilai akhir ke-" + i + " lulus!");        
        //     } else if (nilaiAkhir[i] <= 70) {
        //         System.out.println("Nilai akhir ke-" + i + " tidak lulus!");
        //     }
        // }

        sc.close();
    }
}