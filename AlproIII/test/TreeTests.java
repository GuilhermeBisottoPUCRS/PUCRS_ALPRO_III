/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import alproiii.Arvores.Tree;
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
public class TreeTests {
    
//    @Test
//    public void testChaveDuplicada() {
//        Tree t = new Tree();
//        t.put(10);
//        t.put(30);
//        t.put(20);
//        t.put(30);
//        
//    }
    
    @Test
    public void testArvoreComTamanhoZero() {
        Tree t = new Tree();
        int expected = 0;
        int actual = t.size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArvoreComTamanhoUm() {
        Tree t = new Tree();
        t.put(10);
        t.put(0);
        t.put(20);
        int expected = 0;
        int actual = t.size();
        assertEquals(expected, actual);
    }
}
