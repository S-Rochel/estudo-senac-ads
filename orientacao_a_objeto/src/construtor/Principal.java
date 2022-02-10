package construtor;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        float nota;
        int freq;
        String st;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a nota de início: ");
        nota = ler.nextFloat();
        System.out.println("Insira a frequência de início: ");
        freq = ler.nextInt();
        System.out.println("Insira o status de início: ");
        st = ler.next();

        Boletim B1 = new Boletim(nota, freq, st);
        Boletim B2 = new Boletim();
        Boletim B3 = new Boletim("Aprovado");

        System.out.println("\n\nUso do construtor com 3 parâmetros: ");
        B1.imprimir();
        System.out.println("\nUso do construtor com nenhum parâmetro: ");
        B2.imprimir();
        System.out.println("\nUso do construtor com nenhum parâmetro: ");
        B3.imprimir();

        ler.close();
    }
}
