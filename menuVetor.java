import java.util.Scanner;

public class menuVetor {
    
    public void opcoesMenuLista(){
        boolean voltarParaOMeuAnterior = false;
        Scanner scanner2 = new Scanner(System.in);

        while(!voltarParaOMeuAnterior){
            interfaceMenuVerto();
            int opcaoSelecionada = scanner2.nextInt();
            verificarOpcaoSelecionada(opcaoSelecionada);
        }

        scanner2.close();
    }
    
    public void interfaceMenuVerto(){
        System.out.println("\n----------------------\n|        VETOR       |\n----------------------\n| 1 - Inserir dado   | \n" + 
        "| 2 - Alterar dado   |\n| 3 - Pesquisar dado |\n| 4 - Mostrar dados  |\n| 5 - Voltar         |" + 
        "\n----------------------\n Selecione a opção desejada: ");
    }

    public void verificarOpcaoSelecionada(int opcao){
        switch(opcao) {
            case 1: 
                System.out.println("Inserir dado");
                break;
            case 2: 
                System.out.println("Alterar dado");
                break;
            case 3: 
                System.out.println("Pesquisar dado");
                break;
            case 4: 
                System.out.println("Mostar dados");
                break;
            case 5: 
                System.out.println("Voltar");
                break;
            default:
                System.out.println("Informe um valor válido");
                break;
        }
    }
    
}
