package JS2.Percobaan2;

public class TestMahasiswa {
    public static void main (String args[]) {
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim= "254107020188";
        mhs1.nama= "Salbila Dwi Juniar";
        mhs1.alamat= "Jalan kesumba";
        mhs1.kelas= "2D";
        mhs1.tampilBiodata();
        Mahasiswa mhs2=new Mahasiswa();
        mhs2.nim= "254107020171";
        mhs2.nama= "Aura Bintang";
        mhs2.alamat= "Jalan Semanggi";
        mhs2.kelas= "2H";
        mhs2.tampilBiodata();
        Mahasiswa mhs3=new Mahasiswa();
        mhs3.nim= "254107020189";
        mhs3.nama= "Najwa Adha";
        mhs3.alamat= "Jalan Semanggi Barat";
        mhs3.kelas= "2D";
        mhs3.tampilBiodata();
    }
}
