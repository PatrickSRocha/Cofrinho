public class Real extends Moeda{ //Classe subclasse Real da superclasse Moeda
    
    public Real(double valor){ //Construtor da classe Real, usa o super para puxar parâmetros da classe mãe
        super(valor);
    }
    
    @Override
    public void Info(){ //Método info sobreposta da classe mãe para mostrar informações da moeda
        System.out.printf("Real - %.2f \n",valor); //O printf foi usado para formatar como eu queria mostrar os dados da moeda
    }

    @Override
    public double Converter(){ //Método converte sobresposto da classe mãe para converter valor em real
        return this.valor*1; //valor da moeda em relação ao real, aqui seria ela em relação ao ela mesma. Mas tive de fazer
    }

    @Override
    public boolean equals(Object obj) { //Método para compara objetos
        return super.equals(obj);
    }
}
