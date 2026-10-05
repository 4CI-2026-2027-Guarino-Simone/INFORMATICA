public class Test {
    public static void main (String[] args) {
    DistributoreBenzina pompa = new DistributoreBenzina (200);
    pompa.rifornisci(500);

    Car auto = new Car(0,05);
    pompa vendi (40, auto);
    System.out.println("Litri nell'auto dopo aver fatto rifornimento: " + auto.getGas());
    auto.drive(200);

    System.out.println("Litri nell'auto dopo 200km: "+ auto.getGas());

    System.out.println("Litri rimasti nella pompa: " + pompa.getDeposito());
    }
}