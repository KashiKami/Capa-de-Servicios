package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/Horario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HorarioServicio {

    /**
     * retorna una lista con los Facultad que se encuentran en la base de datos
     *
     * @return retorna una lista de FacultadDTO
     * @generated
     */
    @GET
    public List<HorarioDTO> obtenerTodosFacultads() {
        return ProveedorInformacion.instance().obtenerTodos(HorarioDTO.class);
    }

    /**
     * @param id identificador del elemento Facultad
     * @return Facultad del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public HorarioDTO obtenerFacultad(@PathParam("id") Long id) {
        return (HorarioDTO) ProveedorInformacion.instance().obtener(HorarioDTO.class, id);
    }

    /**
     * almacena la informacion de Facultad
     *
     * @param dto Facultad a guardar
     * @return Facultad con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public HorarioDTO guardarFacultad(HorarioDTO dto) {
        return (HorarioDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Facultad con el identificador dado
     *
     * @param id identificador del Facultad
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarFacultad(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(HorarioDTO.class, id);
    }
    
    @GET
    @Path("/consulta")
    public List<HorarioDTO> consultarFacultades(@QueryParam("id") long id){
        List<HorarioDTO> lista=obtenerTodosFacultads();
        List<HorarioDTO> respuesta=new ArrayList<>();
        for(HorarioDTO f:lista){
            if(f.getId() == id){
                respuesta.add(f);
            }
        }
        return respuesta;
    }
    
    

}
