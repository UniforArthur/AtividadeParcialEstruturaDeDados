import java.util.Scanner;



public class Principal {

public static void main(String[] args) {


    Scanner scanner1 = new Scanner(System.in);

    while (true){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.print("----------------------\n|      1 - Vetor     |\n|      2 - Lista     |\n|      3 - Encerrar  |\n"+
        "----------------------\n Selecione a opção desejada: \n");
        
       int  opcaoMenu = scanner1.nextInt();

        if (opcaoMenu == 3) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("\n==================PROGRAMA ENCERRADO==================");
            break;
        }
        
        else if(opcaoMenu == 1) {
            
            Vetor vetor = new Vetor(7);

            while (opcaoMenu == 1){
            System.out.print("\n----------------------\n|        VETOR       |\n----------------------\n| 1 - Inserir dado   | \n" + 
                                "| 2 - Alterar dado   |\n| 3 - Pesquisar dado |\n| 4 - Mostrar dados  |\n| 5 - Voltar         |" + 
                                "\n----------------------\n Selecione a opção desejada: ");
            int opcaoVetor = scanner1.nextInt();

           
            
            switch (opcaoVetor){
                case 1:{
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    System.out.print("\nDigite um inteiro para adicionar ao vetor: ");
                    vetor.addInteiro(scanner1.nextInt());
                    System.out.println(vetor);
                    break;
                }
                case 2: {
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    vetor.exibeVertical();
                    System.out.print("\nDigite um indice do numero a ser trocado: "); 
                    int indice = scanner1.nextInt();
                    System.out.print("\nDigite o numero que substituirá o anterior: "); 
                    int novoNumero = scanner1.nextInt();
                    vetor.inserirNaPosicao(indice - 1, novoNumero);
                    break;
                    
                }
                case 3: {
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    System.out.print("\nDigite o inteiro que deseja buscar no vetor: ");
                    System.out.println(vetor.buscaNumero(scanner1.nextInt()));
                    break;
                }

                case 4: {
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    vetor.exibeVertical();
                    break;
                }
                case 5:{
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    opcaoMenu = 55;
                    break;
                }
            }
        
        }

    }
    else if (opcaoMenu ==2){

        ListaDupEnc lista = new ListaDupEnc();

        while (opcaoMenu == 2){
            
            System.out.print("\n----------------------\n|        LISTA       |\n----------------------\n| 1 - Inserir dado   | \n" + 
            "| 2 - Alterar dado   |\n| 3 - Excluir dado   |\n| 4 - Pesquisar dado |\n" +
            "| 5 - Mostrar dados  |\n| 6 - Voltar         |\n----------------------\n Selecione a opção desejada: ");
            
            int opcaoLista = scanner1.nextInt();

            switch (opcaoLista){

                case 1: {
                    System.out.print("\nDigite o Numero que deseja inserir na Lista: ");
				    lista.insereNoInicio(scanner1.nextInt());
				    break;
                }
                case 2: {
                    lista.mostraLista();
                    System.out.print("\nDigite o índice do numero a ser trocado: ");
                    int indice = scanner1.nextInt();
                    System.out.print("\nDigite o numero a ser inserido: ");
                    int numeroNovo = scanner1.nextInt();
                    if (indice < 1 || indice > lista.getTamanho()){
                        System.out.println("Posiçao Invalida");
                    }   
                    else if (indice == lista.getTamanho()){
                        lista.removeNaPosicao(indice);
                        lista.insereNoFim(numeroNovo);
                    }
                    else {
                        lista.insereNaPosicao(numeroNovo, indice);
                        lista.removeNaPosicao(indice+1);
                    }
				    break;
                }
                case 3: {
                    lista.mostraLista();
                    System.out.print("\nDigite o indice do numero a ser removido: ");
                    int p = scanner1.nextInt();
				if (p < 1 || p > lista.getTamanho()) 
					System.out.println("Posiçao Invalida\n");
				else
					lista.removeNaPosicao(p);
				break;
                }
                case 4: {
                    System.out.print("\nDigite o numero a ser buscado: ");
                    int buscado = scanner1.nextInt();
                    lista.buscaValor(buscado);
                    break;
                }

                case 5: {
                    lista.mostraLista();
                    break;
                }
                case 6:{
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    opcaoMenu = 99;
                    break;
                }
            }
         }   

        }
    }
    scanner1.close();
    }
}