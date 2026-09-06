package JS2.Tugas;

public class BarangDemo {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "B001";
        brg.namaBarang = "Pensil";
        brg.hargaDasar = 3000;
        brg.diskon = 10;
        brg.tampilData();
    }
}
