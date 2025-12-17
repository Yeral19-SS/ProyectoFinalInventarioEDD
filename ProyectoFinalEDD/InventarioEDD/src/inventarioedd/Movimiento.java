package inventarioedd;

import java.time.LocalDateTime;

/**
 * Clase Movimiento Representa una entrada o salida de inventario. Se utilizará
 * junto con una Cola (FIFO) para registrar los movimientos del sistema.
 */
public class Movimiento {

    /**
     * Tipo de movimiento: ENTRADA o SALIDA
     */
    private String tipo;

    /**
     * Producto asociado al movimiento
     */
    private Producto producto;

    /**
     * Cantidad movida
     */
    private int cantidad;

    /**
     * Fecha y hora del movimiento
     */
    private LocalDateTime fecha;

    /**
     * Constructor del movimiento
     *
     * @param tipo Tipo de movimiento (ENTRADA / SALIDA)
     * @param producto Producto afectado
     * @param cantidad Cantidad del movimiento
     */
    public Movimiento(String tipo, Producto producto, int cantidad) {
        this.tipo = tipo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo
                + " | Producto: " + producto.getNombre()
                + " | Cantidad: " + cantidad
                + " | Fecha: " + fecha;
    }
}
