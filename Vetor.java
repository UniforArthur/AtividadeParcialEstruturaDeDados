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
                return "O numero buscado no vetor esta na posicao: "+ (i+1);
            }
        }
        return -1 + "     (O numero não foi encontrado no vetor)";
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
   
    public void addInteiro (int inteiro){
        this.vetorInteiros[this.tamanhoVetor] = String.valueOf(inteiro);
        this.tamanhoVetor++;
    }
}

