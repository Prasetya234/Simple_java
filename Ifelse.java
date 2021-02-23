import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        
        // membuat variable belanja dan scanner
        int hasil = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input 
        System.out.print("Hasil dari 45 + 19 = ");
        hasil = scan.nextInt();

        // cek apakah dia belanja di atas 100000
        if ( hasil == 64 ) {
            System.out.println("Hore ! jawaban kamu benar ");
        } else {
            System.out.println("Maaf kamu Salah");
        }
    }
}