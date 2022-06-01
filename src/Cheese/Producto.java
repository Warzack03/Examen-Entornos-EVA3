package Cheese;
/**
 * Clase para la gestión de productos lácteos
 * @author loned
 */
public class Producto {
/**
 * Código único del producto
 */
    private String code;
 /**
 * Procedencia de la leche
 */   
    private String tipo;
 /**
  * Porentaje de leche utilizada en el lácteo
  */   
    private int cantidad_leche;
 /**
  * Peso del lácteo
  */   
    private double peso;

    /**
     * Constructor sin argumentos
     */
    public Producto() {
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param codigo del producto
     * @param tipo_leche del producto
     * @param cantidad_leche en litros
     * @param peso en gramos
     */
    public Producto(String codigo,String tipo_leche, int cantidad_leche, double peso) {
        this.code = codigo;
        this.tipo = tipo_leche;
        this.cantidad_leche = cantidad_leche;
        this.peso = peso;
    }
    /**
     * @return Devuelve el código del producto lácteo
     */
    public String getcode() {
        return code;
    }

    /**
     * @param codigo Establce el código del lácteo.
     */
    public void setcode(String codigo) {
        this.code = codigo;
    }
    /**
     * Devuelve el tipo de leche que usa el producto
     * @return nombre del tipo de leche
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el valor del atributo tipo de leche
     * @param tipo cabra, vaca...
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna el porcentaje de leche utilizado
     * @return cantidad de leche en litros
     */
    public int getCantidad_leche() {
        return cantidad_leche;
    }

    /**
     * Establece el porcentaje de leche utilizado
     * @param cantidad_leche nueva cantidad de leche
     */
    public void setCantidad_leche(int cantidad_leche) {
        this.cantidad_leche = cantidad_leche;
    }

    /**
     * Obtiene el peso del lácteo
     * @return el peso en gramos
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el peso del lácteo
     * @param peso que le queremos poner
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

/**
 * Método que nos permite imprimir_cabecera la etiqueta con los datos de
 * fabricación del producto
 */
    public void imprime_etiqueta() {
         System.out.println("------------------------------------------------------");
        System.out.println("ACME MILK CO.");
        System.out.println("Registro Sanitario Nº 55/5555");
        System.out.println("Para consultar el lote del producto revise la etiqueta");
        System.out.println("------------------------------------------------------");
        this.imprime_detalle();
        System.out.println("------------------------------------------------------");
    }
/**
 * Imprime el detalle del producto seleccionado
 * 
 */
    public void imprime_detalle() {
        
        System.out.println("Código           : " + this.getcode());
        System.out.println("Peso             : " + this.getPeso());
        System.out.println("Tipo de leche    : " + this.getTipo());
        System.out.println("Cantidad de leche: " + this.getCantidad_leche());
    }

}
