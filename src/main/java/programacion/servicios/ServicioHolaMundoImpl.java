package programacion.servicios;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;

@ApplicationScoped
public class ServicioHolaMundoImpl implements ServicioHolaMundo {
    public String hola(){
        return "hola "+ LocalDateTime.now();
    }
}
