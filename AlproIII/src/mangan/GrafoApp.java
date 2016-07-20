package mangan;

public class GrafoApp {

	public static void main(String[] args) throws Exception {
		System.out.println("Grafos");
		
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g7.txt");
	
		System.out.println(g.percursoProfundidade(0));
                System.out.println(g.percursoLargura(0));
                
//		System.out.println(g.mstKruskal());
//                System.out.println(g.mstPrim());
	}
}
