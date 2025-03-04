import java.util.ArrayList; //Importe necessário para usar o arraylist

public class Cofrinho { //Criação da classe pública Cofrinho
    public Moeda moeda; //chamando a classe abstrata moeda para usar seus objetos

    public ArrayList<Moeda> listaMoeda = new ArrayList<>(); //Criação do objeto arraylist como listaMoeda

    public void Adicionar(Moeda m){ //Criação do método para adicionar moedas no cofrinho
        listaMoeda.add(m); //Método de adicionar elementos no array (o objeto m da classe moeda foi usado como parâmetro)
    }

    public void Remover(Moeda m){ //Criação do método para retirar moedas do cofrinho
        
        listaMoeda.remove(m); //Método de remover elementos do array (o objeto m da classe moeda foi usado como parâmetro)
        //Sem o equals ele não funciona...
    }

    public void Listar(){ //Criação do método para mostrar os objetos que estão no arraylist, usa o método info como base
        if(listaMoeda.size() == 0){ //Eu criei uma verificação aqui para não listar um cofrinho vázio
            System.out.println("Não há nenhuma moeda no cofrinho! \n");//Aviso para se não ouver moedas
        }
        else{
            for (Moeda m : listaMoeda){ //o laço for conta item por item e usa o info para mostrar na tela
                m.Info(); //chamando o método para demonstrar informações do objeto
            }
            System.out.println("");
        }
    }

    public void TotalConvertido(){ //Criação do método para converter valor mostrar o total em reais das moedas no cofrinho
        if(listaMoeda.size() == 0){ //Eu criei uma verificação aqui para não tentar fazer o cálculo de conversão com o cofrinho vazio
            System.out.println("Não há nenhuma moeda no cofrinho! \n"); //Aviso para se não ouver moedas
        }
        else{
            float i=0; //Iterador para guardar o valor convertido e ajudar a printar ele
            for(Moeda m: listaMoeda){//o laço for aqui converte item por item, e o iterador i guardar o valor total
                i+= m.Converter(); //Aqui é onde objeto por objeto é converte e seu valor é guardado
            }
            System.out.printf("Total convertido - R$ %.2f \n\n",i); //printa o valor total na tela
        }

        
    }
}
