package JS6.Tugas1;

public class Main {

    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("Total Sudut (1 sudut diketahui): " + sg.totalSudut(60));
        System.out.println("Total Sudut (2 sudut diketahui): " + sg.totalSudut(60, 40));

        System.out.println("Keliling Segitiga: " + sg.keliling(3, 4, 5));
        System.out.println("Sisi Miring (Pythagoras c): " + sg.keliling(3, 4));
    }
}
