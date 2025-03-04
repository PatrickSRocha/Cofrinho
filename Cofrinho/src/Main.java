
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        /*int a = teclado.nextInt();*/

        Cofrinho cofrinho = new Cofrinho();

        Moeda moeda = null;

        while (true) { 
            System.out.println("   COFRINHO \n-------------- \n1-Adiciona Moeda \n2-Remove Moeda \n3-Lista Moedas \n4-Calcula o total e converte para real \n0-Encerrar \n--------------");
                
            try{
                 
                int comando = teclado.nextInt();

                if(comando == 0){
                    System.out.println("Finalizando o programa... \n");
                    break;
                }

                else if(comando==1){
            
                    while (true) {
                        
                        System.out.println("Escolha a moeda:\n1-Real \n2-Dolar \n3-Euro");
                    
                        int escolha = teclado.nextInt();
                            
                            if(escolha<0 || escolha>3){
                                throw new Exception("O tipo de moeda escolhida não existe!\n");
                            }

                        System.out.println("Escolha o valor da moeda:");

                        double valorMoeda = teclado.nextDouble();
                            
                            if(valorMoeda<=0){
                                throw new Exception("O valor da moeda não existe!\n");
                            }

                        switch (escolha) {
                            case 1: 
                                moeda = new Real(valorMoeda);
                                break;
                            case 2:
                                moeda = new Dolar(valorMoeda);
                                break;
                            case 3:
                                moeda = new Euro(valorMoeda);
                                break;
                        }

                        cofrinho.Adicionar(moeda);
                        break;
                    }
                }

                else if(comando==2){
                    while (true) { 
                            
                        System.out.println("Escolha a moeda que será removida: \n1-Real \n2-Dolar \n3-Euro");
    
                        int escolha = teclado.nextInt();

                            if(escolha<0 || escolha>3){
                                throw new Exception("O tipo de moeda escolhida não existe!\n");
                            }

                        System.out.println("Escolha o valor da moeda que será removida:");
    
                        double valorMoeda = teclado.nextDouble();
                            
                            if(valorMoeda<=0){
                                throw new Exception("O valor da moeda não existe!\n");
                            }

                        switch (escolha) {
                            case 1:
                                moeda = new Real(valorMoeda);
                                break;

                            case 2:
                                moeda = new Dolar(valorMoeda);
                                break;

                            case 3:
                                moeda = new Euro(valorMoeda);
                                break;
                        }

                        cofrinho.Remover(moeda);
                        break;
                    }
                }

                else if(comando==3){
                    cofrinho.Listar();
                }

                else if(comando==4){
                    cofrinho.TotalConvertido();
                }

                else{
                    throw new Exception("A opção escolhida não existe!\n");
                }

            }

           catch(InputMismatchException er){
                System.out.println("ERRO!! \nO sistema não aceita Strings!");
                break;
            }
            
            catch (Exception e){
                System.out.println("ERRO!!");
                System.out.println(e.getMessage());
                break;
            } 
        }
    }
}
