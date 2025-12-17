package inventarioedd;

/**
 * Clase NodoMovimiento Nodo utilizado para implementar la cola de movimientos
 * (FIFO).
 */
public class NodoMovimiento {

    Movimiento dato; // Movimiento almacenado
    NodoMovimiento siguiente; // Referencia al siguiente nodo

    /**
     * Constructor del nodo de movimiento
     *
     * @param dato Movimiento a almacenar
     */
    public NodoMovimiento(Movimiento dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
