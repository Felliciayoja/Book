//Drive Class
import java.util.Scanner;

public  class Bukutest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inputkan judul: ");
        String nama = in.nextLine();
        System.out.println("Masukkan nama pengarang :");
        String pengarang = in.nextLine();
        System.out.println("masukkan id :");
        int id = in.nextInt();
        System.out.println("Masukkan Tahun Terbit :");
        int Tahun_Terbit = in.nextInt();

    
        //object dengan constructor parameter
        Buku Felli = new Buku("pecinta alam", 345, "jersey d", 2034);
        System.out.println("Felli Meminjam Buku : ");  
        System.out.println("Judul = "+Felli.Judul);
        System.out.println("Id = "+Felli.id);
        System.out.println("pengarang = "+Felli.Pengarang);
        System.out.println("Tahun Terbit = "+Felli.TahunTerbit);
        Buku wayuuu = new Buku("Laskar pelangi", 7689, "Laskar M", 2009 );
        System.out.println("wayuu meminjam buku : ");
        System.out.println("Judul = "+wayuuu.Judul);
        System.out.println("Id = "+wayuuu.id);
        System.out.println("pengarang = "+wayuuu.Pengarang);
        System.out.println("Tahun Terbit = "+wayuuu.TahunTerbit);
        Buku mojaa = new Buku("Bintang Merah", 9876, "Pidi baidi", 2005 );
        System.out.println("Mojaa meminjam buku : ");
        System.out.println("Judul = "+mojaa.Judul);
        System.out.println("Id = "+mojaa.id);
        System.out.println("pengarang = "+mojaa.Pengarang);
        System.out.println("Tahun Terbit = "+mojaa.TahunTerbit);
        Buku fayola = new Buku("Hold me", 3456, "laura s", 2017 );
        System.out.println("Fayola meminjam buku : ");
        System.out.println("Judul = "+fayola.Judul);
        System.out.println("Id = "+fayola.id);
        System.out.println("pengarang = "+fayola.Pengarang);
        System.out.println("Tahun Terbit = "+fayola.TahunTerbit);
        Buku Andi = new Buku("tuingkle", 4532, "Maura", 1987 );
        System.out.println("Andi meminjam buku : ");
        System.out.println("Judul = "+Andi.Judul);
        System.out.println("Id = "+Andi.id);
        System.out.println("pengarang = "+Andi.Pengarang);
        System.out.println("Tahun Terbit = "+Andi.TahunTerbit);j


        

        
    in.close();
    }

}