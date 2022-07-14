package Ejercicio1;

import informacion.CorreoR;
import modelo.Correo;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Correo1 {


    public static List<String> Eliminar() {
        List<Correo> email = CorreoR.getEmail();
        return email.stream().map(dataemail -> dataemail.getCorreo()).distinct().collect(Collectors.toList());


    }

    public static List<Correo> filtrar() {
        List<Correo> email = CorreoR.getEmail();

        return email.stream().filter(dataemail -> {
            return dataemail.getCorreo().contains("gmail") || dataemail.getCorreo().contains("hotmail")
                    || dataemail.getCorreo().contains("outlook");

        }).collect(Collectors.toList());
    }

    public static List<String> validar() {
        List<Correo> email = filtrar();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)");
        return email.stream().map(dataemail -> {
            Matcher mather = pattern.matcher(dataemail.getCorreo());
            if (mather.find()) {
                return dataemail.getCorreo();
            }
            return null;
        }).collect(Collectors.toList());

    }


    public static long cantidadCorreo(){
        List<Correo> email = CorreoR.getEmail();

       return email.stream().count();

    }

    public static long cantidadCorreoValidados(){
        List<Correo> email = filtrar();

        return email.stream().count();

    }

    public static List<Correo> estadoCorreo(){
        List<Correo> email = CorreoR.getEmail();

        return email.stream().map(dataemail->{
            if (dataemail.getEnviado()) {
                dataemail.setEstado(true);
            }
            return dataemail;
        }).collect(Collectors.toList());

    }


    public static void main(String[] args) {
        System.out.println(Eliminar());
        System.out.println(filtrar());
        System.out.println(validar());
        System.out.println(cantidadCorreo());
        System.out.println(cantidadCorreoValidados());
        System.out.println(estadoCorreo());



    }


}
