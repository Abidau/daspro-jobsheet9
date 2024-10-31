import java.util.Scanner;
public class Tugas320 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        System.out.println("Menu disini ada Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng, Teh Tarik, Cappucino, Chocolate Ice");
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String mamDicari = sc.nextLine();
        int hasil = 0;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(mamDicari)) {
                hasil = i;
                break;
            }
        }

        if (hasil != 0) {
            System.out.println("Makanan " + mamDicari + "ditemukan, merupakan menu ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        sc.close();
    }
}