package JS4.Tugas;

public class Resep {
    private String obat;
    private String dosis;

    public Resep(String obat, String dosis) {
        this.obat = obat;
        this.dosis = dosis;
    }

    public String getInfo() {
        return "Obat: " + obat + " (" + dosis + ")";
    }
}
