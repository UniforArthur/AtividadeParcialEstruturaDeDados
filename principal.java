import java.util.Scanner;

public class principal {

public static void main(String[] args) {

    Scanner scannerUm =  new Scanner(System.in);
    menuPrincipal menuPrincipal = new menuPrincipal();
    
    menuPrincipal.interfaceMenuPrincipal();
    
    int respostaDoUsuario = scannerUm.nextInt();
    menuPrincipal.selecionarOpcao(respostaDoUsuario);

    scannerUm.close();
    }
}
