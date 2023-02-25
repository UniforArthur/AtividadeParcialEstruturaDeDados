package menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import estruturas.*;

public class menuVetor {
    Scanner scanMenuVetor = new Scanner(System.in);
    boolean proximaInteracao = true;
    Vetor vetor = new Vetor(scanMenuVetor.nextInt());
    
    

    public void opcoesMenuVetor() {
        int opcaoSelecionada;
        while(proximaInteracao){
            interfaceMenuVerto();
            try{
                opcaoSelecionada = scanMenuVetor.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Valor informado inválido !!!");
                aguadarTempo(3);
                opcaoSelecionada = 5;
            }

            realizarOpcaoSelecionada(opcaoSelecionada);
        }
    }
    
    private void interfaceMenuVerto() {
        System.out.print(
            "----------------------\n" +
            "|        VETOR       |\n" +
            "----------------------\n" +
            "| 1 - Inserir dado   |\n" + 
            "| 2 - Alterar dado   |\n" +
            "| 3 - Pesquisar dado |\n" +
            "| 4 - Mostrar dados  |\n" +
            "| 5 - Voltar         |\n" + 
            "----------------------\n" + 
            "Selecione a opção desejada: "
        );
    }

    private void realizarOpcaoSelecionada(int opcao) {
        switch(opcao) {
            case 1: 
                int valorInformado = 0;

                limparConsole();

                System.out.print("Digite o valor que deseja adicionar ao vetor: ");
                valorInformado = scanMenuVetor.nextInt();
                vetor.addInteiro(valorInformado);
                System.out.println("O valor " + valorInformado + " foi adicionado ao vetor.");

                break;
            case 2: 
                limparConsole();
                
                System.out.print("Informe o índice do número que deverá ser alterado: ");
                int indice = scanMenuVetor.nextInt();

                System.out.print(
                    "Informe o novo número que ocupará a posição " + indice +"\n"
                    + "no vetor: "
                );
                int novoNumero = scanMenuVetor.nextInt();

                vetor.inserirNaPosicao(indice, novoNumero);
                break;
            case 3: 
                limparConsole();

                System.out.print("Digite o número que deseja buscar no vetor: ");
                System.out.println(vetor.buscaNumero(scanMenuVetor.nextInt()));
                break;
            case 4: 
                vetor.exibeVertical();
                break;
            case 5:
                limparConsole();
                
                proximaInteracao = false;
                break;
            default:
                System.out.println("\n O valor informado não faz aparte do menu atual");
                break;
        }
    }

    private void limparConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }

    private int aguadarTempo(int tempoEmSegundos){
        try {
            TimeUnit.SECONDS.sleep(tempoEmSegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tempoEmSegundos;
    }
}
