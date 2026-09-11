package JS3.MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        //pengurangan kecepatan agar tidak bernilai minus
        motor.kurangiKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
