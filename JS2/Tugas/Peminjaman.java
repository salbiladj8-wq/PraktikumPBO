package JS2.Tugas;

public class Peminjaman {
    public String id, nmMember, nmGame;
    public int harga, lamaSewa;

    public int hargaBayar() {
        return lamaSewa * harga;
    }

    public void tampilData() {
        System.out.println("ID Member : " + id);
        System.out.println("Nama Member : " + nmMember);
        System.out.println("Nama Game : " + nmGame);
        System.out.println("Harga Sewa : " + harga);
        System.out.println("Lama Sewa : " + lamaSewa);
        System.out.println("Total Bayar : " + hargaBayar());
    }
}
