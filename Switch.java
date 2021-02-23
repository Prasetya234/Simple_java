import java.util.Scanner;

public class Switch {

    public static void main(String args[]) {
        Scanner masuk=new Scanner(System.in);
        int pil;
        System.out.print("Masukkan Pilihan Jurusan : ");
        pil=masuk.nextInt();
        switch(pil) {
          case 1: 
                 System.out.println("Manajemen Informatika");
                 break;
          case 2: 
                 System.out.println("Teknik Komputer");
                 break;
          case 3: 
                 System.out.println("Komputerisasi Akuntansi");
                 break;
          case 4: 
                 System.out.println("Teknik Informatika");
                 break;
 	      case 5: 
                 System.out.println("Sistem Informasi");
                 break;
          default: 
                 System.out.println("Pilihan Salah!!!");
        }
    }
}
