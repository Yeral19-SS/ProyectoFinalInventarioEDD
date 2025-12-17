package inventarioedd;

/**
 * Clase Producto Representa un producto dentro del sistema de control de
 * inventario. Esta clase es parte del modelo del sistema y cumple con los
 * principios de la Programación Orientada a Objetos (POO).
 *
 * Contiene la información básica de un producto como: - id - nombre - categoría
 * - cantidad en inventario - stock mínimo
 *
 * @author Jafeth
 */
public class Producto {

    // =======================
// ATRIBUTOS PRIVADOS
// =======================
    /**
     * Identificador único del producto
     */
    private int id;

    /**
     * Nombre del producto
     */
    private String nombre;

    /**
     * Categoría a la que pertenece el producto
     */
    private String categoria;

    /**
     * Cantidad actual en inventario
     */
    private int cantidad;

    /**
     * Cantidad mínima permitida antes de generar alerta
     */
    private int stockMinimo;

// =======================
// CONSTRUCTOR
// =======================
    /**
     * Constructor con todos los atributos del producto.
     *
     * @param id Identificador del producto
     * @param nombre Nombre del producto
     * @param categoria Categoría del producto
     * @param cantidad Cantidad inicial en inventario
     * @param stockMinimo Stock mínimo permitido
     */
    public Producto(int id, String nombre, String categoria, int cantidad, int stockMinimo) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.stockMinimo = stockMinimo;
    }

// =======================
// GETTERS Y SETTERS
// =======================
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

// =======================
// MÉTODOS
// =======================
    /**
     * Devuelve la información del producto en formato texto. Este método es
     * útil para mostrar el producto en pantalla o para guardarlo en un archivo
     * de texto.
     *
     * @return información del producto
     */
    @Override
    public String toString() {
        return "ID: " + id
                + " | Nombre: " + nombre
                + " | Categoría: " + categoria
                + " | Cantidad: " + cantidad
                + " | Stock mínimo: " + stockMinimo;
    }
}
