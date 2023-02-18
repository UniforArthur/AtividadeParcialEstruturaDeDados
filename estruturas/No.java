package estruturas;

public class No {


    private int dado;
	private No proximo;     //Variaveis dos Nós com Referência Posterior e Anterior
	private No anterior;

    public No() {   //Construtor do Nó inicial
		proximo = null;
		anterior = null;
		dado = 0;
	}

    public No(int d, No post, No ant) { //Construtor dos demais Nós
		dado = d;
		proximo = post;
		anterior = ant;
	}
    	// Abaixo Funcoes Getters e Setters para acessar as variaveis

	public void setProximo(No post) {
		proximo = post;
	}

	public void setAnterior(No ant) {
		anterior = ant;
	}

	public No getProximo() {
		return proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setDado(int d) {
		dado = d;
	}
    
	public int getDado() {
		return dado;
	}
}

