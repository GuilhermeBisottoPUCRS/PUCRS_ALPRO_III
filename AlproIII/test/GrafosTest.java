/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import mangan.Grafo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guilhermemorescobisotto
 */
public class GrafosTest {
    
    public GrafosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    	@Test
	public void testG1() throws Exception {
		Grafo g = new Grafo("g1.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG2() throws Exception {
		Grafo g = new Grafo("g2.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	

	@Test
	public void testG3() throws Exception {
		Grafo g = new Grafo("g3.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(1);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	

	@Test
	public void testG4() throws Exception {
		Grafo g = new Grafo("g4.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	

	@Test
	public void testG5() throws Exception {
		Grafo g = new Grafo("g5.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(4);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testG6Largura() throws Exception {
		Grafo g = new Grafo("g6.txt");
		List<Integer> expected = new ArrayList<>();
		for (int i = 0; i <= 9; i++) {
			expected.add(i);
		}
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testG6Profundidade() throws Exception {
		Grafo g = new Grafo("g6.txt");
		String expected = "[0, 1, 2, 5, 6, 3, 7, 4, 8, 9]";
		String actual = g.percursoProfundidade(0).toString();
		assertEquals(expected, actual);
	}
}
