
import java.util.InputMismatchException; //Importe necessário para usar a exceção InputMismatchException
import java.util.Scanner; //Importe necessário para usar o Scanner e pegar dados do teclado

public class Main{ //Criação da classe pública Main onde o programa vai rodar
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in); //Instância do Scanner com o objeto teclado 

        Cofrinho cofrinho = new Cofrinho(); //Instância do objeto Cofrinho como cofrinho para ser referênciado

        Moeda moeda = null; //Instância da moeda como null para fazer atribuições de valores depois

        while (true) { //loop base para rodar o código
            System.out.println("   COFRINHO \n-------------- \n1-Adiciona Moeda \n2-Remove Moeda \n3-Lista Moedas \n4-Calcula o total e converte para real \n0-Encerrar \n--------------");
            //Menu de usuário

            try{ //Tratamento de exceções para o programa
                 
                int comando = teclado.nextInt(); //Coleta dos dados do teclado para escolher qual opção será usada no cofrinho

                if(comando == 0){ //um dos ifs para criação da lógica de escolha (esse fecha o programa)
                    System.out.println("Finalizando o programa... \n");
                    break;
                }

                else if(comando==1){ //if de escolha para adicionar moeda
            
                    while (true) { //loop para escolha de moeda e valor da moeda
                        
                        System.out.println("Escolha a moeda:\n1-Real \n2-Dolar \n3-Euro"); //Menu de escolha da moeda
                    
                        int escolha = teclado.nextInt(); //Coleta de dados para escolha do tipo da moeda
                            
                            if(escolha<0 || escolha>3){ //Tratamento de exceção para o caso de escolher uma opção que não existe
                                throw new Exception("O tipo de moeda escolhida não existe!\n");
                            }

                        System.out.println("Escolha o valor da moeda:");

                        double valorMoeda = teclado.nextDouble(); //Coleta de dados para o valor da moeda
                            
                            if(valorMoeda<=0){ //Tratamento de exceção para o caso de escolher um valor negativo
                                throw new Exception("O valor da moeda não existe!\n");
                            }

                        switch (escolha) { //Loop para a criação do objeto moeda com base na escolha do usuário
                            case 1: 
                                moeda = new Real(valorMoeda); 
                                break; //Saída do loop de criação do objeto
                            case 2:
                                moeda = new Dolar(valorMoeda);
                                break;
                            case 3:
                                moeda = new Euro(valorMoeda);
                                break;
                        }

                        cofrinho.Adicionar(moeda); //Comando para usar o método Adicionar do cofrinho e por o objeto moeda no arraylist
                        break; //saída do loop para adicionar moeda 
                    }
                }

                else if(comando==2){ //if para retirar moeda, faz a mesma coisa do if 1 só que tira a moeda
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

                else if(comando==3){ //if 3 lista as moedas que foram colocadas no cofrinho
                    cofrinho.Listar();
                }

                else if(comando==4){ // if 4 mostra o total em reais das moedas no cofrinho
                    cofrinho.TotalConvertido();
                }

                else{ //Tratamento de exceção para caso algum número fora do intervalo seja escolhido
                    throw new Exception("A opção escolhida não existe!\n");
                }

            }

           catch(InputMismatchException e){ //Tratamento de exceção para caso o usuário escreva uma string em alguma das opções
                System.out.println("ERRO!! \nO sistema não aceita Strings!");
                break; //Saí do loop do programa
            }
            
            catch (Exception e){ //Tratamentoe de exceção geral 
                System.out.println("ERRO!!");
                System.out.println(e.getMessage()); //Mostra a mensagem de erro posta nos tratamentos feitos acima
                break; //Saí do loop também
            } 
        }
    }
}
