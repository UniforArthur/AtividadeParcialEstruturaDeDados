package menu;

import java.util.Scanner;
import estruturas.*;

public class menuLista {
    ListaDupEnc lista = new ListaDupEnc();
    Scanner scanMenuLista = new Scanner(System.in);
    boolean proximaInteracao = true;

    public void opcoesMenuLista() {
        while(proximaInteracao){
            interfaceMenuLista();
            int opcaoSelecionada = scanMenuLista.nextInt();

            realizarOpcaoSelecionada(opcaoSelecionada);
        }
    }

    public void interfaceMenuLista() {
        System.out.print(
            "\n ----------------------"+
            "\n |        LISTA       |"+
            "\n ----------------------"+
            "\n | 1 - Inserir dado   |"+ 
            "\n | 2 - Alterar dado   |"+
            "\n | 3 - Excluir dado   |"+
            "\n | 4 - Pesquisar dado |"+
            "\n | 5 - Mostrar dados  |"+
            "\n | 6 - Voltar         |"+
            "\n ----------------------"+
            "\n Selecione a opção desejada: "
        );
    }

    public void realizarOpcaoSelecionada(int opcao) {

        switch(opcao){
            case 1:
                limparConsole();

                System.out.println("Digite o número que deverá ser inserido na lista: ");
                lista.inserirNoInicio(scanMenuLista.nextInt());
                break;
            case 2:
                limparConsole();

                System.out.print("\nDigite o índice do numero a ser trocado: ");
                int indice = scanMenuLista.nextInt();
                System.out.print("\nDigite o numero a ser inserido: ");
                int numeroNovo = scanMenuLista.nextInt();

                lista.alterarDado(indice, numeroNovo, lista);
                break;
            case 3:
                limparConsole();

                lista.mostrarNaLista();
                
                System.out.print("\nDigite o indice do numero a ser removido: ");
                int numero = scanMenuLista.nextInt();
                if (numero < 1 || numero > lista.getTamanho()){
                    System.out.println("Posiçao Invalida\n");    
                } else {
                    lista.removeNaPosicao(numero);
                }
                break;
            case 4:
                limparConsole();

                System.out.println("Digite o número que deverá ser bucado na lista: ");
                lista.buscaValor(scanMenuLista.nextInt());
                break;
            case 5:
                limparConsole();

                lista.mostrarNaLista();
                break;
            case 6:
                limparConsole();
                
                proximaInteracao = false;
                break;
            default:
                limparConsole();
                
                System.out.println("A opção selecionada não faz parde do menu!!!");
                break;
        }
    }

    private void limparConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }
}
