public class Euro extends Moeda{ //Classe subclasse Euro da superclasse Moeda
    
    public Euro(double valor){ //Construtor da classe Euro, usa o super para puxar parâmetros da classe mãe
        super(valor);
    }

    @Override
    public void Info(){ //Método info sobreposta da classe mãe para mostrar informações da moeda
        System.out.printf("Euro - %.2f \n",valor); //O printf foi usado para formatar como eu queria mostrar os dados da moeda
    }

    @Override
    public double Converter(){ //Método converte sobresposto da classe mãe para converter valor em real
        return this.valor*6.13; //valor da moeda em relação ao real
    }

    @Override
    public boolean equals(Object obj) { //Método para compara objetos
        return super.equals(obj);
    }
}
