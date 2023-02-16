public class menuPrincipal {
    
    public void interfaceMenuPrincipal(){
        System.out.println("----------------------\n|      1 - Vetor     |\n|      2 - Lista     |\n"+
        "----------------------\n Selecione a opção desejada: \n");
    }

    public void selecionarOpcao(int opcao){       
        if(opcao == 1){
            menuVetor menuVetor = new menuVetor();
            menuVetor.opcoesMenuLista();
        } else {
            System.out.println("Lista");
        }
    }
}
