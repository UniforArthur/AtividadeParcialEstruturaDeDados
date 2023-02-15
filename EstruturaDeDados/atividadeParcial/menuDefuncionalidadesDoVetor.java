import java.util.Scanner;

public class menuDefuncionalidadesDoVetor {

    Scanner scan = new Scanner(System.in);

    public void selecionarFuncinalidade(){
        boolean continuarInteragindo = true;

        while(continuarInteragindo){
            construtorDoMenuDeVetor();
            int respostaDoUsuario = scan.nextInt();
    
            switch(respostaDoUsuario){
                case 1:
                    System.out.println("O usuário deseja inserir um novo dado no vetor");
                    break;
                case 2:
                    System.out.println("O usuário deseja alterar um dado no vetor");
                    break;
                case 3:
                    System.out.println("O usuário deseja pesquisar um dado no vetor");
                    break;
                case 4:
                    System.out.println("O usuário deseja visualizar um dado no vetor");   
                    break;
                case 5:
                    continuarInteragindo = false;
                    break;
                default:
                    System.out.println("Por favor, escolha uma opção válida");
            }
        }
    }

    public static void construtorDoMenuDeVetor() {
        System.out.println("----------------------");
        System.out.println("|       Vetor        |");
        System.out.println("----------------------");
        System.out.println("| 1 - Inserir dado   |");
        System.out.println("| 2 - Alterar dado   |");
        System.out.println("| 3 - Pesquisar dado |");
        System.out.println("| 4 - Mostar dado    |");
        System.out.println("| 5 - Voltar         |");
        System.out.println("----------------------");

        System.out.println("Selecione uma das opções acima");
    }
}
