/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte vasos = 19; //Armazena numeros pequenos (-128 a 127)
        short ganhoMensal = 9000; //Armazena valores um pouco maiores (-32.768 a 32.767)
        int visitantesMensal = 10000; // Tipo mais comum para numeros inteiros
        long vasosMundiais = 120000000L; //Necessario 'L' para valores longos
        
        float tamanhoDoVaso = 1.45f; // Necessario 'f' no final para indicar 
        double pesoDoVaso = 12.5; // Mais preciso que float
        
        char inicialDoVaso = 'V'; // Armazena um unico caractere
        boolean vendeVaso = true; //Armazena verdadeiro que float
        
        //Exibição dos valores
        System.out.println("Vasos: " + vasos);
        System.out.println("Ganho mensal: " + ganhoMensal);
        System.out.println("Visitantes mensal: " + visitantesMensal);
        System.out.println("Vasos mundiais: " +vasosMundiais);
        System.out.println("Tamanho do vaso: " + tamanhoDoVaso + "m");
        System.out.println("Peso do vaso: " + pesoDoVaso + "kg");
        System.out.println("Inicial do dono: " + inicialDoVaso);
        System.out.println("Vende vaso? " + vendeVaso);
    }
    
}
    
    

