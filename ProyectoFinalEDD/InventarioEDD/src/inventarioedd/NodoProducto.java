package inventarioedd;

/**
 * Clase NodoProducto Nodo de la lista enlazada simple que almacena objetos
 * Producto.
 */
public class NodoProducto {

    Producto dato; // Producto almacenado
    NodoProducto siguiente; // Referencia al siguiente nodo

    /**
     * Constructor del nodo
     *
     * @param dato Producto a almacenar
     */
    public NodoProducto(Producto dato) {
        this.dato = dato;
        this.siguiente = null;

    }

}

