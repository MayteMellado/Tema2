package TDA;

import java.util.Date;
import java.text.SimpleDateFormat;
public class FechaActual {
    public static String obtenerFechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fecha);
    }
}