package mangan;

public class GrafoDirecionado extends Grafo {

	public GrafoDirecionado(int tamanho) {
		super(tamanho);
	}

	public GrafoDirecionado(String nomeDoArquivo) throws Exception {
		super(nomeDoArquivo);
	}

	public void floydWarshall() {
		// TODO: completar
	}

	public int djikstra(int origem, int destino) {
		int d[] = new int[dados.length];

		/**
		 * Entrada: grafo rotulado G com valores num�ricos n�o-negativos e um
		 * v�rtice v qualquer de G 
		 * Sa�da: vetor D com os valores das dist�ncias do menor caminho do v�rtice v para qualquer outro v�rtice u de G
		 * 
		 * Dijkstra(G, v) { 
		 *   Inicializa D[v] = 0 e, para todo u != v, D[u] = +infinito 
		 *   Inicializa a fila priorit�ria Q com todos os v�rtices u de
		 *   G usando os valores em D como chave 
		 * 
		 *   ENQUANTO Q n�o-vazia FA�A { 
		 * 	   u = Q.removeMin(); //remove o v�rtice com a menor chave
		 * 
		 *     PARA CADA v�rtice z adjacente � u tal que z est� em Q FA�A { 
		 *        SE ((D[u] + valor(u, z)) < D[z]) ENT�O { 
		 *           D[z] = D[u] + valor(u, z)
		 *           Atualiza a chave do v�rtice z em Q com o novo valor de D[z] 
		 *     }
		 *   } 
		 * }
		 *   RETORNA o vetor D 
		 * }
		 */

		return d[destino];
	}

}
