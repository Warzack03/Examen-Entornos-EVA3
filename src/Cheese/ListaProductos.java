/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }

    /**
     * Añade un producto a la lista.
     * @param prod producto que queremos añadir
     * @return En caso de que el producto ya esté en la lista, devuelve null, sino, devuelve el producto añadido
     */
    public Producto addProducto(Producto prod) {
        if(check_null(prod.getcode())) return null;
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }

    /**
     * Elimina un producto de la lista.
     * @param codigo código del product que vamos a eliminar.
     * @return Devuelve el producto eliminado, en caso de que no exista producto con ese código, devuelve null.
     */
    public Producto eliminarProducto(String codigo) { 
        if(check_null(codigo)) return null;
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }

    /**
     * Busca un producto en la lista por el código.
     * @param codigo codigo del producto a buscar.
     * @return Devuelve null sino existe un producto con ese código o si existe, devuelve el encontrado.
     */
    public Producto buscarProducto(String codigo) { 
        if(check_null(codigo)) return null;
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }

    /**
     * Lista todos los productos que tenemos en la lista.
     * @return Devuelve un arrayList de todos los productos de la lista.
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    /**
     * Devuelve el número de productos que tenemos
     * @return número total de productos de la lista.
     */
    public int totalProductos(){
            return this.getN();
    }
}
