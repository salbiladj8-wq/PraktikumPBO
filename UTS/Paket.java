package UTS;

public class Paket {
    private final String resi;
    private final int beratKg;
    private Kurir kurir;

    public Paket(String resi, int beratKg) {
        this(resi, beratKg, null);
    }

    public Paket(String resi, int beratKg, Kurir kurir) {
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat paket tidak boleh negatif.");
        }
        this.resi = resi;
        this.beratKg = beratKg;
        this.kurir = kurir;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }

    public Kurir getKurir() {
        return kurir;
    }

    public String getResi() {
        return resi;
    }

    public int hitungOngkir() {
        return 0;
    }

    public String getJenis() {
        return "Paket";
    }

    public int getBeratKg() {
        return beratKg;
    }
}
