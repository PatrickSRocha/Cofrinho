public class Dolar extends Moeda{
    
    public Dolar(double valor){
        super(valor);
    }

    @Override
    public void Info(){
        System.out.printf("Dolar - %.2f \n",valor);
    }

    @Override
    public double Converter(){
        return this.valor*5.90;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
