package inventarioedd;

/**
 * Clase ColaMovimientos Implementa una cola FIFO hecha a mano para registrar
 * entradas y salidas del inventario.
 */
public class ColaMovimientos {

    /**
     * Primer elemento de la cola
     */
    private NodoMovimiento frente;

    /**
     * Último elemento de la cola
     */
    private NodoMovimiento fin;

    /**
     * Constructor de la cola Inicializa la cola vacía
     */
    public ColaMovimientos() {
        this.frente = null;
        this.fin = null;
    }

    /**
     * Agrega un movimiento al final de la cola
     *
     * @param movimiento Movimiento a registrar
     */
    public void encolar(Movimiento movimiento) {
        NodoMovimiento nuevo = new NodoMovimiento(movimiento);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    /**
     * Elimina y devuelve el movimiento al frente de la cola
     *
     * @return Movimiento eliminado o null si la cola está vacía
     */
    public Movimiento desencolar() {
        if (frente == null) {
            return null;
        }

        Movimiento movimiento = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return movimiento;
    }

    /**
     * Muestra todos los movimientos registrados en la cola
     */
    public void mostrarMovimientos() {
        if (frente == null) {
            System.out.println("No hay movimientos registrados.");
            return;
        }

        NodoMovimiento actual = frente;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    /**
     * Verifica si la cola está vacía
     *
     * @return true si está vacía, false en caso contrario
     */
    public boolean estaVacia() {
        return frente == null;
    }
}
