/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alproiii.Arvores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilhermemorescobisotto
 */
public class Tree {

    private class Node {
        
        private int key;
        
        private Node right;
        private Node left;
        
        private Node(int key) {
            this.key = key;
        }
    }
    
    private Node root;
    
    public void put(int key) {
        root = put0(root, key);
    }
    
    private Node put0(Node node, int key) {
        
        if (node == null) 
          return new Node(key);  
      
        if (node.key < key)
            node.right = put0(node.right, key);
        else if (node.key > key)
            node.left = put0(node.left, key);
        else
            throw new IllegalArgumentException("chave duplicada");
           
        return node;
    }
    
    @Override
    public String toString() {
        List<Integer> keys = new ArrayList<>();
        toString0(root, keys);
        return keys.toString();
    }
    
    private void toString0(Node node, List<Integer> keys) {
        if (node == null) 
          return;  
        
        //Percurso Central, mostra arvore de forma ordenada.
        toString0(node.left, keys);
        keys.add(node.key);
        toString0(node.right, keys);
        
        //Pré fixado: primeiro a chave depois as chamadas
        //Pós fixado: primeiro as chamadas depois a chave
    }
    
    public int size() {
        return size0(root);
    }
    
    private int size0(Node node) {
        if (node == null)
            return 0;
        return 1 + size0(node.left) + size0(node.right);
    }
    
    public int height() {
        //vazia -1
        // só a raiz 0
        return height0(root);
    }
    
    private int height0(Node node) {
        return node == null ? -1 : 1 + Math.max(height0(node.left), height0(node.right));
    }
    
}
