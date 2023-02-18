public class ListaDupEnc {
    
    private No inicio;
	private No fim;             //Atributos que cada elemento da Lista conterá, incluindo um controle de tamanho
	private int tamanho;

    //Construtor Inicial
	public ListaDupEnc() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	//Checa se a Lista não está vazia
	public boolean estaVazio() {
		return inicio == null;
	}

	//Controle de tamanho da Lista
	public int getTamanho() {
		return tamanho;
	}

    public int setTamanho() {
		return tamanho+1;
	}

	//Insere numeros no Inicio da Lista

	public void insereNoInicio(int valor) {
		No noV1 = new No(valor, null, null);
		if (inicio == null) {
			inicio = noV1;
			fim = inicio;
		} else {
			inicio.setAnterior(noV1);
			noV1.setProximo(inicio);
			inicio = noV1;
		}
		tamanho++;
	}

	//Insere numeros no fim da Lista

	public void insereNoFim(int valor)

	{

		No noV1 = new No(valor, null, null);

		if (inicio == null) {
			inicio = noV1;
			fim = inicio;
		} else {
			noV1.setAnterior(fim);
			fim.setProximo(noV1);
			fim = noV1;
		}
		tamanho++;
	}

	//Inserimos um No no indice indicado

	public void insereNaPosicao(int valor, int pos) {
		No noV1 = new No(valor, null, null);
		if (pos == 1) {
			insereNoInicio(valor);
			return;
		}
		No noV2 = inicio;
		for (int i = 2; i <= tamanho; i++) {
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

	// Funcao que remove um No no indice escolhido 

	public void removeNaPosicao(int pos) {
		if (pos == 1) {
			if (tamanho == 1) {
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

		if (pos == tamanho) {
			fim = fim.getAnterior();
			fim.setProximo(null);
			tamanho--;
		}

		No noV2 = inicio.getProximo();

		for (int i = 2; i <= tamanho; i++) {
			if (i == pos) {
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

	//Funcao que mostra a Lista de Valores da Lista

	public void mostraLista() {
		System.out.print("\nLista Duplamente Ligada = ");

		if (tamanho == 0) {
			System.out.print("Lista Vazia\n");
			return;
		}

		if (inicio.getProximo() == null) {
			System.out.print("[" + inicio.getDado() + "]");
			return;
		}

		No noV2 = inicio;
		System.out.print(" [" + inicio.getDado() + ", ");
		noV2 = inicio.getProximo();

		while (noV2.getProximo() != null) {
			System.out.print(noV2.getDado() + ", ");
			noV2 = noV2.getProximo();
		}
		System.out.print(noV2.getDado() + "]");
	}
    
	public void buscaValor (int valor){
        
		if (tamanho == 0) {
			System.out.print("-1   (LISTA VAZIA");
		}

        No noV2 = inicio;

        int count = 1;

		while (noV2.getProximo() != null) {
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
