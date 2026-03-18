package es.etg.prog.pokedex.PokedexView;

import java.util.Scanner;

public class PokedexView {
    private static Scanner sc = new Scanner(System.in);
    private int numeroIntroducido=0;
    private String stringIntroducido="";
    private int opcion;
    public void mostrarMenu(){
        do {
            
        System.out.println("Menú de opciones, introduce un número que coincida con la opción: ");
        System.out.println("placeholder");
        } while (opcion!=3);
    }

    public int leerEntero(){
        numeroIntroducido=sc.nextInt();
        return numeroIntroducido;
    }

    public String leerString(){
        stringIntroducido=sc.next();
        return stringIntroducido;
    }
}
