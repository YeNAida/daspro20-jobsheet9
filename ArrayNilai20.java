import java.util.Scanner;
public class ArrayNilai20 {
    private static final String[] NilaiAkhir = null;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nilaiAkhir = new int [10];

        for(int i = 0; i < 10; i++){
            System.out.print("Masukkan Nilai Akhir Ke-"+i+":");
            nilaiAkhir[i]= input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Mahasiswa ke-" + i + (nilaiAkhir[i] < 70 ? " Tidak lulus" : " Lulus!"));
        }

    }
}