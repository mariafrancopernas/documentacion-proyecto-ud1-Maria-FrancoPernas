package es.centro.incidencias;

import java.util.List;

/**
 * Gestiona una coleccion en memoria de objetos {@link Incidencia}.
 *
 * <p>Permite añadir incidencias, buscarlas identificarlas y consultarlas,
 * cuales siguen pendintes y su estado </p>
 *
 * @author maria.francopernas
 * @version 1.0
 * @since 1.0
 */

public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     *Crea un gestor con un conjunto inicial de incidendias de ejemplo
     *
     * <p> La colecion interna es inmutable : no se pueden añadir ni eliminar
     * incidencias una vez creado el gestor </p>
     */

    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Devuelve todas las incidencias del gestor
     *
     * @return lsita no modificable con todas las incidencias
     */

    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Obtine las incidencias que todavian estan abiertas
     *
     * @returnnueva lista que contiene unicamente incidendias abiertas
     * @see Incidencia#isAbierta()
     */

    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca las incidencias que coninciden con un texto
     *
     * @param texto que se desea buscar
     * @return nueva lsita con la incidencias que conciden con el texto;
     *          vacia si no hay ninguna
     * @see Incidencia#coincideCon(String)
     */

    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia por su identificador
     *
     * @param id identificador buscado
     * @return incidencia encontrada
     * @throws IncidenciaNoEncontradaException si no existe ninguna incidencia con
     * ese identificador
     */

    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Busca incidencia por su identificador
     *
     * @param id identificador buscado
     * @return incidencia encontrada
     */

    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
