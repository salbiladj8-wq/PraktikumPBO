package UTS;

public class Kurir {
    private final String nama;
    private final String kendaraan;

    public Kurir(String nama, String kendaraan) {
        this.nama = nama;
        this.kendaraan = kendaraan;
    }

    public String getNama() {
        return nama;
    }

    public String getKendaraan() {
        return kendaraan;
    }
}
