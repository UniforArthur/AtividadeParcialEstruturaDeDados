package menu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class menuPrincipal {
    Scanner scanMenuPrincipal = new Scanner(System.in);
    boolean proximaInteracao = true;

    public void opcoesMenuPrincipal() {
        while(proximaInteracao){
            interfaceMenuPrincipal();
            int respostaDoUsuario = scanMenuPrincipal.nextInt();
            
            selecionarOpcao(respostaDoUsuario);
        }  
    }

    private void interfaceMenuPrincipal(){
        System.out.print(
            "----------------------\n"+
            "|   MENU PRINCIPAL   |\n"+
            "----------------------\n"+
            "|    1 - Vetor       |\n"+
            "|    2 - Lista       |\n"+
            "|    3 - Encerrar    |\n"+
            "----------------------\n"+
            "Selecione a opção desejada: "
        );
    }

    private void selecionarOpcao(int opcao) {
        switch(opcao) {
            case 1: 
                limparConsole();

                menuVetor menuVetor = new menuVetor(); 
                menuVetor.opcoesMenuVetor();
                break;
            case 2: 
                limparConsole();

                menuLista menuLista = new menuLista();
                menuLista.opcoesMenuLista();
                break;
            case 3:
                limparConsole();

                int tempoDeEspera = 3;

                System.out.println("O programa será encerradoem " + tempoDeEspera + " segundos.");
                aguadarTempo(tempoDeEspera);
                System.out.println("\n==================PROGRAMA ENCERRADO==================");

                proximaInteracao = false;
                break;
            default: 
                limparConsole();

                System.out.println("\n"+"A opção selecionada não faz parte do menu atual!!!"+"\n");
                break;
        }
    }

    public void limparConsole(){
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
