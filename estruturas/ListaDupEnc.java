package estruturas;

public class ListaDupEnc {
    
    private No inicio;
	private No fim;       
	private int tamanho;

	public ListaDupEnc() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

    public int setTamanho() {
		return tamanho+1;
	}

	public void alterarDado(int indice, int numeroNovo, ListaDupEnc lista){
		if (indice == lista.getTamanho()){
			lista.removeNaPosicao(indice);
			lista.insereNoFim(numeroNovo);
		}
		else if( indice >= 1 && indice <= lista.getTamanho()) {
			lista.insereNaPosicao(numeroNovo, indice);
			lista.removeNaPosicao(indice+1);
		}
		else{
			System.out.println("\n"+"O índice" + indice + " não pertence a essa lista");
		}
	}

	public void removeNaPosicao(int posicao) {
		if(posicao == 1) {
			if(tamanho == 1) {
				inicio = null;
				fim = null;
				tamanho = 0;
				return;
			}

			inicio = inicio.getProximo();
			inicio.setAnterior(null);
			tamanho--;
			return;
		}
		else if(posicao == tamanho) {
			fim = fim.getAnterior();
			fim.setProximo(null);
			tamanho--;
		}

		No noV2 = inicio.getProximo();

		for(int i = 2; i <= tamanho; i++) {
			if(i == posicao) {
				No p = noV2.getAnterior();
				No n = noV2.getProximo();
				p.setProximo(n);
				n.setAnterior(p);
				tamanho--;
				return;
			}

			noV2 = noV2.getProximo();
		}
	}

	public void insereNaPosicao(int valor, int pos) {
		No noV1 = new No(valor, null, null);

		if (pos == 1) {
			inserirNoInicio(valor);
			return;
		}

		No noV2 = inicio;
		for(int i = 2; i <= tamanho; i++) {
			if (i == pos) {
				No tmp = noV2.getProximo();
				noV2.setProximo(noV1);
				noV1.setAnterior(noV2);
				noV1.setProximo(tmp);
				tmp.setAnterior(noV1);
			}
			noV2 = noV2.getProximo();
		}
		tamanho++;
	}

	public void inserirNoInicio(int valor) {
		No noV1 = new No(valor, null, null);

		if (checarListaVazio()) {
			inicio = noV1;
			fim = inicio;
		} else {
			inicio.setAnterior(noV1);
			noV1.setProximo(inicio);
			inicio = noV1;
		}
		tamanho++;
	}

	public void insereNoFim(int valor) {
		No noV1 = new No(valor, null, null);

		if (checarListaVazio()) {
			inicio = noV1;
			fim = inicio;
		} else {
			noV1.setAnterior(fim);
			fim.setProximo(noV1);
			fim = noV1;
		}
		tamanho++;
	}

	public boolean checarListaVazio() {
		return inicio == null;
	}

	public void mostrarNaLista() {
		System.out.print("\nLista Duplamente Ligada = ");

		if (tamanho == 0) {
			System.out.print("Lista Vazia\n");
			return;
		}
		else if (inicio.getProximo() == null) {
			System.out.print("[" + inicio.getDado() + "]");
			return;
		}

		System.out.print(" [" + inicio.getDado() + ", ");
		montarLista();
		System.out.println("]");
	}

	public void montarLista(){
		No noV2 = inicio;
		noV2 = inicio.getProximo();
		while(noV2.getProximo() != null) {
			System.out.print(noV2.getDado() + ", ");
			noV2 = noV2.getProximo();
		}
		System.out.print(noV2.getDado());
	}
    
	public void buscaValor (int valor){
        
		if (tamanho == 0) {
			System.out.print("LISTA VAZIA");
		}

        No noV2 = inicio;

        int count = 1;

		while(noV2.getProximo() != null) {
            if(noV2.getDado() == valor){
                System.out.println("Valor achado!  " + count);
                break;}
			else{
				count++;
                noV2 = noV2.getProximo();
			}
        } 
		
		if (noV2.getDado() == valor && noV2.getProximo() == null){
                 System.out.println("Valor achado!   Seu indíce na lista é o [" + count +"]"); 
        }
        else if (noV2.getDado() != valor){
            System.out.println( -1  + "      (O valor buscado nao consta na List)");
        }       
	}
}
