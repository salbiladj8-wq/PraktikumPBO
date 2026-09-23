package JS4.Tugas;

public class RekamMedis {
    private String riwayatPenyakit;
    private String diagnosa;

    public RekamMedis(String riwayatPenyakit, String diagnosa) {
        this.riwayatPenyakit = riwayatPenyakit;
        this.diagnosa = diagnosa;
    }

    public String getInfo() {
        return "Riwayat: " + riwayatPenyakit + " | Diagnosa: " + diagnosa;
    }
}
