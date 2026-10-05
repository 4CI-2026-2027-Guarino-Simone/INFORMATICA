public class DistributoreBenzina (){

    private double deposito;
    private double euroPerLitro;

    public DistributoreBenzina (double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
        this.deposito = 0.0;
    }

    public void rifornisci (double unaQuantita){
        this.deposito += unaQuantita;
    }

    public void vendi (double euro, Car unAutomobile){
        double litri= euro/this.euroPerLitro;
        this.deposito -= litri;
        unAutomobile.addGas (litri);
    }

    public void aggiorna (double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
    }

    public double getDeposito(){
        return this.deposito;
    }
}
