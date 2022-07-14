package modelo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Correo {

    private Integer id;
    private String correo;
    private Boolean estado;
    private Boolean enviado;




    @Override
    public String toString() {
        return "Correo{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", estado=" + estado +
                ", enviado=" + enviado +
                '}';
    }
}
