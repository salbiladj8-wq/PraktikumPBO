package id.ac.polinema.sewagear;

/** Hasil perhitungan biaya satu kali sewa. */
public class RincianBiaya {
    private int sewa;
    private int cuci;
    private int asuransi;
    private int potongan;
    private int biayaKalibrasi; 

    public RincianBiaya(int sewa, int cuci, int asuransi, int potongan, int biayaKalibrasi) {
        this.sewa = sewa;
        this.cuci = cuci;
        this.asuransi = asuransi;
        this.potongan = potongan;
        this.biayaKalibrasi = biayaKalibrasi; // Inisialisasi biaya kalibrasi
    }

    public int getSewa() { return sewa; }
    public int getCuci() { return cuci; }
    public int getAsuransi() { return asuransi; }
    public int getPotongan() { return potongan; }
    public int getBiayaKalibrasi() { // Getter untuk biaya kalibrasi
        return biayaKalibrasi; 
    }

    public int getTotal() { 
        return sewa + cuci + asuransi - potongan + biayaKalibrasi;
    }
}
