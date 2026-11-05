package JS10.Percobaan3;

public class Parkir {
    // menggunakan Pattern Matching for instanceof Java 16+
    public int hitungBiaya(Kendaraan k, int lamaJam) {
    int biaya = k.getTarifPerJam() * lamaJam;

    if (k instanceof Mobil mobil) {
        biaya += mobil.getBiayaValet();
    } else if (k instanceof Motor motor) {
        biaya += motor.getBiayaHelm();
    } else if (k instanceof Bus bus) {
        biaya += bus.getBiayaKebersihan();
    }

    return biaya;
}

    // public int hitungBiaya(Kendaraan k, int lamaJam) {
    //     int biaya = k.getTarifPerJam() * lamaJam;

    //     if (k instanceof Mobil) {
    //         biaya += ((Mobil) k).getBiayaValet();
    //     } else if (k instanceof Motor) {
    //         biaya += ((Motor) k).getBiayaHelm();
    //     }

    //     return biaya;
    // }
}
