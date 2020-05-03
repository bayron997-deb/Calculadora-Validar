package Programacion;
//Importacion de Paquetes
import java.util.Scanner;

/*
                (PROBLEMA A RESOLVER)
- El usuario accede a un Menú de 7 opciones permitidas por el programa.
- El usuario elige una de las 7 opciones:
- 1 : sumar 2 numeros; muestra suma; vuelve al menú
- 2 : restar 2 numeros; muestra resta ; vuelve menú
- 3 : multiplicar 2 numeros; muesta la multiplicación ; vuelve menú
- 4 : dividir 2 numeros; resultado de la division; vuelve menú
- 5 : calcular el mayor de  2 numeros; muestra el mayor ; si son iguales muestra el primero; vuelve menú
- 6 : potencia de  2 numeros; potencia del primer numero elevado al segundo: vuelve al menú
- 7 : salir ; Se pregunta si desea salir ; si : sale del programa / no : vuelve al menú
                (METODOLOGÍA)
- Usar metodos para cada una de las opciones en forma separada y ordenada
- Para que método se le dará un
    1- nombre
    2- valor de retorno
    3- proceso que realiza (explicado con palabras)
- La idea es subir todo el proceso a github con sus commit en la rama principal.
- Creamos una rama de prueba para hacer el codigo y la forma final se subira a la rama principal.
 */

public class Calculadora {

    //Crear un Scanner "global" para que lea datos de teclado
    public static Scanner teclado = new Scanner(System.in);

    // Variables que se usarán
    public static int a, b;
    public static double x, y;

    public static void main(String[] args) {

        //  Valida un int
        a = Operaciones.validarInt();
        System.out.println("" + "El número ingresado es: " + a);

        // Valida un double}
        x = Operaciones.validarDouble(" ");
        System.out.println("El número ingresado es: " + x);

        // Usa validar double
        Operaciones.ingrese2Numeros();
        System.out.println("Los números ingresados son: "+x+" y "+y);

        // Usa validar double
        Operaciones.ingreseNumExp();
        System.out.println("El número ingresado es "+x+" y su exponente es "+y);

    }
}

