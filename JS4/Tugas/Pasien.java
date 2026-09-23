package JS4.Tugas;

public class Pasien {
    private String nama;
    private RekamMedis rekamMedis;
    private Resep resep;

    public Pasien(String nama, String riwayatPenyakit, String diagnosa) {
        this.nama = nama;
        // komp
        this.rekamMedis = new RekamMedis(riwayatPenyakit, diagnosa);
    }

    // agre
    public void setResep(Resep resep) {
        this.resep = resep;
    }

    // dep
    public void cetakNota(PrinterNota printer) {
        String isiNota = "Pasien: " + nama + "\n" +
                         "Rekam Medis: " + rekamMedis.getInfo() + "\n" +
                         (resep != null ? "Resep: " + resep.getInfo() : "Resep: Tidak Ada");
        printer.cetak(isiNota);
    }

    public void tampilkanProfile() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("Rekam Medis: " + rekamMedis.getInfo());
        if (resep != null) {
            System.out.println("Resep Obat: " + resep.getInfo());
        }
    }
}
