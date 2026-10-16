package UTS;

public class AreaPenyimpanan {
    private static final int KAPASITAS_MAKSIMAL = 3;

    private final String kode;
    private final Paket[] daftarPaket;
    private int jumlah;

    public AreaPenyimpanan(String kode) {
        this.kode = kode;
        this.daftarPaket = new Paket[KAPASITAS_MAKSIMAL];
    }

    public boolean simpan(Paket paket) {
        if (paket == null) {
            throw new IllegalArgumentException("Paket tidak boleh null.");
        }
        if (isiPenuh()) {
            return false;
        }

        daftarPaket[jumlah] = paket;
        jumlah++;
        return true;
    }

    public boolean isiPenuh() {
        return jumlah == daftarPaket.length;
    }

    public int totalBerat() {
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += daftarPaket[i].getBeratKg();
        }
        return total;
    }

    public String getKode() {
        return kode;
    }

    public int getJumlah() {
        return jumlah;
    }
}
