import java.util.Scanner;

public class menuPrincipal {
    
    public void opcoesMenuPrincipal() {
        
        try (Scanner scanMenuPrincipal = new Scanner(System.in)) {
            while(true){
                int respostaDoUsuario;
                
                interfaceMenuPrincipal();
                respostaDoUsuario = scanMenuPrincipal.nextInt();
                selecionarOpcao(respostaDoUsuario);
            }
        }    
    }

    private void interfaceMenuPrincipal(){
        System.out.print(
            "----------------------\n"+
            "| 1 - Vetor          |\n"+
            "| 2 - Lista          |\n"+
            "----------------------\n"+
            "Selecione a opção desejada: "
        );
    }

    private void selecionarOpcao(int opcao) {
        switch(opcao) {
            case 1: 
                menuVetor menuVetor = new menuVetor(); 
                menuVetor.opcoesMenuVetor();
                break;
            case 2: 
                menuLista menuLista = new menuLista();
                menuLista.opcoesMenuLista();
                break;
            default: 
                System.out.println("\n"+"A opção selecionada não faz parte do menu atual!!!"+"\n");
                break;
        }
    }
}
