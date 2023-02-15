package src;
import java.util.Scanner;

public class menuInicial {

    Scanner scan = new Scanner(System.in);
    menuDefuncionalidadesDoVetor menuVetor = new menuDefuncionalidadesDoVetor();
    menuDeFuncionalidadesDaLista menuLista = new menuDeFuncionalidadesDaLista();

    int respostaDoUsuario = 0;
    boolean continuarExecutando = true;
    
    public void realizarInteracaoDoUsuario(){
        while(continuarExecutando){
            construtorDeMenuInicial();
            respostaDoUsuario = scan.nextInt();
            
            switch (respostaDoUsuario){
                case 1:
                    menuVetor.selecionarFuncinalidade();
                    break;
                case 2:
                    menuLista.selecionarFuncinalidade();;
                    break;
                case 3:
                    System.out.println("Até mais!!!");
                    continuarExecutando = false;
                    break;
                default:
                    System.out.println("Desculp o valor" + respostaDoUsuario + "não é válido");
            }
        }
    }


    public static void construtorDeMenuInicial() {
        System.out.println("---------------");
        System.out.println("| 1 - Vetor   |");
        System.out.println("| 2 - Lista   |");
        System.out.println("| 3 - Sair    |");
        System.out.println("---------------");
    }
}
