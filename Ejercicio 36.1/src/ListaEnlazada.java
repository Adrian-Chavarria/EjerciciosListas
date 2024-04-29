
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *represents a singly linked list data structure. It provides methods 
 * for inserting nodes at the end of the list, displaying list items, 
 * removing nodes with values greater than a given value, and filling 
 * the list with random numbers.
 * @author chava
 */

public class ListaEnlazada {
   Nodo cabeza;
    Nodo cola;

   /**
    * 
    */
    public ListaEnlazada() {
        cabeza = null;
        cola = null;
    }
/**
 *   Inserts a node with the given value at the end of the list.
 * @param valor 
 */

    public void insertarFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    /**
     *  Displays the items in the list.
     */
    public void mostrarLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

   
    /**
     * Removes nodes with values greater than the specified maximum 
     * value from the list.
     * @param valorMaximo 
     */
    public void eliminarMayores(int valorMaximo) {
        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.valor > valorMaximo) {
                if (anterior == null) {
                    cabeza = actual.siguiente;
                    actual = cabeza;
                } else {
                    anterior.siguiente = actual.siguiente;
                    actual = anterior.siguiente;
                }
            } else {
                anterior = actual;
                actual = actual.siguiente;
            }
        }
    }

    /**
     *  Fills the list with a specified quantity of random numbers
     * within a given maximum range.
     * @param cantidad 
     * @param maximo 
     */
    public void llenarLista(int cantidad, int maximo) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            insertarFinal(rand.nextInt(maximo) + 1);
        }
    }
}
