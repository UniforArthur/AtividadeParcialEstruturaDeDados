import java.util.Scanner;

public class main {

public static void main(String[] args) {

    // AQUI SÃO OS MENUS JA PREPARADOS PARA SEREM IMPLEMENTADOS

    /* 
    System.out.println("----------------------\n|      1 - Vetor     |\n|      2 - Lista     |\n"+
    "----------------------\n Selecione a opção desejada: \n");

    System.out.println("\n----------------------\n|        VETOR       |\n----------------------\n| 1 - Inserir dado   | \n" + 
    "| 2 - Alterar dado   |\n| 3 - Pesquisar dado |\n| 4 - Mostrar dados  |\n| 5 - Voltar         |" + 
    "\n----------------------\n Selecione a opção desejada: ");


    System.out.print("\n----------------------\n|        LISTA       |\n----------------------\n| 1 - Inserir dado   | \n" + 
    "| 2 - Alterar dado   |\n| 3 - Excluir dado   |\n| 4 - Pesquisar dado |\n" +
    "| 5 - Mostrar dados  |\n| 6 - Voltar         |\n----------------------\n Selecione a opção desejada: "); */


    //AQUI ESTOU TESTANDO SE AS FUNÇÕES ESTÃO FUNCIONANDO ANTES DE IMPLEMENTA-LAS NO MENU
    Scanner scanner1 = new Scanner(System.in);

    Vetor vetor = new Vetor(7);
    vetor.addInteiro(scanner1.nextInt());
    System.out.println(vetor.buscaNumero(3));



    //AQUI REALIZEI TESTES QUE FUNCIONARAM NA NAVEGAÇÃO ENTRE OS MENUS 
    
/*     int opcaoVetor = 33;

    int opcaoMenu = 22;

    Scanner scanner1 = new Scanner(System.in);

    while (true){
        System.out.println("----------------------\n|      1 - Vetor     |\n|      2 - Lista     |\n"+
    "----------------------\n Selecione a opção desejada: \n");
        
        opcaoMenu = scanner1.nextInt();

        if (opcaoMenu == 0) {
            System.out.println("\n==================CALCULADORA DESLIGADA==================");
            break;
        }
        
        else if(opcaoMenu == 1) {
            
            int [] vetor = new int[10];

            while (true){
            System.out.println("\n----------------------\n|        VETOR       |\n----------------------\n| 1 - Inserir dado   | \n" + 
    "| 2 - Alterar dado   |\n| 3 - Pesquisar dado |\n| 4 - Mostrar dados  |\n| 5 - Voltar         |" + 
    "\n----------------------\n Selecione a opção desejada: ");
            opcaoVetor = scanner1.nextInt();
            
            switch (opcaoVetor){
                case 5:{
                    opcaoMenu = 0;
                    break;
                }
            }
            break;
        }

    }

    } */
    }
}
