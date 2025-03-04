public class Real extends Moeda{
    
    public Real(double valor){
        super(valor);
    }
    
    @Override
    public void Info(){
        System.out.printf("Real - %.2f \n",valor);
    }

    @Override
    public double Converter(){
        return this.valor*1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
