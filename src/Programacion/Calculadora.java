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

Análisis: Calculadora

Lista de Métodos


main():
Tipo: void
Párametros: String[], para recibir la entrada por linea de comandos.
Proceso: Consiste en un menú dentro de un do-while, incluye todo el programa.

menu():
Tipo: void
Parámetros: Ninguno
Proceso: Despliega el menú con las opciones(1-7), pide al usuario que ingrese una opción y usa un switch para realizar un método distinto dependiendo de la opción.

validarInt():
Tipo: int
Parámetros: Ninguno
Proceso: Consiste de un try-catch que verifica que la entrada sea tipo int y repite el proceso hasta que sea válida.

validarDouble():
Tipo: double
Parámetros: String, usado para cambiar el texto que muestra al ingresar el primer o segundo número.
Proceso: Consiste de un try-catch que verifica que la entrada sea tipo double y repite el proceso hasta que sea válida.

ingrese2Numeros():
Tipo: void
Parámetros: Ninguno
Proceso: Pide al usuario que ingrese 2 números para realizar el cálculo que escogió (y verifica cada uno).

ingrese2Numeros();
Tipo: void
Parámetros: Ninguno
Proceso: Lo mismo que el anterior, pero con texto para pedir un número y su exponente

resultado();
Tipo: void
Parámetros: double
Proceso: Muestra el resultado del cálculo ("El resultado es..")

suma();
Tipo: void
Párametros: 2 de tipo double.
Proceso: Realiza la suma de los 2 números y muestra el resultado.

resta();
Tipo: void
Parámetros: 2 de tipo double.
Proceso: Realiza la resta entre los 2 números y muestra el resultado.

multiplicacion();
Tipo: void.
Parámetros: 2 de tipo double
Proceso: Realiza la multiplicación entre los dos números y muestra el resultado.

division();
Tipo: void
Parámetros: 2 de tipo double.
Proceso: Realiza la división entre los 2 números y muestra el resultado. Si el segundo número ingresado fue 0, muestra error.

mayor();
Tipo: void
Parámetros: 2 de tipo double.
Proceso: Compara los números y muestra el de mayor valor("El número mayor es...")

potencia();
Tipo: void
Parámetros: Ninguno.
Proceso: Realiza la potencia con los dos números y muestra el resultado. Utiliza Math.pow para realizar el proceso. Si ambos números ingresados son 0, muestra error.

salir();
Tipo: void
Párametros: Ninguno
Proceso: Pide al usuario una confirmación para salir del programa.

linea();
Tipo: void
Parámetros: Ninguno
Proceso: Muestra una línea para separar cada ejecución del menú
Análisis: Calculadora
Lista de Métodos

main():
Tipo: void
Párametros: String[], para recibir la entrada por linea de comandos.
 Proceso: Consiste en un menú dentro de un do-while, incluye todo el programa.

menu():
Tipo: void
Parámetros: Ninguno
Proceso: Despliega el menú con las opciones(1-7), pide al usuario que ingrese una opción y usa un switch para realizar un método distinto dependiendo de la opción.

validarInt():
Tipo: int
Parámetros: Ninguno
Proceso: Consiste de un try-catch que verifica que la entrada sea tipo int y repite el proceso hasta que sea válida.

validarDouble():
Tipo: double
Parámetros: String, usado para cambiar el texto que muestra al ingresar el primer o segundo número.
Proceso: Consiste de un try-catch que verifica que la entrada sea tipo double y repite el proceso hasta que sea válida.

ingrese2Numeros():
Tipo: void
Parámetros: Ninguno
Proceso: Pide al usuario que ingrese 2 números para realizar el cálculo que escogió (y verifica cada uno).

ingreseNumExp();
Tipo: void
Parámetros: Ninguno
Proceso: Lo mismo que el anterior, pero con texto para pedir un número y su exponente

resultado();
Tipo: void
Parámetros: double
Proceso: Muestra el resultado del cálculo ("El resultado es..")

suma();
Tipo: void
Párametros: 2 de tipo double.
Proceso: Realiza la suma de los 2 números y muestra el resultado.

resta();
Tipo: void
Parámetros: 2 de tipo double.
Proceso: Realiza la resta entre los 2 números y muestra el resultado.

multiplicacion();
Tipo: void.
Parámetros: 2 de tipo double
Proceso: Realiza la multiplicación entre los dos números y muestra el resultado.

division();
Tipo: void
Parámetros: 2 de tipo double.
Proceso: Realiza la división entre los 2 números y muestra el resultado. Si el segundo número ingresado fue 0, muestra error.

mayor();
Tipo: void
Parámetros: 2 de tipo double.
Proceso: Compara los números y muestra el de mayor valor("El número mayor es...")

potencia();
Tipo: void
Parámetros: Ninguno.
Proceso: Realiza la potencia con los dos números y muestra el resultado. Utiliza Math.pow para realizar el proceso. Si ambos números ingresados son 0, muestra error.

salir();
Tipo: void
Párametros: Ninguno
Proceso: Pide al usuario una confirmación para salir del programa.

linea();
Tipo: void
Parámetros: Ninguno
Proceso: Muestra una línea para separar cada ejecución del menú

 */

public class Calculadora {

    //Crear un Scanner "global" para que lea datos de teclado
    public static Scanner teclado = new Scanner(System.in);

    // Variables que se usarán
    public static double x, y;
    public static boolean seguir = true;

    public static void main(String[] args) {
        //Llamando al metodo menu de la clase Menu con un do while para que repita hasta que el usuario en case 7 seleccione salir
    Menu menu = new Menu();
    do{
        menu.menu();
    }while(seguir);
    }
}

