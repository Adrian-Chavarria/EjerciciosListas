/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chava
 */
public class Nodo {

      double coefficient;
    int exponent;
    Nodo next;
/**
 * 
 * @param coefficient; Stores the coefficient of the polynomial term.
 * @param exponent ; Stores the exponent of the polynomial term.
 */
    public Nodo(double coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}
  

