public abstract class Moeda{
    public double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void Info();

    public abstract double Converter();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }

}
