public class Car {
    private double reso;
    private double carburante;

    public Car (double unaResa) {
        this.resa = unaResa;
        this.carburante = 0.0;
    }

    public void addGas (double quantita) {
        if (quantita > 0){
            this.carburante += quantita;
        }
    }

    public double getGas(){
        return this.carburante;
    }

    public void drive (double km) {
        double consuma = km * this.resa;
        if(consuma <= this.carburante){
            this.carburante -=consumo;
        }else{
            System.out.println("Carburante insufficiente per fare" + km + "km");
            this.carburante = 0.0;
        }
    }

} 