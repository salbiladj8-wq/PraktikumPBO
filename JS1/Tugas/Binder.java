package JS1.Tugas;

public class Binder {
    private String warna;
    private int jumlahKertas;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void tambahKertas(int jumlah) {
        this.jumlahKertas += jumlah;
    }

    public void cetakInfo() {
        System.out.println("Warna Binder : " + warna);
        System.out.println("Jumlah Kertas: " + jumlahKertas + " lembar");
    }
}