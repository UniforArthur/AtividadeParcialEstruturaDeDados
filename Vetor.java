public class Vetor {

    private String[] vetorInteiros;

    private int tamanhoVetor;
    
    public Vetor(int capacidadeVetor){
        this.vetorInteiros = new String[capacidadeVetor];
        this.tamanhoVetor = 0;
    }

    public String buscaNumero(int numero){
       // String s;
        for (int i = 0; i<this.tamanhoVetor; i++){
            if(Integer.parseInt(this.vetorInteiros[i]) == numero){
                return "\n O numero buscado no vetor esta na posicao: "+ (i+1);
            }
        }
        return -1 + "     (O numero não foi encontrado no vetor)";
    }

    public void exibeVertical (){
        StringBuilder s = new StringBuilder();
        System.out.println("\n------ Lista de Dados no Vetor --------");
        for (int i = 0; i < this.tamanhoVetor; i++){
            s.append((i+1) + "- [");
            s.append(vetorInteiros[i] + "]\n");
        }   
        System.out.println(s);
        
    }

    public void inserirNaPosicao(int indice, int novoNumero){
        removerNumero(indice);
        for (int i = this.tamanhoVetor-1; i >= indice; i--){
            this.vetorInteiros[i+1] = this.vetorInteiros[i];
        }   
        this.vetorInteiros[indice] = String.valueOf(novoNumero);
        //this.tamanhoVetor++;
    }
    

    public void removerNumero(int indice){
        for(int i = indice; i<this.tamanhoVetor-1; i++){
            this.vetorInteiros[i] = this.vetorInteiros[i+1];
        }
    }

        // System.out.println("Selecione qual índice do vetor deseja trocar");
        // for (int i=0; i<this.tamanhoVetor; i++) {
        // s = this.vetorInteiro[i]
        // System.out.println(String.valueOf(i) + " - " String.valueof()this.vetorInteiros[i]);
        // }
    //public int alterarNumero(int numero) {

    //}
   
    public void addInteiro (int inteiro){
        this.vetorInteiros[this.tamanhoVetor] = String.valueOf(inteiro);
        this.tamanhoVetor++;
    }

    public String toString(){
        
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanhoVetor-1; i++){
            s.append(vetorInteiros[i]);
            s.append(", ");
        }
        if(this.tamanhoVetor>0){
            s.append(vetorInteiros[this.tamanhoVetor-1]);
        }
        s.append("]");

        return s.toString();
    }
}

