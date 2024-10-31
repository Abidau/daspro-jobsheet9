import java.util.Scanner;
public class SearchNilai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Percobaan 4
        int [] arrayNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;

        for (int i = 0; i < arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        System.out.println();

            //Pertanyaan 2
        // System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        // int jmlInput = sc.nextInt();

        // int key = 0;
        // int hasil = 0;

        // int[] arrayNilai = new int[jmlInput];

        // for (int i = 0; i < jmlInput; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
        //     arrayNilai[i] = sc.nextInt();
        // } 
        
        // System.out.print("Masukkan nilai yang dicari : ");
        // key = sc.nextInt();

        // for (int i = 0; i < jmlInput; i++) {
        //     if (key == arrayNilai[i]) {
        //         hasil = i;
        //         break;
        //     }
        // }

        // if (hasil != 0) {
        //     System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        // }

            //Percobaan 3
        // System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        // int jmlInput = sc.nextInt();
        
        // int key = 0;
        // int hasil = 0;
        
        // int[] arrayNilai = new int[jmlInput];
        
        // for (int i = 0; i < jmlInput; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
        //         arrayNilai[i] = sc.nextInt();
        // } 
                
        // System.out.print("Masukkan nilai yang dicari : ");
        // key = sc.nextInt();
        
        // for (int i = 0; i < jmlInput; i++) {
        //     if (key == arrayNilai[i]) {
        //         hasil = i;
        //         break;
        //     }
        // }
        
        // if (hasil != 0) {
        //     System.out.println("Nilai " + key + "ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        // } else {
        //     System.out.println("Nilai yang dicari tidak ditemukan");
        // }
    
        sc.close();
    }
}