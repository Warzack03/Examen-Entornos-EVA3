/*
*	grupo  : GDAM1-1
*	alumno : Aarón Blanco Medrano
*	n.exp. : 7231
*	fecha  : 01/06/2022
*           VERSIÓN FINAL
 */
package Cheese;

/**
 *
 * @author Warzack03
 */
public class Main {
    
    ListaProductos miLista = new ListaProductos();
    
    Producto yogur = new Producto("001", "desnatada", 70, 1.6);
    Producto queso = new Producto("002", "semi-desnatada", 90, 2.6);
    Producto leche = new Producto("003", "entera", 80, 0.8);
    
     public static void main(String[] args) {
    
         System.out.println("1º GDAM: Entornos de desarrollo");
         
         // ME SALGO DEL MAIN PARA QUE NO ME DE ERRORES POR SER UN MÉTODO STATIC
         
         Main m = new Main();
         m.test();
    }
     
     public void test()
     {
         miLista.addProducto(yogur);
         miLista.addProducto(queso);
         miLista.addProducto(leche);
         
         yogur.imprime_etiqueta();
         queso.imprime_etiqueta();
         leche.imprime_etiqueta();
     }
}
