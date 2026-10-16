package UTS;

public class Gudang {
    private final String nama;
    private final AreaPenyimpanan[] daftarArea;
    private Pegawai kepala;

    public Gudang(String nama, int jumlahArea) {
        if (jumlahArea <= 0) {
            throw new IllegalArgumentException("Gudang harus memiliki minimal satu area.");
        }

        this.nama = nama;
        this.daftarArea = new AreaPenyimpanan[jumlahArea];
        for (int i = 0; i < jumlahArea; i++) {
            daftarArea[i] = new AreaPenyimpanan("A-" + (i + 1));
        }
    }

    public void setKepala(Pegawai kepala) {
        this.kepala = kepala;
    }

    public void simpan(Paket paket, int nomorArea) {
        if (nomorArea < 1 || nomorArea > daftarArea.length) {
            throw new IndexOutOfBoundsException("Nomor area tidak tersedia: " + nomorArea);
        }
        if (!daftarArea[nomorArea - 1].simpan(paket)) {
            System.out.println("Area " + daftarArea[nomorArea - 1].getKode() + " penuh; paket tidak disimpan.");
        }
    }

    public void tampilInfo() {
        String namaKepala = kepala == null ? "belum ditentukan" : kepala.getNama();
        System.out.println("Gudang " + nama + " (kepala: " + namaKepala + ")");
        for (AreaPenyimpanan area : daftarArea) {
            System.out.println(area.getKode() + ": " + area.getJumlah()
                    + " paket, " + area.totalBerat() + " kg");
        }
    }
}
