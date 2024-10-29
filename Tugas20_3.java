import java.util.Scanner;

public class Tugas20_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        
        System.out.println(" ----- Daftar menu di kedai Yolo ------");


        for (int i = 0; i < menu.length; i++) {
            System.out.println("- " + menu[i]);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = input.nextLine();


        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }


        System.out.println("Menu \"" + makananDicari + "\" "
                        + (ditemukan ? "tersedia di menu" : " Tidak tersedia di menu "));
    }
}