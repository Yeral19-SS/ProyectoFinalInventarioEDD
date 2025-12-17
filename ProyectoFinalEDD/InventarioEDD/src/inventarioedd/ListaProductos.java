package inventarioedd;

    /**
 * Clase ListaProductos Implementa una lista enlazada simple hecha a mano (SIN
 * ArrayList). Se encarga de almacenar, recorrer y manipular los productos del
 * inventario.
 */
public class ListaProductos {
    

    /**
     * Referencia al primer nodo de la lista
     */
    private NodoProducto cabeza;
    
    /**
     * Constructor de la lista Inicializa la lista vacía
     */
    public ListaProductos() {
        this.cabeza = null;

    }

// =======================
// MÉTODOS BÁSICOS
// =======================
    /**
     * Agrega un nuevo producto al final de la lista
     *
     * @param producto Producto a agregar
     */
    public void agregarProducto(Producto producto) {
        NodoProducto nuevo = new NodoProducto(producto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoProducto actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    /**
     * Muestra todos los productos almacenados en la lista
     */
    
    public void mostrarProductos() {
        if (cabeza == null) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        NodoProducto actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    /**
     * Busca un producto por su ID
     *
     * @param id Identificador del producto
     * @return Producto encontrado o null si no existe
     */
    public Producto buscarProducto(int id) {
        NodoProducto actual = cabeza;
        while (actual != null) {
            if (actual.dato.getId() == id) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    /**
     * Elimina un producto por su ID
     *
     * @param id Identificador del producto a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarProducto(int id) {
        if (cabeza == null) {
            return false;
        }
       if (cabeza.dato.getId() == id) {
            cabeza = cabeza.siguiente;
            return true;
        }

        NodoProducto actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.getId() == id) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
}


