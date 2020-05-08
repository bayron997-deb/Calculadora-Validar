package Programacion;
//Paquetes importados
import java.util.InputMismatchException;

public class Operaciones {

    //Este es el metodo que permitira preguntar los números en cada selección de menú
    public static int validarInt(){
        boolean repetir = true;
        int a=0;
        while(repetir){
            try{
                System.out.print("Escoja una opción: ");
                a = Calculadora.teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException e){
                Calculadora.teclado.next(); // Limpia el Scanner
                System.out.println("Ingrese un número, por favor");
                repetir = true;
            }
        }
        return a;
    }

    // Para validar una variable del tipo double
    public static double validarDouble(String s) {
        boolean repetir = true;
        double a=0;
        while (repetir) {
            try {
                System.out.print("Ingrese el" + s + "número: ");
                a = Calculadora.teclado.nextDouble();
                repetir = false;
            } catch (InputMismatchException e) {
                Calculadora.teclado.next(); // Limpia el Scanner
                System.out.println("Ingrese un número, por favor");
                repetir = true;
            }
        }
        return a;
    }

    // Para ingresar 2 números
    public static void ingrese2Numeros(){
        Calculadora.x=validarDouble(" primer ");
        Calculadora.y=validarDouble(" segundo ");
    }

    // Para ingresar 1 número y su exponente (se usará para calcular la potencia
    public static void ingreseNumExp(){
        Calculadora.x=validarDouble(" ");
        Calculadora.y=validarDouble(" exponente del ");
    }

    // Método para mostrar el resultado
    public void resultado(double num){
        System.out.println("El resultado es " + num);
    }

    //Metodos de operaciones básicas, utilizarán las variables globales, son del tipo double.

    public void suma(double x, double y){//metodo que suma
        resultado(x+y);//se realiza la operación suma dentro del método resultado
    }

    public void resta(double x, double y){//metodo que resta
        resultado(x-y);//se realiza la operación resta dentro del método resultado
    }

    public void multiplicacion(double x, double y){//metodo que multiplica
        resultado(x*y);//se realiza la operación multiplicación dentro del método resultado
    }

    public void division(double x, double y){//metodo que divide
        if(y==0){
            System.out.println("Error: No se puede dividir por 0"); // Caso indeterminado
        }
        else{
            resultado(x/y);//se realiza la operación división dentro del método resultado
        }
    }

    public void mayor(double x, double y) {//metodo que ve cual es es numero mayor
        if (x >= y) {
            System.out.println("El número mayor es " + x);
        } else {
            System.out.println("El número mayor es " + y);
        }//se define con operadores lógicos cual es mayor
    }

    public  void potencia(double x, double y){// metodo que eleva el primer número al segundo
        if(x==0 && y==0){
            System.out.println("Error: 0 elevado a 0 está indeterminado"); // Caso indeterminado
        }
        else {
            resultado(Math.pow(x, y));//se realiza la operación potencia dentro del método resultado con la funcion Math.pow de la clase Math.
        }
    }

}
