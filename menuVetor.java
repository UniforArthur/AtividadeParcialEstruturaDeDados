import java.util.Scanner;

public class menuVetor {

    public void opcoesMenuVetor() {
        int opcaoSelecionada = 0;
        Scanner scanMenuVetor = new Scanner(System.in);

        while(opcaoSelecionada != 6) {
            interfaceMenuVerto();
            opcaoSelecionada = scanMenuVetor.nextInt();
            verificarOpcaoSelecionada(opcaoSelecionada);
        }

        scanMenuVetor.close();
    }
    
    public void interfaceMenuVerto() {
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

    public void verificarOpcaoSelecionada(int opcao) {
        menuPrincipal menuPrincipal = new menuPrincipal();

        if(opcao == 5) {
            menuPrincipal.opcoesMenuPrincipal();
        }

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
            default:
                System.out.println("Informe um valor válido");
                break;
        }
    }
}
