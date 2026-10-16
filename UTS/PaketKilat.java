package UTS;

public class PaketKilat extends Paket {
    private static final int ONGKIR_PER_KG = 18_000;
    private static final int BIAYA_ASURANSI = 5_000;

    public PaketKilat(String resi, int beratKg) {
        super(resi, beratKg);
    }

    public PaketKilat(String resi, int beratKg, Kurir kurir) {
        super(resi, beratKg, kurir);
    }

    @Override
    public int hitungOngkir() {
        return getBeratKg() * ONGKIR_PER_KG + BIAYA_ASURANSI;
    }

    @Override
    public String getJenis() {
        return "Kilat";
    }
}
