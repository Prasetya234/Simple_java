import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        
        // membuat variable nilai dan scanner
        int nilai = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input 
        System.out.print("Nilai Pelajaran Math: ");
        nilai = scan.nextInt();

        // cek apakah dia belanja di atas 100000
        if ( nilai > 80 ) {
            System.out.println("Kamu hebat! ");
        }

        System.out.println("Kamu harus belajar lebih giat! ");
    }
}