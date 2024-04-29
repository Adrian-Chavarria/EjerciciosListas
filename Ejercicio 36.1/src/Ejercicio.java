/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chava
 */
public class Ejercicio {
 
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.llenarLista(10, 100); 

        System.out.println("Elementos de la lista:");
        lista.mostrarLista();

        lista.eliminarMayores(25);

     
        System.out.println("Elementos de la lista después de eliminar mayores "
                + "a 25 :");
        lista.mostrarLista();
    }
}
