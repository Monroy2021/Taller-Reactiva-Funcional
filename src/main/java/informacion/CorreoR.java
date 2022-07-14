package informacion;

import modelo.Correo;

import java.util.Arrays;
import java.util.List;

public class CorreoR {
    public static List<Correo> getEmail() {
        List<Correo> email = Arrays.asList(
                new Correo(0, "leonor.araya@gmail.com", false,true) ,
                new Correo(2, "maeillanes@hotmail.com", false, false),
                new Correo(3, "osabarca@hotmail.com", true, true),
                new Correo(4, "Sb.nashxo.sk8@hotmail.com", true, false),
                new Correo(5, "carlosaguileram@sofka.com", false, true),
                new Correo(6, "c_arnes@hotmail.com", true,false),
                new Correo(7, "bantomaui@gmail.com", false, true),
                new Correo(8, "claudiabergez@gmail.com", true,false),
                new Correo(9, "solbk26@hotmail.com", true, true),
                new Correo(10, "sebastianatila@hotmail.com", true,true),
                new Correo(11, "lukalcagno@gmail.com", false,false),
                new Correo(12, "juanocortes@hotmail.com", false,true),
                new Correo(13, "tallerlaquilla@gmail.com", false,true),
                new Correo(15, "Karito_1404@hotmail.com", true,false),
                new Correo(16, "marissaleone@hotmail.com", false,false),
                new Correo(17, "1Victor659633698@outlook.com", true,true),
                new Correo(18, "adela.r.c@outlook.com", false,true),
                new Correo(19, "adela.r.design@outlook.com", false,false),
                new Correo(20, "adela.webmaster@gmail.com", true,false),
                new Correo(21, "laura.gomez.psicologa@gmail.com", false,false),
                new Correo(22, "fernando.twitterexperto@outlool.com", false,true),
                new Correo(23, "cmanager.nuria.sainz@gmail.com", true,true),
                new Correo(24, "a.r.carrillo@gmail.com", false,false),
                new Correo(25, "21.07.87Melania@gmail.com", true,false),
                new Correo(26, "rlabarcajaque@gmail.com", false,false),
                new Correo(27, "cdksfofi@hotmail.com", false,true),
                new Correo(28, "rlabarcajaque@gmail.com", true,true),
                new Correo(29, "c.analuz@yahoo.es", true,false)
        );
        return email;
    }
}
