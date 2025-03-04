public class Dolar extends Moeda{ //Classe subclasse Dolar da superclasse Moeda
    
    public Dolar(double valor){ //Construtor da classe Dolar
        super(valor); //Usa o super para puxar parâmetros da classe mãe
    }

    @Override
    public void Info(){ //Método info sobreposta da classe mãe para mostrar informações da moeda
        System.out.printf("Dolar - %.2f \n",valor); //O printf foi usado para formatar como eu queria mostrar os dados da moeda
    }

    @Override
    public double Converter(){ //Método converte sobresposto da classe mãe para converter valor em real
        return this.valor*5.90; //valor da moeda em relação ao real
    }

    @Override
    public boolean equals(Object obj) { //Método para compara objetos
        return super.equals(obj);
    }
}
