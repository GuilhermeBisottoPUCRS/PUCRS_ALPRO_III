/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alproiii.Ordenacao;

import java.util.Random;

/**
 *
 * @author guilhermemorescobisotto
 */
public class OrdenacaoMain {    
    
    private static int[] initVetor(int quantidade) {
        int [] vet = new int[1000];
        Random gerador = new Random();
        
        for (int j = 0; j < quantidade; j++)
            for (int i = 0; i < 1000; i++)
                vet[i] = (int) (1 + Math.random() * 1000);
        
        return vet;
    }
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("alproiii.Ordenacao.OrdenacaoMain.main()\n");
        int quantVezesGerados = 100;
        
        int[] vetor = initVetor(quantVezesGerados);
        
        for(int i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);
        
//        merge_sort(vetor, 0, vetor.length-1);
          quicksort(vetor, 0, vetor.length-1);
        
        System.out.println("\n\n");
         for(int i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);
         
        System.out.println("\n\n");
        int number = binarySearch(vetor, 900);
        System.out.println("Number: " + number);

        System.out.println("\n\n");
        metodo("Dia a dia na grande cidade!");
    }
    
    public static void bubble_sort(int [] v) {
        for (int i=0; i<v.length; i++) {
            for (int j=0; j<v.length-1; j++) {
                if (v[j] > v[j+1])
                troca(v, j, j+1);
            } 
        }
    }
    
    public static void bubble_sortO(int [] v) {
        boolean trocou = true;
        while(trocou) {
            trocou = false;
            for (int i = 0; i < v.length -1; i++) {
                if(v[i] > v[i+1]){
                    troca(v, i, i+1);
                    trocou = true;
                }
            }
        }
    }
    
    public static void troca(int v[], int j, int t) {
        int aux = v[j];
        v[j] = v[t];
        v[t] = aux;
    }
    
    public static void insertion_sort(int [] v) {
        int i, j, chave;
        for (j=1; j<v.length; j++) {
            chave = v[j];
            i = j - 1;
            while ((i >= 0) && (v[i] > chave)) {
                v[i+1] = v[i];
                i = i-1; 
            }
            v[i+1] = chave;
        }
    }
    
    public static void merge_sort(int [] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            merge_sort(v, inicio, meio);
            merge_sort(v, meio+1, fim);
            merge(v, inicio, meio, fim);
        } 
    }
    
    private static void merge(int [] v, int inicio, int meio, int fim) {
        int nL = meio-inicio+1; int nR = fim-meio;
        int [] L = new int[nL]; int [] R = new int[nR];
        System.arraycopy(v, inicio, L, 0, nL);
        System.arraycopy(v, meio+1, R, 0, nR);
        int iL = 0; int iR = 0;
        
        for (int k=inicio; k<=fim; k++) {
            if (iR < nR) {
                if (iL < nL) {
                    if (L[iL] < R[iR]) v[k] = L[iL++];
                    else v[k] = R[iR++];
                } else v[k] = R[iR++];
            } else v[k] = L[iL++];
        }
    }
    
    public static void quicksort(int [] v, int low, int high) { 
        int pivot;
        if ((high-low) > 0) {
            pivot = partition(v, low, high);
            quicksort(v, low, pivot-1);
            quicksort(v, pivot+1, high);
        }
    }
    
    public static int partition(int [] v, int low, int high) {
        int i, p, firsthigh;
        firsthigh = low;
        p = high;
        
        for (i=low; i<high; i++)
            if (v[i] < v[p]) {
                troca(v, i, firsthigh);
                firsthigh = firsthigh + 1;
            }
        troca(v, p, firsthigh);
        return firsthigh;
    }
    
    public static int binarySearch(int [] v, int value) {
        int low = 0;
        int high = v.length - 1;
        int p = low + ((high-low) / 2);
        
        while (low <= high)
        {
            if (v[p] > value)
                high = p - 1;
            else if (v[p] < value)
                low = p + 1;
            else
                return p;
            p = low + ((high - low) / 2);
        }
        
        return -1;
    }
    
    public static void metodo(String str) { 
        if (!str.equals("")) {
            metodo(str.substring(1));
            System.out.print(str.charAt(0)); 
        }
    }
    
    public static int buscar(int v[], int i, int chave) {
        int p = pesquisaDireta(v, chave);
        
        if (p < 0)
            return -1;
        
        int pi = p + i -1;
        if (pi >= v.length)
            return -1;
        
        if (v[pi] == chave)
            return pi;
        
        return -1;
    }
    
    public static int pesquisaDireta(int v[], int chave) {
        
        for (int i = 0; i < v.length; i++)
            if (v[i] == chave)
                return i;
        
        return -1;
    }
}
