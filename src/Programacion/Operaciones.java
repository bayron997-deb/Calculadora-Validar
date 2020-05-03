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
                System.out.print("Ingrese el número: ");
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
}
