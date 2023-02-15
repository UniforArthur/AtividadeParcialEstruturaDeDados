import java.util.Scanner;

public class menuDeFuncionalidadesDaLista {
    
    Scanner scan = new Scanner(System.in);

    public void selecionarFuncinalidade(){
        boolean continuarInteragindo = true;

        while(continuarInteragindo){
            construtorDoMenuDeVetor();
            int respostaDoUsuario = scan.nextInt();
    
            switch(respostaDoUsuario){
                case 1:
                    System.out.println("O usuário deseja inserir um novo dado da lista");
                    break;
                case 2:
                    System.out.println("O usuário deseja alterar um dado da lista");
                    break;
                case 3:
                    System.out.println("O usuário deseja Exclir um dado da lista");   
                    break;
                case 4:
                    System.out.println("O usuário deseja pesquisar um dado da lista");
                    break;
                case 5:
                    System.out.println("O usuário deseja visualizar um dado da lista");   
                    break;
                case 6:
                    continuarInteragindo = false;
                    break;
                default:
                    System.out.println("Por favor, escolha uma opção válida");
            }
        }
    }

    public static void construtorDoMenuDeVetor() {
        System.out.println("----------------------");
        System.out.println("|       Lista        |");
        System.out.println("----------------------");
        System.out.println("| 1 - Inserir dado   |");
        System.out.println("| 2 - Alterar dado   |");
        System.out.println("| 3 - Excluir dado   |");
        System.out.println("| 4 - Pesquisar dado |");
        System.out.println("| 5 - Mostar dado    |");
        System.out.println("| 6 - Voltar         |");
        System.out.println("----------------------");

        System.out.print("Selecione uma das opções acima:");
    }
}
