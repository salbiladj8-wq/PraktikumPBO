package JS2.Tugas;

public class PeminjamanDemo {
    public static void main(String[] args) {
        Peminjaman pmj = new Peminjaman();
        pmj.id = "M001";
        pmj.nmMember = "Salbila";
        pmj.nmGame = "Free Fire";
        pmj.harga = 5000;
        pmj.lamaSewa = 3;
        pmj.tampilData();
    }
}
