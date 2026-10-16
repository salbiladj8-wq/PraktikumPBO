package UTS;

public class LabelPrinter {
    private final String model;

    public LabelPrinter(String model) {
        this.model = model;
    }

    public void cetakLabel(Paket paket) {
        if (paket == null) {
            throw new IllegalArgumentException("Paket tidak boleh null.");
        }

        Kurir kurir = paket.getKurir();
        String namaKurir = kurir == null ? "belum ditentukan" : kurir.getNama();
        System.out.println("[" + paket.getJenis() + "] " + paket.getResi()
                + " | " + paket.getBeratKg() + " kg"
                + " | Kurir: " + namaKurir
                + " | Ongkir: " + paket.hitungOngkir());
    }

    public String getModel() {
        return model;
    }
}
