package JS2.Tugas;

public class MainArray {
    public static void main(String[] args) {
        int [] angka = {1, 2, 3};
        System.out.println("Awal Program");
        try{
            System.out.println(angka[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:Indeks melebihi batas array");
        }
        System.out.println("Akhir Program");
    }
}
