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

        //se crea un switch para la seleccion de menu
        switch (seleccion){
            case 1:
                System.out.println("Usted ha seleccionado suma");
                ope.ingrese2Numeros();
                linea();
                break;
            case 2:
                System.out.println("Usted ha seleccionado resta");
                ope.ingrese2Numeros();
                linea();
                break;
            case 3:
                System.out.println("Usted ha seleccionado multiplicación");
                ope.ingrese2Numeros();
                linea();
                break;
            case 4:
                System.out.println("Usted ha seleccionado división");
                ope.ingrese2Numeros();
                linea();
                break;
            case 5:
                System.out.println("Usted ha seleccionado elegir el mayor de 2 numeros");
                ope.ingrese2Numeros();
                linea();
                break;
            case 6:
                System.out.println("Usted ha seleccionado potencia de un numero");
                ope.ingreseNumExp();
                linea();
                break;
            case 7:
                salir();
                linea();
                break;
            default:
                System.out.println("La opción ingresada no existe");
                linea();
        }
    }
    //metodo para salir
    private void salir() {
        boolean valido = false;
        int eleccion;
        do {
            System.out.println("¿Desea salir de la calculadora? 1=Sí 0=No");
            eleccion = ope.validarInt();
            switch (eleccion) {
                case 1:
                    Calculadora.seguir = false;//agregar en clase calculadora
                    valido = true;
                    break;
                case 0:
                    valido = true;
                    break;
                default:
                    System.out.println("La opción ingresada no existe");
            }
        } while(!valido);
    }

    //decoracion
    private void linea() {
        System.out.println("------------------------------------------------");
    }
}
