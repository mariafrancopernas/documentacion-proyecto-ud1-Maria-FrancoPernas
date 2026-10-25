package es.centro.incidencias;

/**
 * Excepcion que se lanza cuando no existe ninguna incidencia con
 * el identificador buscado.
 *
 * <p>Es una excepcion comprobada: quien llame a
 * {@link GestorIncidencias#buscarPorId(String)} debe capturarla o declararla</p>
 *
 * @author maria.francopernas
 * @version 1.0.0
 * @since 1.0.0
 * @see GestorIncidencias#buscarPorId(String) 
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Crea la excepcion con un mensaje que incluye el identificador buscado.
     *
     * @param id identificador que no se ha encontrado
     */

    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
