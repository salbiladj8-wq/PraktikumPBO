package UTS;

public class PaketReguler extends Paket {
    private static final int ONGKIR_PER_KG = 10_000;
    private static final int ONGKIR_MINIMAL = 15_000;

    public PaketReguler(String resi, int beratKg) {
        super(resi, beratKg);
    }

    public PaketReguler(String resi, int beratKg, Kurir kurir) {
        super(resi, beratKg, kurir);
    }

    @Override
    public int hitungOngkir() {
        return Math.max(getBeratKg() * ONGKIR_PER_KG, ONGKIR_MINIMAL);
    }

    @Override
    public String getJenis() {
        return "Reguler";
    }
}
