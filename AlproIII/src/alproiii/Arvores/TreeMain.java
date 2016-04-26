/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alproiii.Arvores;

/**
 *
 * @author guilhermemorescobisotto
 */
public class TreeMain {
        public static void main(String[] args) {
            
            Tree t1 = new Tree();
            System.out.println(t1);
            t1.put(10);
            System.out.println(t1);
            t1.put(3);
            System.out.println(t1);
            t1.put(20);
            System.out.println(t1);
            t1.put(40);
            System.out.println(t1);
            t1.put(4);
            System.out.println(t1);
            t1.put(2);
            System.out.println(t1);
            System.out.println("tamanho: " + t1.size());
            System.out.println("altura: " + t1.height());
        }
}
