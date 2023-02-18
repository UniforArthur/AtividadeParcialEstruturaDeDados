import java.util.Scanner;

public class menuLista {
    
    public void opcoesMenuLista() {
        int opcaoSelecionada = 0;
        Scanner scanMenuLista = new Scanner(System.in);
        
        while(opcaoSelecionada != 6){
            interfaceMenuLista();
            opcaoSelecionada = scanMenuLista.nextInt();
            verificarOpcaoSelecionada(opcaoSelecionada);
        }

        scanMenuLista.close();
    }

    public void interfaceMenuLista() {
        System.out.print(
            "----------------------\n"+
            "|        LISTA       |\n"+
            "----------------------\n"+
            "| 1 - Inserir dado   |\n"+ 
            "| 2 - Alterar dado   |\n"+
            "| 3 - Excluir dado   |\n"+
            "| 4 - Pesquisar dado |\n"+
            "| 5 - Mostrar dados  |\n"+
            "| 6 - Voltar         |\n"+
            "----------------------\n"+
            "Selecione a opção desejada: "
        );
    }

    public void verificarOpcaoSelecionada(int opcao) {
        menuPrincipal menuPrincipal = new menuPrincipal();

        if(opcao == 6) {
            menuPrincipal.opcoesMenuPrincipal();
        }

        switch(opcao){
            case 1:
                System.out.println("Inserindo dado");
                break;
            case 2:
                System.out.println("Alterando dado");
                break;
            case 3:
                System.out.println("Excluindo dado");
                break;
            case 4:
                System.out.println("Pesquisando dado");
                break;
            case 5:
                System.out.println("Mostrando dado");
                break;
            default:
                System.out.println("A opção selecionada não faz parde do menu!!!");
                break;
        }
    }
}
