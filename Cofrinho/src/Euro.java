public class Euro extends Moeda{
    public Euro(double valor){
        super(valor);
    }

    @Override
    public void Info(){
        System.out.printf("Euro - %.2f \n",valor);
    }

    @Override
    public double Converter(){
        return this.valor*6.13;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
