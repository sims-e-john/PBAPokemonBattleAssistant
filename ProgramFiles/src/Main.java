public class Main {
    public static void main(String[] args) {
        Move HeatWave = new Move();
        HeatWave.power = 90;
        System.out.println(HeatWave.power);

        Move BleakwindStorm = new Move();
        BleakwindStorm.power = 120;

        System.out.println(BleakwindStorm.power + ", " + HeatWave.power);
    }
}