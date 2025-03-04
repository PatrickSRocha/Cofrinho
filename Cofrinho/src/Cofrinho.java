import java.util.ArrayList;

public class Cofrinho {
    public Moeda moeda;

    public ArrayList<Moeda> listaMoeda = new ArrayList<>();

    public void Adicionar(Moeda m){
        listaMoeda.add(m);
    }

    public void Remover(Moeda m){
        
        listaMoeda.remove(m);
    }

    public void Listar(){
        if(listaMoeda.size() == 0){
            System.out.println("Não há nenhuma moeda no cofrinho! \n");
        }
        else{
            for (Moeda m : listaMoeda){
                m.Info();
            }
            System.out.println("");
        }
    }

    public void TotalConvertido(){
        if(listaMoeda.size() == 0){
            System.out.println("Não há nenhuma moeda no cofrinho! \n");
        }
        else{
            float i=0;
            for(Moeda m: listaMoeda){
                i+= m.Converter();
            }
            System.out.printf("Total convertido - R$ %.2f \n\n",i);
        }

        
    }
}
