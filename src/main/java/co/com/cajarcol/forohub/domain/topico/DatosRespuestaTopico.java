package co.com.cajarcol.forohub.domain.topico;

import java.time.LocalDate;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDate fechaCreacion
) {
}
