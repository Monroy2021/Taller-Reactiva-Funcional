package Ejercicio2;


import Ejercicio3.funciones;
import informacion.Mpalabras;
import reactor.core.publisher.Flux;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Chat_palabras {

    List<String> palabras = Mpalabras.getmalas();
    public void chat(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe la oracion  con una mala palabra");
        String mess = leer.nextLine();
        List<String> chat = Arrays.stream(mess.split(" ")).collect(Collectors.toList());
        Flux.fromIterable(chat)
                .map(mensaje -> {
                    if(palabras.contains(mensaje)){
                        mensaje = "······";
                    }return mensaje;
                }).subscribe(System.out::println);
    }


    public static void main(String[] args) {

        Chat_palabras ejer2 = new Chat_palabras();
        ejer2.chat();

    }


}
