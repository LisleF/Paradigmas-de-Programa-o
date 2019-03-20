/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Scanner;
/**
 *
 * @author faray.lisle
 */
public class Aula1 {

   
    public static void main(String[] args) {
        
        //System.out.println("Hello World!");
        Scanner ent = new Scanner(System.in);//leitura em java
        
        //Maneira 1 de Leitura
        int n = ent.nextInt();
        String nome = ent.next();
        char sexo = ent.next().charAt(0); // Lê char na posição da String
        double d = ent.nextDouble();
        System.out.println(n+" "+nome+" "+sexo+" "+d);
        
        //Maneira 2 de Leitura
        ent.nextLine();                 //Limpa a quebra de linha pendente
        String linha = ent.nextLine();  //Lê até o final da linha
        String[] vet = linha.split(" "); //Separa os tokens da String
        n = Integer.parseInt(vet[0]);    //Converte de string para int
        nome = vet[1];
        sexo = vet[2].charAt(0);
        d = Double.parseDouble(vet[3]);
        System.out.println(n+" "+nome+" "+sexo+" "+d);
        
        
        //Problema 1: 
        //entradas: Quilomentros percorridos(int), litros consumidos(int)
        //saidas: consumo em Km/L.
        System.out.println("Insira seus quilometros e litros");
        Scanner ent = new Scanner(System.in);//leitura em java
        int km = ent.nextInt();
        int litro = ent.nextInt();
        double consumo =((double)km/litro); 
        System.out.println(km +" "+ litro+" "+consumo);
    }
    
}