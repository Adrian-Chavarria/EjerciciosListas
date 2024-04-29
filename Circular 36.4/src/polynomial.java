
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chava
 */
public class polynomial {
      Nodo head;
      Nodo tail;

    public polynomial() {
        this.head = null;
        this.tail= null;
    }

   
    public void insertTerm(double coefficient, int exponent) {
        Nodo newTerm = new Nodo(coefficient, exponent);
        if (tail == null) {
            tail = newTerm;
            tail.next = tail;
        } else {
            newTerm.next=tail.next;
            tail.next= newTerm;
            tail=newTerm;
            }
           
        }
    
   
       public double calculate(double x) {
        double result = 0;
       
           if (tail!=null) {
               Nodo actual =tail.next;
               do {
                   result += actual.coefficient*Math.pow(x, actual.exponent);
                   actual=actual.next;
               } while (actual != tail.next);
               
           }
          return result;
       }



      public static void main(String[] args) {
     
        polynomial polynomial = new polynomial();
        polynomial.insertTerm(2, 5);  
        polynomial.insertTerm(-4, 3); 
        polynomial.insertTerm(11, 0); 
    Scanner scanner = new Scanner(System.in);
      
        System.out.println("Tabla de valores del polinomio:");
        System.out.println(" 2x^5 "+"-4x^3"+ "+ 11");
        System.out.println("x\t|\tP(x)");
        System.out.println("-----------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double result = polynomial.calculate(x);
            System.out.println(x + "\t|\t" + result);
        }
         System.out.println("\nIngrese un nuevo término del polinomio:");
        System.out.print("Coeficiente: ");
        double coefficient = scanner.nextDouble();
        System.out.print("Exponente: ");
        int exponent = scanner.nextInt();
          System.out.println("\nSe agregó un nuevo término al polinomio "
                  + "con un coeficiente de " + coefficient +
                " y un exponente de " + exponent);
        polynomial.insertTerm(coefficient, exponent);

        System.out.println("\nTabla de valores actualizada del polinomio:");
        System.out.println("x\t|\tP(x)");
        System.out.println("-----------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double result = polynomial.calculate(x);
            System.out.println(x + "\t|\t" + result);
        }

        scanner.close();
    }

    }


