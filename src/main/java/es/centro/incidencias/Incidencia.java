package es.centro.incidencias;


import java.util.Locale;
/**
 * Representa una incidencias
 * contiene informacion especifica (id, titulo, prioridad,abierta)
 * @author maria.francopernas
 * @version 1.0.0
 **/
public final class Incidencia {

    /**
     * El id (identificador) es un cadena de caracteres que va identificar la incidencia
     */
    private final String id;
    /**
     * El titulo es un nombre que nos indica como se llama la incidencia
     */
    private final String titulo;
    /**
     * prioridad es una cadea de caracteres que identifica el nivel de la incidencia
     */
    private final String prioridad;
    /**
     * abierta es un valor logico que nos indicara si la incidencia estara abierta o cerrada
     */
    private final boolean abierta;

    /**
     * Constructor para crear una incidencia con todos sus parametros
     * @param id  Identificador de la incidencia
     * @param titulo Nombre de la incidencia
     * @param prioridad  El tipo nivel que tiene la ìncidencia
     * @param abierta Indica true si esta abierta; falsesi esta cerrada
     */

    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtiene el id de la incidencia
     * @return una cadena de caracteres con el Id
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el nombre de la incidencia
     * @return un nombre con el nombre de la incidencia
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el nivel de la prioridad de la incidencia
     * @return una cadena de caracteres que indicaran en que nivel de prioridad esta la incidencia
     */

    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Obtiene el estado de la incidencia
     * @return devuleve un boolean con el estado de la incidencia
     */

    public boolean isAbierta() {
        return abierta;
    }


    /**
     * Obtiene la comparacion con el id y el titulo
     * @param texto una cadena de caracteres que se va a compara
     * @return un boolean true o false que nos dice si coincide o no
     * @throws NullPointerException si {@code texto} es {@code null}
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
