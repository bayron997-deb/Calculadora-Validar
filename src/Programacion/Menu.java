package Programacion;

public class Menu {
    //Crear un objeto de la clase operaciones para usar los métodos
    Operaciones ope = new Operaciones();

    //Metodo que muestra el menú
    public void menu(){
        //variable para la seleccion del menu
        int seleccion;

        //menú de selección
        System.out.println("Bienvenido a la calculadora, tenemos 7 opciones a elegir\n" +
                "1.-Suma\n2.-Resta\n3.-Multiplicación\n" +
                "4.-División\n5.-Mayor de 2 números\n6.-Calcular potencia de un número\n" +
                "7.-Salir de la calculadora");
        seleccion = ope.validarInt();
    }
}
