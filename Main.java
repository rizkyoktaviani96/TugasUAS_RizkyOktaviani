/**
 * Created by lenovo on 7/7/2015.
 */
public class Main {
    public static void main(String[] args) {

        //Liga
        Liga Vohisma = new Liga("Vohisma");

        //Divisi
        Divisi TI = new Divisi("divisi TI",Vohisma);
        Divisi NonTI = new Divisi("NonTI",Vohisma);

        //Club
        Club Animasi = new Club("Animasi",TI,Vohisma);
        Club TKJ = new Club("TKJ",TI,Vohisma);
        Club Kkr = new Club("Kkr",NonTI,Vohisma);
        Club Kky = new Club("Kky",NonTI,Vohisma);

        Vohisma.setDaftarDivisi(TI);
        Vohisma.setDaftarDivisi(NonTI);

        TI.setDaftarClub(Animasi);
        TI.setDaftarClub(TKJ);
        NonTI.setDaftarClub(Kkr);
        NonTI.setDaftarClub(Kky);

        //soal 1. Get daftar divisi by nama liga

        System.out.println("Menampilkan Soal Nomer 1 :");
        System.out.println("Divisi Liga Vohisma : ");
        Vohisma.getDaftarDivisi("Vohisma");
        System.out.println();

        //soal 2. Get Daftar Club by nama liga

        System.out.println("Menampilkan Soal Nomer 2 :");
        System.out.println("Klub Liga Vohisma : ");
        TI.getDaftarClubLiga("Vohisma");
        System.out.println();

        //soal 3. Get Daftar Club by nama Divisi

        System.out.println("Menampilkan Soal Nomer 3 :");
        System.out.println("Club Liga Vohisma : ");
        TI.getDaftarClubDivisi("Vohisma");
        System.out.println("Liga Vohisma : ");
        NonTI.getDaftarClubDivisi("Vohisma");
        System.out.println();

        //soal 4. Get Club ini berada di divisi mana by nama Club

        System.out.println("Menampilkan Soal Nomer 4 :");
        Animasi.getDivisi("Animasi");
        TKJ.getDivisi("TKJ");
        System.out.println();

        //soal 5. Get Club ini berada di liga apa by nama Club

        System.out.println("Menampilkan Soal Nomer 5 :");
        Animasi.getLiga("Animasi");

        System.out.println("Tugas UAS Rizky Oktaviani");
        System.out.println("1431140053");
    }
}
