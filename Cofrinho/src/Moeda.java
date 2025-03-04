public abstract class Moeda{ //Classe abstrata Moeda
    public double valor; //Criação do parametro valor que será usados pelas filhas, na classe Cofrinho e na classe Main

    public Moeda(double valor) { //Construtor da classe abstrata Moeda
        this.valor = valor; //Usa o this. pois faz referência ao valor que foi atribuido dentro dessa classe abstrata
    }

    public abstract void Info(); //Método abstrato que deve ser chamado nas filhas para mostrar informações

    public abstract double Converter(); //Método abstrato que deve ser chamado nas filhas para converter valor

    @Override
    public boolean equals(Object obj) { //Método equals que as filhas irão puxar para fazer comparação entre objetos
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
