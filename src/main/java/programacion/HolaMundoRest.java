package programacion;


import programacion.servicios.ServicioHolaMundo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@Path(value="/")
public class HolaMundoRest {

    @Inject
    private ServicioHolaMundo servicio;

    @GET
    @Path("/hola")
    public String hola(){

        return  servicio.hola();

    }
}
