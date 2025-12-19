
package inventarioedd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Clase encargada de guardar y cargar productos desde un archivo de texto.
 */
public class ArchivoProductos {
    
    private static final String NOMBRE_ARCHIVO = "productos.txt";

    /**
     * Guarda todos los productos de la lista en un archivo de texto.
     */
    public static void guardarProductos(ListaProductos lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO))) {

            NodoProducto actual = obtenerCabeza(lista);

            while (actual != null) {
                Producto p = actual.dato;

                pw.println(
                        p.getId() + "," +
                        p.getNombre() + "," +
                        p.getCategoria() + "," +
                        p.getCantidad() + "," +
                        p.getStockMinimo()
                );

                actual = actual.siguiente;
            }

        } catch (IOException e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }

    /**
     * Carga los productos desde el archivo y los agrega a la lista.
     */
    public static void cargarProductos(ListaProductos lista) {
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String categoria = datos[2];
                int cantidad = Integer.parseInt(datos[3]);
                int stockMinimo = Integer.parseInt(datos[4]);

                Producto p = new Producto(id, nombre, categoria, cantidad, stockMinimo);
                lista.agregarProducto(p);
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado, iniciando inventario vacío.");
        }
    }

    /**
     * Método auxiliar para acceder a la cabeza de la lista.
     * (Se usa solo para guardar archivos)
     */
    private static NodoProducto obtenerCabeza(ListaProductos lista) {
        try {
            java.lang.reflect.Field campo = ListaProductos.class.getDeclaredField("cabeza");
            campo.setAccessible(true);
            return (NodoProducto) campo.get(lista);
        } catch (Exception e) {
            return null;
        }
    }
}
