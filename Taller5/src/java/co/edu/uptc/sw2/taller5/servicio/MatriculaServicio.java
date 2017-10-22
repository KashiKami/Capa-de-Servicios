package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Matricula")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MatriculaServicio {

    /**
     * retorna una lista con los Carrera que se encuentran en la base de datos
     *
     * @return retorna una lista de CarreraDTO
     * @generated
     */
    @GET
    public List<MatriculaDTO> obtenerTodosMatriculas() {
        return ProveedorInformacion.instance().obtenerTodos(MatriculaDTO.class);
    }

    /**
     * @param id identificador del elemento Carrera
     * @return Carrera del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public MatriculaDTO obtenerMatricula(@PathParam("id") Long id) {
        return (MatriculaDTO) ProveedorInformacion.instance().obtener(MatriculaDTO.class, id);
    }

    /**
     * almacena la informacion de Carrera
     *
     * @param dto Carrera a guardar
     * @return Carrera con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public MatriculaDTO guardarMatricula(MatriculaDTO dto) {
        return (MatriculaDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Carrera con el identificador dado
     *
     * @param id identificador del Carrera
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarMatricula(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(MatriculaDTO.class, id);
    }

}
